package com.xhdc.devicesystem.entity;

import java.util.Date;

public class Deviceorder {
    private Integer recordId;
    private Integer userId;
    private String userName;
    private Integer deviceId;
    private String deviceNumber;
    private Date recordOuttime;
    private Date recordIntime;
    private String deviceType;

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }



    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceNumber() {
        return deviceNumber;
    }

    public void setDeviceNumber(String deviceNumber) {
        this.deviceNumber = deviceNumber;
    }

    public Date getRecordOuttime() {
        return recordOuttime;
    }

    public void setRecordOuttime(Date recordOuttime) {
        this.recordOuttime = recordOuttime;
    }

    public Date getRecordIntime() {
        return recordIntime;
    }

    public void setRecordIntime(Date recordIntime) {
        this.recordIntime = recordIntime;
    }


}
