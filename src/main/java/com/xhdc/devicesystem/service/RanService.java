package com.xhdc.devicesystem.service;

import com.xhdc.devicesystem.entity.Ran;

import java.util.List;

public interface RanService {

    List<Ran> getAllRan();

    Ran getRanbyid(int ranId);
    int addRan(Ran ran);

    int deleteRan(int ranId);

    int updateRan(Ran ran);

    //查询数据库中测距仪的数量
    int getRanNum();
}
