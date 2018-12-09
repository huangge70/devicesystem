package com.xhdc.devicesystem.entity;

import java.util.Date;

public class Switchboard {
    private  Integer switchboardId;
    private  String switchboardBrand;
    private  int switchboardPortnumber;   //端口数
    private  String switchboardInterfacetype;   //接口类型
    private  String switchboardPrice;
    private  Date switchboardStoragetime;
    private  String switchboardStatus;
    private  String switchboardLendername;
    private  String switchboardLendertel;
    private  Date switchboardBorrowtime;

    public String getSwitchboardLendertel() {
        return switchboardLendertel;
    }

    public void setSwitchboardLendertel(String switchboardLendertel) {
        this.switchboardLendertel = switchboardLendertel;
    }

    public Integer getSwitchboardId() {
        return switchboardId;
    }

    public void setSwitchboardId(Integer switchboardId) {
        this.switchboardId = switchboardId;
    }

    public String getSwitchboardBrand() {
        return switchboardBrand;
    }

    public void setSwitchboardBrand(String switchboardBrand) {
        this.switchboardBrand = switchboardBrand;
    }

    public int getSwitchboardPortnumber() {
        return switchboardPortnumber;
    }

    public void setSwitchboardPortnumber(int switchboardPortnumber) {
        this.switchboardPortnumber = switchboardPortnumber;
    }

    public String getSwitchboardInterfacetype() {
        return switchboardInterfacetype;
    }

    public void setSwitchboardInterfacetype(String switchboardInterfacetype) {
        this.switchboardInterfacetype = switchboardInterfacetype;
    }

    public String getSwitchboardPrice() {
        return switchboardPrice;
    }

    public void setSwitchboardPrice(String switchboardPrice) {
        this.switchboardPrice = switchboardPrice;
    }

    public Date getSwitchboardStoragetime() {
        return switchboardStoragetime;
    }

    public void setSwitchboardStoragetime(Date switchboardStoragetime) {
        this.switchboardStoragetime = switchboardStoragetime;
    }

    public String getSwitchboardStatus() {
        return switchboardStatus;
    }

    public void setSwitchboardStatus(String switchboardStatus) {
        this.switchboardStatus = switchboardStatus;
    }

    public String getSwitchboardLendername() {
        return switchboardLendername;
    }

    public void setSwitchboardLendername(String switchboardLendername) {
        this.switchboardLendername = switchboardLendername;
    }

    public Date getSwitchboardBorrowtime() {
        return switchboardBorrowtime;
    }

    public void setSwitchboardBorrowtime(Date switchboardBorrowtime) {
        this.switchboardBorrowtime = switchboardBorrowtime;
    }
}
