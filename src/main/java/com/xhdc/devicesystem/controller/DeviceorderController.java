package com.xhdc.devicesystem.controller;

import com.xhdc.devicesystem.entity.*;
import com.xhdc.devicesystem.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequestMapping("/deviceorder")
public class DeviceorderController {
    @Autowired
    private DeviceorderService deviceorderService;
    @Autowired
    private MobileService mobileService;
    @Autowired
    private HostService hostService;
    @Autowired
    private SwitchService switchService;
    @Autowired
    private RanService ranService;

    @RequestMapping(value="/insertOrder",method= RequestMethod.GET)
    public ModelAndView insertOrder(HttpSession session,@RequestParam("deviceId") int deviceID,@RequestParam("deviceNumber") String deviceNumber,@RequestParam("deviceType") String deviceType)
    {
        User user= (User) session.getAttribute("user");
        Deviceorder deviceorder=new Deviceorder();
        deviceorder.setDeviceId(deviceID);
        deviceorder.setDeviceNumber(deviceNumber);
        deviceorder.setUserId(user.getUserId());
        deviceorder.setUserName(user.getRealName());

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date recordOuttime=null;
        try {
            recordOuttime= sdf.parse(sdf.format(new Date()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        deviceorder.setRecordOuttime(recordOuttime);
        deviceorder.setDeviceType(deviceType);
        deviceorderService.insertRecord(deviceorder);

        if(deviceType.equals("mobile")) {
            Mobile mobile = mobileService.getMobileById(deviceID);
            mobile.setMobileStatus("0");
            mobile.setMobileBorrowtime(recordOuttime);
            mobile.setMobileLendername(user.getRealName());
            mobile.setMobileLenderphone(user.getTel());
            mobileService.updateMobile(mobile);
            session.setAttribute("result","success");
            return new ModelAndView("redirect:/device/getMobile");
        }
        else if(deviceType.equals("switch")){
            Switchboard switchboard = switchService.getSwitchboardById(deviceID);
            switchboard.setSwitchboardStatus("0");
            switchboard.setSwitchboardBorrowtime(recordOuttime);
            switchboard.setSwitchboardLendername(user.getRealName());
            switchboard.setSwitchboardLendertel(user.getTel());
            switchService.updateSwitch(switchboard);
            session.setAttribute("result","success");
            return new ModelAndView("redirect:/device/getSwitch");
        }else if(deviceType.equals("ran")){
            Ran ran = ranService.getRanbyid(deviceID);
            ran.setRanStatus("0");
            ran.setRanBorrowtime(recordOuttime);
            ran.setRanLendername(user.getRealName());
            ran.setRanLendertel(user.getTel());
            ranService.updateRan(ran);
            session.setAttribute("result","success");
            return new ModelAndView("redirect:/device/getRan");
        } else{
            Host host = hostService.getHostById(deviceID);
            host.setHostStatus("0");
            host.setHostBorrowtime(recordOuttime);
            host.setHostLendername(user.getRealName());
            host.setHostLendertel(user.getTel());
            hostService.updateHost(host);
            session.setAttribute("result","success");
            return new ModelAndView("redirect:/device/getHost");
        }


    }
    @RequestMapping(value = "/queryRecordByUserId",method = RequestMethod.GET)
    public ModelAndView queryRecordByUserId(HttpSession session){
        User user= (User) session.getAttribute("user");
        List<Deviceorder> list=deviceorderService.queryRecordByUserId(user.getUserId());
        Map<String,Object> model=new HashMap<>();
        model.put("records",list);
        ModelAndView modelAndView=new ModelAndView("record",model);
        return modelAndView;
    }
    @RequestMapping(value ="/returnDevice",method = RequestMethod.GET)
    public ModelAndView returnDevice(@RequestParam("recordId") int recordId,@RequestParam("deviceId") int deviceID,@RequestParam("deviceType") String deviceType){
        Deviceorder deviceorder=deviceorderService.getRecordById(recordId);

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date recordIntime=null;
        try {
            recordIntime= sdf.parse(sdf.format(new Date()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(recordIntime);
        deviceorderService.updateDeviceorder(recordId,recordIntime);
        if(deviceType.equals("mobile")){
            Mobile mobile=mobileService.getMobileById(deviceID);
            mobile.setMobileStatus("1");
            mobile.setMobileLendername("");
            mobile.setMobileLenderphone("");
            mobile.setMobileBorrowtime(null);
            mobileService.updateMobile(mobile);
        }else if(deviceType.equals("host")){
            Host host=hostService.getHostById(deviceID);
            host.setHostStatus("1");
            host.setHostLendername("");
            host.setHostLendertel("");
            host.setHostBorrowtime(null);
            hostService.updateHost(host);
        }else if(deviceType.equals("ran")){
            Ran ran=ranService.getRanbyid(deviceID);
            ran.setRanStatus("1");
            ran.setRanLendername("");
            ran.setRanLendertel("");
            ran.setRanBorrowtime(null);
            ranService.updateRan(ran);
        } else{
            Switchboard switchboard=switchService.getSwitchboardById(deviceID);
            switchboard.setSwitchboardStatus("1");
            switchboard.setSwitchboardLendername("");
            switchboard.setSwitchboardLendertel("");
            switchboard.setSwitchboardBorrowtime(null);
            switchService.updateSwitch(switchboard);
        }
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session=request.getSession();
        session.setAttribute("result","success");
        return new ModelAndView("redirect:/deviceorder/queryRecordByUserId");
    }

    @RequestMapping(value = "/queryRecord",method = RequestMethod.GET)
    public ModelAndView queryRecord(HttpSession session){
        User user= (User) session.getAttribute("user");
        Map<String,Object> model=new HashMap<>();
        System.out.println(user.getRoleId());
        if(user.getRoleId()==1){
            List<Deviceorder> list=deviceorderService.queryRecord();
            model.put("records",list);
            ModelAndView modelAndView=new ModelAndView("allrecord",model);
            return modelAndView;
        }else{
            session.setAttribute("result","fail");
            return new ModelAndView("redirect:/index/getIndex");
        }
    }

}
