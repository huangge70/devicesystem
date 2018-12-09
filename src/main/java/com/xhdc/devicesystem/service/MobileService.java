package com.xhdc.devicesystem.service;

import com.xhdc.devicesystem.entity.Device;
import com.xhdc.devicesystem.entity.Mobile;

import java.util.List;

public interface MobileService {
    List<Mobile> getAllMobile();
    int addMobile(Mobile mobile);
    int deleteMobile(int mobileId);
    int updateMobile(Mobile mobile);
    Mobile getMobileById(int mobileId);
    int getMobileNum();
}
