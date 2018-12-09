package com.xhdc.devicesystem.entity;

import java.util.Date;

public class Ran {     //测距仪实体类
    private  Integer ranId;
    private  String ranBrand;
    private  float ranAccuracy;
    private  double ranDistance;
    private  String ranMethod;
    private  String ranPrice;
    private  String ranStatus;
    private Date ranStoragetime;
    private String ranLendername;
    private  String ranLendertel;
    private  Date ranBorrowtime;

    public Integer getRanId() {
        return ranId;
    }

    public void setRanId(Integer ranId) {
        this.ranId = ranId;
    }

    public String getRanBrand() {
        return ranBrand;
    }

    public void setRanBrand(String ranBrand) {
        this.ranBrand = ranBrand;
    }

    public float getRanAccuracy() {
        return ranAccuracy;
    }

    public void setRanAccuracy(float ranAccuracy) {
        this.ranAccuracy = ranAccuracy;
    }

    public double getRanDistance() {
        return ranDistance;
    }

    public void setRanDistance(double ranDistance) {
        this.ranDistance = ranDistance;
    }

    public String getRanMethod() {
        return ranMethod;
    }

    public void setRanMethod(String ranMethod) {
        this.ranMethod = ranMethod;
    }

    public String getRanPrice() {
        return ranPrice;
    }

    public void setRanPrice(String ranPrice) {
        this.ranPrice = ranPrice;
    }

    public String getRanStatus() {
        return ranStatus;
    }

    public void setRanStatus(String ranStatus) {
        this.ranStatus = ranStatus;
    }

    public Date getRanStoragetime() {
        return ranStoragetime;
    }

    public void setRanStoragetime(Date ranStoragetime) {
        this.ranStoragetime = ranStoragetime;
    }

    public String getRanLendername() {
        return ranLendername;
    }

    public void setRanLendername(String ranLendername) {
        this.ranLendername = ranLendername;
    }

    public String getRanLendertel() {
        return ranLendertel;
    }

    public void setRanLendertel(String ranLendertel) {
        this.ranLendertel = ranLendertel;
    }

    public Date getRanBorrowtime() {
        return ranBorrowtime;
    }

    public void setRanBorrowtime(Date ranBorrowtime) {
        this.ranBorrowtime = ranBorrowtime;
    }
}
