package com.xhdc.devicesystem.controller;

import com.xhdc.devicesystem.entity.Switchboard;
import com.xhdc.devicesystem.service.SwitchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
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

@Controller
@RequestMapping("/device")
public class SwitchController {

    @Autowired
    SwitchService switchService;

    @RequestMapping(value="/getSwitch",method= RequestMethod.GET)
    public ModelAndView getSwitch()
    {
        List<Switchboard> switchList=switchService.getAllSwitch();
        Map<String,Object> model=new HashMap<String,Object>();
        model.put("swList",switchList);
        ModelAndView modelAndView=new ModelAndView("tableswitch",model);
        return modelAndView;
    }

    @RequestMapping(value = "switchmanage", method = RequestMethod.GET)
    public  ModelAndView switchmanage()
    {
        List<Switchboard> switchList=switchService.getAllSwitch();
        Map<String,Object>  model=new HashMap<String, Object>();
        model.put("swList",switchList);
        model.put("flag","3");
        ModelAndView modelAndView=new ModelAndView("adddevice",model);
        return  modelAndView;

    }

   @RequestMapping(value = "addSwitch",method = RequestMethod.POST)
    public ModelAndView addSwitch(Switchboard switchboard)
    {
        int num=switchService.addSwitch(switchboard);

        if (num >= 1) {
            return new ModelAndView("redirect:/device/switchmanage");
        } else {
            return new ModelAndView("error");
        }
    }

    @RequestMapping(value = "deleteSwitch", method = RequestMethod.GET)
    public ModelAndView deleteSwitch(int switchId)
    {
        int num=switchService.deleteSwitch(switchId);
        if(num>=1)
        {
            return new ModelAndView("redirect:/device/switchmanage");
        }
        else
        {
            return new ModelAndView("error");
        }
    }

    @RequestMapping(value = "getSwitchById",method = RequestMethod.GET)
    public ModelAndView getSwitchById(int switchId)
    {
        Switchboard switchboard=switchService.getSwitchboardById(switchId);
        Map<String,Object> model=new HashMap<String, Object>();

        if(switchboard!=null)
        {
            model.put("flag","6");
            model.put("switchb",switchboard);

            return new ModelAndView("adddevice",model);
        }
        else
        {
            return new ModelAndView("error");
        }
    }

    @RequestMapping(value ="updateSwitch",method = RequestMethod.POST)
    public ModelAndView updateSwitch(Switchboard switchboard)
    {
        int num=switchService.updateSwitch(switchboard);

        if(num>=1)
        {
            return new ModelAndView("redirect:/device/switchmanage");
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
