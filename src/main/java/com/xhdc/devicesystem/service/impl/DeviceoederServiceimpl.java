package com.xhdc.devicesystem.service.impl;

import com.xhdc.devicesystem.dao.DeviceorderDao;
import com.xhdc.devicesystem.entity.Deviceorder;
import com.xhdc.devicesystem.entity.Mobile;
import com.xhdc.devicesystem.service.DeviceorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DeviceoederServiceimpl implements DeviceorderService {

    @Autowired
    private DeviceorderDao deviceorderDao;
    @Override
    public int insertRecord(Deviceorder deviceorder) {
        return deviceorderDao.insertRecord(deviceorder);
    }

    @Override
    public int updateMobile(Mobile mobile) {
        return deviceorderDao.updateMobile(mobile);
    }

    @Override
    public List<Deviceorder> queryRecordByUserId(int userId) {
        return deviceorderDao.queryRecordByUserId(userId);
    }

    @Override
    public Deviceorder getRecordById(int recordId) {
        return deviceorderDao.getRecordById(recordId);
    }

    @Override
    public int updateDeviceorder(int recordId, Date recordIntime) {
        return deviceorderDao.updateDeviceorder(recordId,recordIntime);
    }

    @Override
    public List<Deviceorder> queryRecord() {
        return deviceorderDao.queryRecord();
    }


}
