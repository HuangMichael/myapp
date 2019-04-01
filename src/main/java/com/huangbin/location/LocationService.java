package com.huangbin.location;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 */
@Transactional
@Service
public interface LocationService {
    /**
     * @return
     */
    void add(Location location);


    /**
     * @return
     */
    Location find(Integer id);

    /**
     * @param locName
     */
    Location update(String locName);


    /**
     * @param id
     */
    void delete(Integer id);


    /**
     * @param id
     * @param locName
     */
    void updateLocName(Integer id, String locName);


    /**
     * @return
     */
    List<Location> findAll();
}
