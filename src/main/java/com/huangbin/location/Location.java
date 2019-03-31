package com.huangbin.location;


import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 位置信息
 */
@Data
@AllArgsConstructor
public class Location {
    private Integer id;
    private String locCode;
    private String locName;
    private String status;
}
