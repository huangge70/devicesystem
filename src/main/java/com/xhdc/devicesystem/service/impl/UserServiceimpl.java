package com.xhdc.devicesystem.service.impl;

import com.xhdc.devicesystem.dao.UserDao;
import com.xhdc.devicesystem.entity.User;
import com.xhdc.devicesystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public User queryUserById(Integer userId) {
        return userDao.queryUserById(userId);
    }

    @Override
    public Integer insertUser(String loginName,String realName,String tel,String password) {
        User user = new User();
        user.setLoginName(loginName);
        user.setPassword(password);
        user.setTel(tel);
        user.setRealName(realName);
        userDao.insertUser(user);
        return user.getUserId();
    }

    @Override
    public Integer updateUser(User user) {
        return userDao.updateUser(user);
    }

    /*
    * 登录方法
    * */
    @Override
    public User login(String loginname, String password) {

        return userDao.login(loginname,password);
    }

    @Override
    public User queryLoginName(String loginName) {
        return userDao.queryLoginName(loginName);
    }

    @Override
    public User queryTel(String tel) {
        return userDao.queryLoginName(tel);
    }
}
