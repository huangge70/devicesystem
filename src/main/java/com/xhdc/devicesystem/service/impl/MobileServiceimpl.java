package com.xhdc.devicesystem.service.impl;

import com.xhdc.devicesystem.dao.MobileDao;
import com.xhdc.devicesystem.entity.Mobile;
import com.xhdc.devicesystem.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class MobileServiceimpl implements MobileService {

    @Autowired
    private MobileDao mobileDao;

    @Override
    public List<Mobile> getAllMobile() {
        return mobileDao.queryMobile();
    }

    @Override
    public int addMobile(Mobile mobile) {
        return mobileDao.insertMobile(mobile);
    }

    @Override
    public int deleteMobile(int mobileId) {
        return mobileDao.deleteMobile(mobileId);
    }

    @Override
    public int updateMobile(Mobile mobile) {
        return mobileDao.updateMobile(mobile);
    }

    @Override
    public Mobile getMobileById(int mobileId) {
        return mobileDao.getMobileById(mobileId);
    }

    @Override
    public int getMobileNum() {
        return mobileDao.getMobileNum();
    }
}
