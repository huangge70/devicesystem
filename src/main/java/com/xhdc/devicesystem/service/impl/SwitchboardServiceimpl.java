package com.xhdc.devicesystem.service.impl;

import com.xhdc.devicesystem.dao.SwitchboardDao;
import com.xhdc.devicesystem.entity.Switchboard;
import com.xhdc.devicesystem.service.SwitchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SwitchboardServiceimpl implements SwitchService {

    @Autowired
    private SwitchboardDao switchboardDao;

    @Override
    public List<Switchboard> getAllSwitch() {
        return switchboardDao.querySboard();
    }

    @Override
    public int addSwitch(Switchboard switchboard) {
        return switchboardDao.insertSboard(switchboard);
    }

    @Override
    public int deleteSwitch(int switchboardId) {
        return switchboardDao.deleteSboard(switchboardId);
    }

    @Override
    public int updateSwitch(Switchboard switchboard) {
        return switchboardDao.updateSboard(switchboard);
    }

    @Override
    public Switchboard getSwitchboardById(int switchboardId) {
        return switchboardDao.getSwitchboardById(switchboardId);
    }

    @Override
    public int getSwitchNum() {
        return switchboardDao.getSwitchNum();
    }
}
