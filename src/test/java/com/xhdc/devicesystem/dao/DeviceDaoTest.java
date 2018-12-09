package com.xhdc.devicesystem.dao;

import com.xhdc.devicesystem.entity.Device;
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
public class DeviceDaoTest {

    @Autowired
    private DeviceDao deviceDao;

    @Test
    public void insertDevice() throws ParseException {

        Device device=new Device();
        device.setDeviceNumber("小米8");
        Date date=new Date();
        device.setDeviceStoragetime(date);
        device.setDeviceStorehouse("309实验室");
        device.setDeviceStatus("可借");
        device.setDeviceType("手机");
        device.setDevicePrice("2500");
        device.setDeviceLendername("薛明乾");
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date adate=dateFormat.parse("2018-10-008");
        device.setDeviceBorrowtime(adate);
        device.setDeviceDescrible("设备描述：安卓  雷军开发");

        int num=deviceDao.insertDevice(device);


        assertEquals(1,num);




    }

    @Test
    public void deleteDevice() {
        int a=deviceDao.deleteDevice(1);
        System.out.println(a);

    }

    @Test
    public void updateDevice() throws ParseException {
        Device device=new Device();
        device.setDeviceNumber("小米8");
        Date date=new Date();
        device.setDeviceId(3);
        device.setDeviceStoragetime(date);
        device.setDeviceStorehouse("309实验室");
        device.setDeviceStatus("可借");
        device.setDeviceType("手机");
        device.setDevicePrice("10002");
        device.setDeviceLendername("薛明乾");
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date adate=dateFormat.parse("2018-10-008");
        device.setDeviceBorrowtime(adate);
        device.setDeviceDescrible("设备描述：安卓  雷军开发");

        int  num=deviceDao.updateDevice(device);
        System.out.println(num);

    }

    @Test
    public void queryDevice() {

        List<Device>  deviceList=deviceDao.queryDevice();
        System.out.println(deviceList.size());

    }

    @Test
    public void queryDeviceByDeviceType() {
        List<Device>  deList=deviceDao.queryDeviceByDeviceType("手机");
        System.out.println(deList.size());
    }
}