package com.xhdc.devicesystem.dao;

import com.xhdc.devicesystem.entity.Switchboard;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SwitchboardDao {


    int insertSboard(Switchboard sboard);    //因为插入会返回一个受影响的行数，为1

    int deleteSboard(int sboardId);    //删除也会返回一个受影响的行数，不知道是几

    int updateSboard(Switchboard sboard);   //更新也会

    List<Switchboard> querySboard();

    Switchboard getSwitchboardById(int switchboardId);

    int getSwitchNum();

}
