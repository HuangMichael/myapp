package com.huangbin.department;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 部门信息映射类
 */
@Mapper
public interface DepartmentMapper {

    /**
     * @param department
     */
    void add(Department department);


    /**
     * @return
     */
    Department find(Integer id);


    /**
     * @param id
     * @param deptName
     */
    void update(Integer id, String deptName);


    /**
     * @param id
     */
    void delete(Integer id);


    /**
     * @return
     */
    List<Department> findAll();


}
