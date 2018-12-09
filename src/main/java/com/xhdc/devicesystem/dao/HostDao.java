package com.xhdc.devicesystem.dao;

import com.xhdc.devicesystem.entity.Host;
import com.xhdc.devicesystem.entity.Mobile;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HostDao {


        int insertHost(Host host);    //因为插入会返回一个受影响的行数，为1

        int deleteHost(int hostId);    //删除也会返回一个受影响的行数，不知道是几

        int updateHost(Host host);   //更新也会

        List<Host> queryHost();

        Host getHostById(int hostId);

        int getHostNum();

}
