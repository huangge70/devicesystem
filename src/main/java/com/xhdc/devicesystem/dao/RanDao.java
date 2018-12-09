package com.xhdc.devicesystem.dao;


import com.xhdc.devicesystem.entity.Ran;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RanDao {

    int insertRan(Ran ran);    //因为插入会返回一个受影响的行数，为1

    int deleteRan(int ranId);    //删除也会返回一个受影响的行数，不知道是几

    int updateRan(Ran ran);   //更新也会

    List<Ran> queryRan();

    Ran queryRanbyid(int ranId);

    int getRanNum();
}
