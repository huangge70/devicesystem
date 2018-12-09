package com.xhdc.devicesystem.service;

import com.xhdc.devicesystem.entity.Device;

import java.util.List;

public interface DeviceService {

    List<Device>  getAllDevice();

    List<Device>  getDeviceByType(String deviceType);

    int addDevice(Device device);

    int deleteDevice(int deviceId);

    int updateDevice(Device device);


}
