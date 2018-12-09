package com.xhdc.devicesystem.service.impl;

import com.xhdc.devicesystem.dao.DeviceDao;
import com.xhdc.devicesystem.entity.Device;
import com.xhdc.devicesystem.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceServiceimpl implements DeviceService {

    @Autowired
    private DeviceDao deviceDao;


    @Override
    public List<Device> getAllDevice() {

        return  deviceDao.queryDevice();

    }

    @Override
    public List<Device> getDeviceByType(String deviceType) {

        return deviceDao.queryDeviceByDeviceType(deviceType);
    }

    @Override
    public int addDevice(Device device) {

        return deviceDao.insertDevice(device);

    }

    @Override
    public int deleteDevice(int deviceId) {

        return deviceDao.deleteDevice(deviceId);

    }

    @Override
    public int updateDevice(Device device) {

        return deviceDao.updateDevice(device);

    }
}
