package com.xhdc.devicesystem.entity;

import java.util.Date;

public class Device {

    private  Integer deviceId;
    private  String deviceNumber;
    private  Date deviceStoragetime;
    private  String deviceStorehouse;
    private  String deviceStatus;
    private  String deviceType;
    private  String devicePrice;
    private  String deviceLendername;
    private  Date  deviceBorrowtime;

    public String getDeviceDescrible() {
        return deviceDescrible;
    }

    public void setDeviceDescrible(String deviceDescrible) {
        this.deviceDescrible = deviceDescrible;
    }

    private  String deviceDescrible;


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

    public Date getDeviceStoragetime() {
        return deviceStoragetime;
    }

    public void setDeviceStoragetime(Date deviceStoragetime) {
        this.deviceStoragetime = deviceStoragetime;
    }

    public String getDeviceStorehouse() {
        return deviceStorehouse;
    }

    public void setDeviceStorehouse(String deviceStorehouse) {
        this.deviceStorehouse = deviceStorehouse;
    }

    public String getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDevicePrice() {
        return devicePrice;
    }

    public void setDevicePrice(String devicePrice) {
        this.devicePrice = devicePrice;
    }

    public String getDeviceLendername() {
        return deviceLendername;
    }

    public void setDeviceLendername(String deviceLendername) {
        this.deviceLendername = deviceLendername;
    }

    public Date getDeviceBorrowtime() {
        return deviceBorrowtime;
    }

    public void setDeviceBorrowtime(Date deviceBorrowtime) {
        this.deviceBorrowtime = deviceBorrowtime;
    }













}
