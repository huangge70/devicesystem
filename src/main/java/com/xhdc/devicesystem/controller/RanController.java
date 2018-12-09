package com.xhdc.devicesystem.controller;


import com.xhdc.devicesystem.entity.Ran;
import com.xhdc.devicesystem.service.RanService;
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

@Controller
@RequestMapping("/device")
public class RanController {

    @Autowired
    private RanService ranService;

    @RequestMapping(value="/getRan",method= RequestMethod.GET)
    public ModelAndView getRan()
    {
        List<Ran> ranList=ranService.getAllRan();
        Map<String,Object> model=new HashMap<String,Object>();
        model.put("ranList",ranList);
        ModelAndView modelAndView=new ModelAndView("tableran",model);
        return modelAndView;
    }


    @RequestMapping(value ="ranmanage",method = RequestMethod.GET)
    public ModelAndView  ranmanage(Model model)
    {
        List<Ran> ranList=ranService.getAllRan();
        Map<String,Object> amodel=new HashMap<String,Object>();
        amodel.put("ranList",ranList);
        amodel.put("flag","7");
        ModelAndView modelAndView=new ModelAndView("adddevice",amodel);
        return  modelAndView;
    }

    @RequestMapping(value = "addRan",method = RequestMethod.POST)
    public ModelAndView addRan(Ran ran, Model model)
    {

        int num = ranService.addRan(ran);
        if (num >= 1) {
            return new ModelAndView("redirect:/device/ranmanage");
        } else {
            return new ModelAndView("error");
        }

    }

    @RequestMapping(value ="deleteRan" ,method=RequestMethod.GET)
    public ModelAndView deleteRan(int ranId)
    {
        int num=ranService.deleteRan(ranId);

        if(num>=1)
        {
            return new ModelAndView("redirect:/device/ranmanage");
        }
        else
        {
            return new ModelAndView("error");
        }
    }


    @RequestMapping(value ="getRanById", method = RequestMethod.GET)
    public ModelAndView getRanById(int ranId)
    {
        Ran ran=ranService.getRanbyid(ranId);
        Map<String,Object> model=new HashMap<String, Object>();
        if(ran!=null)
        {
            model.put("flag","8");
            model.put("ran",ran);
            return new ModelAndView("adddevice",model);
        }
        else
        {
            return new ModelAndView("error");
        }
    }

    @RequestMapping(value="updateRan",method = RequestMethod.POST)
    public ModelAndView updateRan(Ran ran)
    {
        int num=ranService.updateRan(ran);
        if(num>=1)
        {
            return new ModelAndView("redirect:/device/ranmanage");
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



