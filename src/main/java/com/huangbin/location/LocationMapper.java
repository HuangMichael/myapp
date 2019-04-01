package com.huangbin.location;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 位置信息映射类
 */
@Mapper
public interface LocationMapper {

    /**
     * @param location
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
    void update(String locName);


    /**
     * @param id
     */
    void delete(Integer id);

    /**
     * @param locName
     */
    void updateLocName(Integer id, String locName);


    /**
     * @return
     */
    List<Location> findAll();


}
