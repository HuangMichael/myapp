package com.huangbin.location;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
