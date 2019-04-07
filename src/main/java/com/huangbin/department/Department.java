package com.huangbin.department;

import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 部门信息
 */
@Data
@NoArgsConstructor
public class Department {
    private Integer id;
    private String deptCode;
    private String deptName;
    private Long parentId;
    private String status;


    public Department(Integer id, String deptCode, String deptName, Long parentId, String status) {
        this.id = id;
        this.deptCode = deptCode;
        this.deptName = deptName;
        this.parentId = parentId;
        this.status = status;
    }

}