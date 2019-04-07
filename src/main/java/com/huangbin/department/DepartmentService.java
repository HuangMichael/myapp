package com.huangbin.department;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 部门信息 业务
 */
@Transactional
@Service
public interface DepartmentService {
    /**
     * @return
     */
    void add(Department department);


    /**
     * @return
     */
    Department find(Integer id);

    /**
     * @param locName
     */
    void update(Integer id, String locName);


    /**
     * @param id
     */
    void delete(Integer id);


    /**
     * @return
     */
    List<Department> findAll();
}
