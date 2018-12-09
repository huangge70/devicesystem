package com.xhdc.devicesystem.dao;

import com.xhdc.devicesystem.entity.Deviceorder;
import com.xhdc.devicesystem.entity.Mobile;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface DeviceorderDao {
    int insertRecord(Deviceorder deviceorder);//新增一条借设备的记录
    int updateMobile(Mobile mobile);
    List<Deviceorder> queryRecordByUserId(int userId);
    Deviceorder getRecordById(int recordId);
    int updateDeviceorder(@Param("recordId")int recordId, @Param("recordIntime")Date recordIntime);
    List<Deviceorder> queryRecord();
}
