package com.xhdc.devicesystem.service.impl;

import com.xhdc.devicesystem.entity.User;
import com.xhdc.devicesystem.service.UserService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired
    private UserService userService;
    @Test
    public void insertUser() {
        User user = new User();
        user.setLoginName("wowo");
        userService.insertUser("caicaicai","1111","1234567","121");
    }

    @Test
    @Ignore
    public void updateUser() {
    }

    @Test
    public void queryUserById() {
        User user = userService.queryUserById(4);
        System.out.println("打印打印打印"+user.getLoginName());
        //assertEquals("cai",user.getLoginName());
    }

    @Test
    public void login() {
        User user = userService.login("cai","11");
        System.out.println("打印打印打印"+user.getUserId());
        //assertEquals("cai",user.getLoginName());
    }

}