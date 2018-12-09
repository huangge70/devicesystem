package com.xhdc.devicesystem.service;


import com.xhdc.devicesystem.entity.Switchboard;

import java.util.List;

public interface SwitchService {
    List<Switchboard> getAllSwitch();


    int addSwitch(Switchboard switchboard);

    int deleteSwitch(int switchboardId);

    int updateSwitch(Switchboard switchboard);

    Switchboard getSwitchboardById(int switchboardId);
    int getSwitchNum();
}
