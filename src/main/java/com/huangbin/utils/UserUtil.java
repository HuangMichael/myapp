package com.huangbin.utils;

import com.huangbin.user.User;

/**
 *
 */
public class UserUtil {


    public static User createUserParam(String userName, String password) {

        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        return user;
    }
}
