package com.xhdc.devicesystem.controller;

import com.xhdc.devicesystem.entity.Host;
import com.xhdc.devicesystem.service.HostService;
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
public class HostController {
    @Autowired
    private HostService hostService;

    @RequestMapping(value = "/getHost",method = RequestMethod.GET)
    public ModelAndView  getHost()
    {
        List<Host> hostList=hostService.getAllHost();
        Map<String,Object> model=new HashMap<String,Object>();
        System.out.println(hostList.size());
        model.put("hoList",hostList);
        ModelAndView modelAndView=new ModelAndView("tablehost",model);
        return  modelAndView;
    }

    @RequestMapping(value ="hostmanage",method = RequestMethod.GET)
    public ModelAndView  hostmanage(Model model)
    {
        List<Host> hostList=hostService.getAllHost();
        Map<String,Object> amodel=new HashMap<String,Object>();
        amodel.put("hoList",hostList);
        amodel.put("flag","2");
        ModelAndView modelAndView=new ModelAndView("adddevice",amodel);
        return  modelAndView;
    }

    @RequestMapping(value = "addHost",method = RequestMethod.POST)
    public ModelAndView addHost(Host host)
    {
        int num=hostService.addHost(host);

        if (num >= 1) {
            return new ModelAndView("redirect:/device/hostmanage");
        } else {
            return new ModelAndView("error");
        }

    }
 @RequestMapping(value ="deleteHost",method = RequestMethod.GET)
    public ModelAndView deleteHost(int hostId)
    {
        int num=hostService.deleteHost(hostId);

        if(num>=1)
        {
            return new ModelAndView("redirect:/device/hostmanage");
        }
        else
        {
            return new ModelAndView("error");
        }
    }

    @RequestMapping(value = "getHostById",method = RequestMethod.GET)
    public  ModelAndView getHostById(int hostId)
    {
        Host host=hostService.getHostById(hostId);

        if(host!=null) {
            Map<String, Object> hmodel = new HashMap<String, Object>();
            hmodel.put("flag", "5");
            hmodel.put("host", host);
            return  new ModelAndView("adddevice",hmodel);
        }
        else
        {
            return new ModelAndView("error");
        }


    }

    @RequestMapping(value = "updateHost",method = RequestMethod.POST)
    public ModelAndView updateHost(Host host)
    {
        int num=hostService.updateHost(host);

        if(num>=1)
        {
            return new ModelAndView("redirect:/device/hostmanage");
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
