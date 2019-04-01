package com.huangbin.user;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

/**
 * 用户信息
 */
@Data
public class User {
    private Integer id;
    private String userName;
    private String nickName;
    @JsonIgnore
    private String password;
    private Integer status;
}
