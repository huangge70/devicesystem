package com.xhdc.devicesystem.entity;

import java.util.Date;

public class Host {
    private  Integer hostId;
    private  String hostBrand;
    private  String hostCpu;
    private  String hostMemory;
    private  String hostStatus;
    private  Date hostStoragetime;
    private  String hostPrice;
    private  String hostLendername;
    private  String hostLendertel;
    private  Date hostBorrowtime;

    public Integer getHostId() {
        return hostId;
    }

    public void setHostId(Integer hostId) {
        this.hostId = hostId;
    }

    public String getHostBrand() {
        return hostBrand;
    }
    public void setHostBrand(String hostBrand) {
        this.hostBrand = hostBrand;
    }


    public Date getHostStoragetime() {
        return hostStoragetime;
    }

    public void setHostStoragetime(Date hostStoragetime) {
        this.hostStoragetime = hostStoragetime;
    }

    public String getHostPrice() {
        return hostPrice;
    }

    public void setHostPrice(String hostPrice) {
        this.hostPrice = hostPrice;
    }

    public Date getHostBorrowtime() {
        return hostBorrowtime;
    }

    public void setHostBorrowtime(Date hostBorrowtime) {
        this.hostBorrowtime = hostBorrowtime;
    }



    public String getHostCpu() {
        return hostCpu;
    }

    public void setHostCpu(String hostCpu) {
        this.hostCpu = hostCpu;
    }

    public String getHostMemory() {
        return hostMemory;
    }

    public void setHostMemory(String hostMemory) {
        this.hostMemory = hostMemory;
    }

    public String getHostStatus() {
        return hostStatus;
    }

    public void setHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
    }


    public String getHostLendername() {
        return hostLendername;
    }

    public void setHostLendername(String hostLendername) {
        this.hostLendername = hostLendername;
    }

    public String getHostLendertel() {
        return hostLendertel;
    }

    public void setHostLendertel(String hostLendertel) {
        this.hostLendertel = hostLendertel;
    }


}
