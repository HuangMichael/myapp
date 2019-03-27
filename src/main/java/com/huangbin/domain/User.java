package com.huangbin.domain;


import lombok.Data;

@Data
public class User {
    private Integer id;
    private String userName;
    private String nickName;
    private String cnName;
    private String password;
    private String uid;
    private String headUrl;
    private Integer status;
}
