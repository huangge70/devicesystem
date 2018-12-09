package com.xhdc.devicesystem.service;

import com.xhdc.devicesystem.entity.User;

import java.util.List;

public interface UserService {
    User queryUserById(Integer userId);
    Integer insertUser(String loginName, String tel,String realName,String password);
    Integer updateUser(User user);
    User login(String loginname, String password);
    User queryLoginName(String loginName);
    User queryTel(String tel);
}
