package com.huangbin.user;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 用户信息
 */
@Data
@Getter
@Setter
public class User {
    private Integer id;
    private String userName;
    private String nickName;
    private String password;
    private Integer status;
    private boolean isExist;
}
