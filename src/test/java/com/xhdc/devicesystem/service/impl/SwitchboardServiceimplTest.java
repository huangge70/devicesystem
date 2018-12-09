package com.xhdc.devicesystem.service.impl;


import com.xhdc.devicesystem.entity.Switchboard;
import com.xhdc.devicesystem.service.SwitchService;
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
public class SwitchboardServiceimplTest {

    @Autowired
    private SwitchService switchService;

    @Test
    public void getAllSwitch() {
    }

    @Test
    public void addSwitch() throws ParseException {
        Switchboard switchboard=new Switchboard();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date adate=dateFormat.parse("2018-10-01");
        switchboard.setSwitchboardStoragetime(adate);
        switchboard.setSwitchboardStatus("1");
        switchboard.setSwitchboardInterfacetype("ooo");
        switchboard.setSwitchboardPortnumber(9);

        switchboard.setSwitchboardBrand("huawei");

        switchboard.setSwitchboardPrice("400");

        int num=switchService.addSwitch(switchboard);
        assertEquals(1,num);


    }

    @Test
    public void deleteSwitch() {
    }

    @Test
    public void updateMobile() {
    }
}