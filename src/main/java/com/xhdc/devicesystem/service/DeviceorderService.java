package com.xhdc.devicesystem.service;

import com.xhdc.devicesystem.entity.Deviceorder;
import com.xhdc.devicesystem.entity.Mobile;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface DeviceorderService {
    int insertRecord(Deviceorder deviceorder);
    int updateMobile(Mobile mobile);
    List<Deviceorder> queryRecordByUserId(int userId);
    Deviceorder getRecordById(int recordId);
    int updateDeviceorder(@Param("recordId")int recordId, @Param("recordIntime")Date recordIntime);
    List<Deviceorder> queryRecord();
}
