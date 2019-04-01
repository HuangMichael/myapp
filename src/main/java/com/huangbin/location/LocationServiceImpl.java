package com.huangbin.location;

import com.huangbin.user.User;
import com.huangbin.user.UserMapper;
import com.huangbin.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户业务类
 */
@Service
public class LocationServiceImpl implements LocationService {

    @Resource
    LocationMapper locationMapper;


    /**
     * @param location
     * @return
     */
    @Override
    public void add(Location location) {
        locationMapper.add(location);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Location find(Integer id) {
        return locationMapper.find(id);
    }

    /**
     * @param locName
     */
    @Override
    public Location update(String locName) {
        return null;
    }

    /**
     * @param id
     */
    @Override
    public void delete(Integer id) {
        locationMapper.delete(id);
    }

    @Override
    public void updateLocName(Integer id,String locName) {
        locationMapper.updateLocName(id,locName);
    }

    @Override
    public List<Location> findAll() {
        return locationMapper.findAll();
    }
}
