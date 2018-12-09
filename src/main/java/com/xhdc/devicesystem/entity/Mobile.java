package com.xhdc.devicesystem.entity;

import java.util.Date;

public class Mobile {
    private Integer mobileId;
    private String mobileBrand;
    private String mobileMemory;
    private String mobileScreensize;
    private String mobilePrice;
    private Date mobileStoragetime;
    private String mobileStatus;
    private String mobileLendername;
    private String mobileLenderphone;
    private Date mobileBorrowtime;

    public String getMobileLenderphone() {
        return mobileLenderphone;
    }

    public void setMobileLenderphone(String mobileLenderphone) {
        this.mobileLenderphone = mobileLenderphone;
    }

    public String getMobileLendername() {
        return mobileLendername;
    }

    public void setMobileLendername(String mobileLendername) {
        this.mobileLendername = mobileLendername;
    }



    public Integer getMobileId() {
        return mobileId;
    }

    public void setMobileId(Integer mobileId) {
        this.mobileId = mobileId;
    }

    public String getMobileBrand() {
        return mobileBrand;
    }

    public void setMobileBrand(String mobileBrand) {
        this.mobileBrand = mobileBrand;
    }

    public String getMobileMemory() {
        return mobileMemory;
    }

    public void setMobileMemory(String mobileMemory) {
        this.mobileMemory = mobileMemory;
    }

    public String getMobileScreensize() {
        return mobileScreensize;
    }

    public void setMobileScreensize(String mobileScreensize) {
        this.mobileScreensize = mobileScreensize;
    }

    public String getMobilePrice() {
        return mobilePrice;
    }

    public void setMobilePrice(String mobilePrice) {
        this.mobilePrice = mobilePrice;
    }

    public Date getMobileStoragetime() {
        return mobileStoragetime;
    }

    public void setMobileStoragetime(Date mobileStoragetime) {
        this.mobileStoragetime = mobileStoragetime;
    }

    public String getMobileStatus() {
        return mobileStatus;
    }

    public void setMobileStatus(String mobileStatus) {
        this.mobileStatus = mobileStatus;
    }



    public Date getMobileBorrowtime() {
        return mobileBorrowtime;
    }

    public void setMobileBorrowtime(Date mobileBorrowtime) {
        this.mobileBorrowtime = mobileBorrowtime;
    }


}