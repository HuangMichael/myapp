package com.huangbin.department;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 种类业务类
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Resource
    DepartmentMapper departmentMapper;


    /**
     * @param department
     * @return
     */
    @Override
    public void add(Department department) {
        departmentMapper.add(department);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Department find(Integer id) {
        return departmentMapper.find(id);
    }

    /**
     */
    @Override
    public void update(Integer id, String deptName) {
        departmentMapper.update(id, deptName);
    }


    /**
     * @param id
     */
    @Override
    public void delete(Integer id) {
        departmentMapper.delete(id);
    }


    @Override
    public List<Department> findAll() {
        return departmentMapper.findAll();
    }
}
