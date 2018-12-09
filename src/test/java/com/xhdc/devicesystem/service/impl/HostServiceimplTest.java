package com.xhdc.devicesystem.service.impl;

import com.xhdc.devicesystem.entity.Host;
import com.xhdc.devicesystem.service.HostService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class HostServiceimplTest {

    @Autowired
    private HostService hostService;

    @Test
    public void getAllHost() {
    }

    @Test
    public void addHost() throws ParseException {
        Host host=new Host();
        host.setHostBrand("苹果");
        host.setHostCpu("i4");
        host.setHostMemory("2G");
        host.setHostStatus("0");
        host.setHostPrice("4000");

        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date adate=dateFormat.parse("2018-10-01");
        host.setHostStoragetime(adate);


        hostService.addHost(host);





    }

    @Test
    public void deleteHost() {
    }

    @Test
    public void updateHost() {
    }
}