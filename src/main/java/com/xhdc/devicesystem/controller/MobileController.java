package com.xhdc.devicesystem.controller;


import com.xhdc.devicesystem.entity.Mobile;
import com.xhdc.devicesystem.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@RestController：上一篇中用于将返回值转换成json
//@Controller：现在要返回的是一个页面，所以不能再用@RestController，而用普通的@Controller/


@Controller
@RequestMapping("/device")
public class MobileController{

    @Autowired
    private MobileService mobileService;

    @RequestMapping(value="/getMobile",method= RequestMethod.GET)
    public ModelAndView getMobile()
    {
        List<Mobile> mobileList=mobileService.getAllMobile();
        Map<String,Object> model=new HashMap<String,Object>();
        model.put("moList",mobileList);
        ModelAndView modelAndView=new ModelAndView("tablemobile",model);
        return modelAndView;
    }

    @RequestMapping(value ="mobilemanage",method = RequestMethod.GET)
    public ModelAndView  mobilemanage(Model model)
    {
        List<Mobile> mobileList=mobileService.getAllMobile();
        Map<String,Object> amodel=new HashMap<String,Object>();
        amodel.put("moList",mobileList);
        amodel.put("flag","1");
        ModelAndView modelAndView=new ModelAndView("adddevice",amodel);
        return  modelAndView;
    }

    @RequestMapping(value = "addMobile",method = RequestMethod.POST)
    public ModelAndView addmobile(Mobile mobile, Model model)
    {
            int num = mobileService.addMobile(mobile);

            if (num >= 1) {
                return new ModelAndView("redirect:/device/mobilemanage");
            } else {
                return new ModelAndView("error");
            }

    }

    @RequestMapping(value ="deleteMobile" ,method=RequestMethod.GET)
    public ModelAndView deleteMobile(int mobileId)
    {
        int num=mobileService.deleteMobile(mobileId);

        if(num>=1)
        {
            return new ModelAndView("redirect:/device/mobilemanage");
        }
        else
        {
            return new ModelAndView("error");
        }
    }

    @RequestMapping(value ="getMobileById", method = RequestMethod.GET)
    public ModelAndView getMobileById(int mobileId)
    {
        Mobile mobile=mobileService.getMobileById(mobileId);
        Map<String,Object> model=new HashMap<String, Object>();
        if(mobile!=null)
        {
            model.put("flag","4");
            model.put("cmobile",mobile);
        return new ModelAndView("adddevice",model);
        }
        else
        {
            return new ModelAndView("error");
        }
    }

    @RequestMapping(value="updateMobile",method = RequestMethod.POST)
    public ModelAndView updateMobile(Mobile mobile)
    {
        int num=mobileService.updateMobile(mobile);
        System.out.println("啦啦啦啦啦啦啦");
        if(num>=1)
        {
            return new ModelAndView("redirect:/device/mobilemanage");
        }
        else
        {
            return  new ModelAndView("error");
        }
    }

    @InitBinder
    protected void init(HttpServletRequest request, ServletRequestDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
}
