package com.xhdc.devicesystem.controller;

import com.xhdc.devicesystem.entity.User;
import com.xhdc.devicesystem.service.UserService;
import net.minidev.json.JSONObject;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //到注册页面
    @RequestMapping(value ="/register",method = RequestMethod.GET)
    public String addUser()
    {
        /*ModelAndView model=new ModelAndView("register");*/
        return  "register";
    }

    //到主页面
    @RequestMapping(value ="/index")
    public String index()
    {
        /*ModelAndView model=new ModelAndView("register");*/
        return  "register";
    }

    //用户信息更新
    @RequestMapping(value ="updateuser",method = RequestMethod.POST)
    public  ModelAndView updateUser(HttpSession session,HttpServletRequest request,User user)
    {
        System.out.println();
        userService.updateUser(user);
        session.setAttribute("user",user);
        Map<String,Object> model=new HashMap<>();
        model.put("result","success");
        ModelAndView modelAndView=new ModelAndView("queryuser",model);
        return modelAndView;
    }

    //根据用户id查寻 ---邓
    @RequestMapping(value ="queryuser")
    public ModelAndView queryUser(HttpSession session)
    {
        User user = (User)session.getAttribute("user");
        ModelAndView mov = new ModelAndView();
        mov.addObject("user",user);
        mov.setViewName("queryuser");
        return mov;
    }

    //登陆
    @RequestMapping(value ="/login",method = RequestMethod.POST)
    public  ModelAndView login(String loginName, String password){
        User user= userService.login(loginName,password);
        Map<String,Object> model=new HashMap<>();
        if(user == null){
            model.put("message","用户名或密码错误!");
            ModelAndView modelAndView=new ModelAndView("login",model);
            return modelAndView;
        }else {
            //将User信息放到Session中 --邓
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            request.getSession().setAttribute("user",user);
            ModelAndView modelAndView=new ModelAndView("redirect:/index/getIndex");
            return modelAndView;
        }
    }
    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public ModelAndView logout(HttpSession session){
        session.removeAttribute("user");
        ModelAndView modelAndView=new ModelAndView("login");
        return modelAndView;
    }

    //注册
    @RequestMapping(value ="/register1",method = RequestMethod.POST)
    public  ModelAndView register1(HttpServletRequest request){
        String loginName = request.getParameter("loginName");
        String realName = request.getParameter("realName");
        String tel = request.getParameter("tel");
        String password = request.getParameter("password");
        Boolean bool = isMobileNO(tel);
        User user1 = userService.queryLoginName(loginName);
        User user2 = userService.queryTel(tel);
        Map<String,Object> model=new HashMap<>();
        if(bool != true){
            model.put("message2","手机号格式有误!");
            ModelAndView modelAndView=new ModelAndView("register",model);
            return modelAndView;
        }
        if(user1 != null){
            model.put("message1","用户名已存在!");
            ModelAndView modelAndView=new ModelAndView("register",model);
            return modelAndView;
        }
        if(user2 != null){
            model.put("message2","手机号已存在!");
            ModelAndView modelAndView=new ModelAndView("register",model);
            return modelAndView;
        }
        Integer userid = userService.insertUser(loginName,realName,tel,password);
        if(userid == null){
            model.put("message","注册失败!");
            ModelAndView modelAndView=new ModelAndView("register",model);
            return modelAndView;
        }else {
//            User user = userService.queryUserById(userid);
//            model.put("user",user);
            ModelAndView modelAndView=new ModelAndView("login");
            return modelAndView;
        }
    }

    //验证手机号格式
    public static boolean isMobileNO(String mobiles){
        String regex = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\d{8}$";
        if(mobiles.length() != 11){
            return false;
        }else {
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(mobiles);
            return m.matches();
        }
    }
}
