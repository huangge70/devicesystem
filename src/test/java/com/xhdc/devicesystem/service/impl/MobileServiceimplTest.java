package com.xhdc.devicesystem.service.impl;

import com.xhdc.devicesystem.entity.Mobile;
import com.xhdc.devicesystem.service.MobileService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MobileServiceimplTest {

    @Autowired
    private MobileService mobileService;

    @Test
    public void getAllMobile() {
        List<Mobile>   mobileList=mobileService.getAllMobile();
        assertEquals(3,mobileList.size());
    }

    @Test
    public void addMobile() throws ParseException {
        Mobile mobile=new Mobile();
        mobile.setMobileBrand("小米5");
        mobile.setMobileMemory("3G");
        mobile.setMobileScreensize("6.0");
        mobile.setMobilePrice("2000");
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date adate=dateFormat.parse("2018-10-01");
        mobile.setMobileStoragetime(adate);
        mobile.setMobileStatus("0");
        mobile.setMobileLendername("小黄");
        mobile.setMobileLenderphone("18366665555");
        Date date=new Date();
        mobile.setMobileBorrowtime(date);

        int num=mobileService.addMobile(mobile);
        assertEquals(1,num);


    }

    @Test
    public void deleteMobile() {
        mobileService.deleteMobile(3);
    }

    @Test
    public void updateMobile() throws ParseException {

        Mobile mobile=new Mobile();
        mobile.setMobileId(3);
        mobile.setMobileBrand("小米8");
        mobile.setMobileMemory("6G");
        mobile.setMobileScreensize("6.0");
        mobile.setMobilePrice("20050");
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date adate=dateFormat.parse("2018-10-01");
        mobile.setMobileStoragetime(adate);
        mobile.setMobileStatus("0");
        mobile.setMobileLendername("小黄");
        mobile.setMobileLenderphone("18366665555");
        Date date=new Date();
        mobile.setMobileBorrowtime(date);
        mobileService.updateMobile(mobile);

    }
}