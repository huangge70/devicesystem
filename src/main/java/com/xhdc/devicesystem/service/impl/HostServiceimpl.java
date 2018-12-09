package com.xhdc.devicesystem.service.impl;

import com.xhdc.devicesystem.dao.HostDao;
import com.xhdc.devicesystem.entity.Host;
import com.xhdc.devicesystem.service.HostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HostServiceimpl implements HostService {

    @Autowired
    private HostDao hostDao;

    @Override
    public List<Host> getAllHost() {
        return hostDao.queryHost();
    }

    @Override
    public int addHost(Host host) {
        return hostDao.insertHost(host);
    }

    @Override
    public int deleteHost(int hostId) {
        return hostDao.deleteHost(hostId);
    }

    @Override
    public int updateHost(Host host) {
        return hostDao.updateHost(host);
    }

    @Override
    public Host getHostById(int hostId) {
        return hostDao.getHostById(hostId);
    }

    @Override
    public int getHostNum() {
        return hostDao.getHostNum();
    }
}
