package com.xhdc.devicesystem.dao;

import com.xhdc.devicesystem.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
    Integer insertUser(User user);    //因为插入会返回一个受影响的行数，为1

    Integer updateUser(User user);   //更新也会

    User queryUserById(Integer userId);

    User login(@Param("loginname") String loginname, @Param("password") String password);

    User queryLoginName(@Param("loginName") String loginName);

    User queryTel(@Param("tel") String tel);
}
