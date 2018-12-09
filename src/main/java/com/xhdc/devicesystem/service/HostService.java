package com.xhdc.devicesystem.service;

import com.xhdc.devicesystem.entity.Host;
import com.xhdc.devicesystem.entity.Mobile;

import java.util.List;

public interface HostService {
    List<Host> getAllHost();
    int addHost(Host host);
    int deleteHost(int hostId);
    int updateHost(Host host);
    Host getHostById(int hostId);
    int getHostNum();
}
