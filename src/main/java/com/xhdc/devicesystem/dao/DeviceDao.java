package com.xhdc.devicesystem.dao;

import com.xhdc.devicesystem.entity.Device;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface DeviceDao {

    int insertDevice(Device device);    //因为插入会返回一个受影响的行数，为1

    int deleteDevice(int deviceId);    //删除也会返回一个受影响的行数，不知道是几

    int updateDevice(Device device);   //更新也会

    List<Device> queryDevice();

    List<Device> queryDeviceByDeviceType(String deviceType);

}
