package com.huangbin.category;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 种类信息映射类
 */
@Mapper
public interface CategoryMapper {

    /**
     * @param category
     * @return
     */
    void add(Category category);


    /**
     * @return
     */
    Category find(Integer id);


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
    List<Category> findAll();


}
