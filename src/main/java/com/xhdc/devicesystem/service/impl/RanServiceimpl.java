package com.xhdc.devicesystem.service.impl;

import com.xhdc.devicesystem.dao.RanDao;
import com.xhdc.devicesystem.entity.Ran;
import com.xhdc.devicesystem.service.RanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RanServiceimpl implements RanService {

    @Autowired
    private RanDao ranDao;

    @Override
    public List<Ran> getAllRan() {
        return ranDao.queryRan();
    }

    @Override
    public Ran getRanbyid(int ranId) {
        return ranDao.queryRanbyid(ranId);
    }

    @Override
    public int addRan(Ran ran) {
        return ranDao.insertRan(ran);
    }

    @Override
    public int deleteRan(int ranId) {
        return ranDao.deleteRan(ranId);
    }

    @Override
    public int updateRan(Ran ran) {
        return ranDao.updateRan(ran);
    }

    @Override
    public int getRanNum() {
        return ranDao.getRanNum();
    }
}
