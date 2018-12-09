package com.xhdc.devicesystem.controller;
import com.xhdc.devicesystem.dao.HostDao;
import com.xhdc.devicesystem.dao.MobileDao;
import com.xhdc.devicesystem.dao.SwitchboardDao;
import com.xhdc.devicesystem.service.HostService;
import com.xhdc.devicesystem.service.MobileService;
import com.xhdc.devicesystem.service.RanService;
import com.xhdc.devicesystem.service.SwitchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping("/index")
public class IndexController {
    @Autowired
    private MobileService mobileService;
    @Autowired
    private HostService hostService;
    @Autowired
    private SwitchService switchService;
    @Autowired
    private RanService ranService;

    @RequestMapping(value="/getIndex",method= RequestMethod.GET)
    public ModelAndView index()
    {

        int mobileNum=mobileService.getMobileNum();
        int hostNum=hostService.getHostNum();
        int switchNum=switchService.getSwitchNum();
        int ranNum=ranService.getRanNum();
       // System.out.println(mobileNum+" "+hostNum);
        Map<String,Object> model=new HashMap<>();
        model.put("mobileNum",mobileNum);
        model.put("hostNum",hostNum);
        model.put("switchNum",switchNum);
        model.put("ranNum",ranNum);
        ModelAndView modelAndView=new ModelAndView("index",model);
        return modelAndView;
    }
}
