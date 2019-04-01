package com.huangbin.category;


import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 种类信息
 */
@Data
@AllArgsConstructor
public class Category {
    private Integer id;
    private String catCode;
    private String catName;
    private String status;
}
