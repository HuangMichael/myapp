package com.huangbin.base;

import lombok.Data;

import java.util.Date;

@Data
public class BaseEntity {
    private Long id;
    private String creator;
    private Date createTime;
    private String status;
}
