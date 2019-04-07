package com.huangbin.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/department")
public class DepartmentController {


    @Autowired
    DepartmentService departmentService;


    /**
     * @param department
     * @return 新增部门
     */
    @PostMapping("/add")
    public Department add(@RequestBody Department department) {
        System.out.println(department.toString());
        departmentService.add(department);
        return department;
    }

    /**
     * @param id id
     * @return 根据ID查找部门
     */
    @GetMapping("/find/{id}")
    @ResponseBody
    public Department find(@PathVariable Integer id) {
        System.out.println(id.toString());
        return departmentService.find(id);
    }

    /**
     * @return 查询所有的部门
     */
    @GetMapping("/departments")
    @ResponseBody
    public List<Department> findAll() {

        return departmentService.findAll();
    }

    /**
     * @param id
     * @return 修改部门
     */
    @PatchMapping("/update/{id}")
    @ResponseBody
    public Department update(@PathVariable Integer id, @RequestBody String deptName) {
        departmentService.update(id, deptName);
        return null;
    }

    /**
     * @param id id
     * @return 根据ID查找部门
     */
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        departmentService.delete(id);
    }

}
