package com.xhdc.devicesystem.dao;

import com.xhdc.devicesystem.entity.Mobile;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface MobileDao {

    int insertMobile(Mobile mobile);    //因为插入会返回一个受影响的行数，为1

    int deleteMobile(int mobileId);    //删除也会返回一个受影响的行数，不知道是几

    int updateMobile(Mobile mobile);   //更新也会

    List<Mobile> queryMobile();

    Mobile getMobileById(int mobileId);

    int getMobileNum();
}
