package com.huangbin.location;

import org.apache.ibatis.annotations.Mapper;

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


}
