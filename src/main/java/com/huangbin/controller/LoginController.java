package com.huangbin.controller;

import com.huangbin.user.User;
import com.huangbin.user.UserService;
import com.huangbin.utils.ReturnObject;
import com.huangbin.utils.UserUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class LoginController {

    @Autowired
    UserService userService;

    /**
     * @param userName
     * @param password
     * @return
     */
    @PostMapping(value = "/login")
    @ResponseBody
    public ReturnObject login1(@RequestParam("userName") String userName, @RequestParam("password") String password) {
        log.info(UserUtil.createUserParam(userName, password).toString());
        User userResult = userService.findByUserNameAndPassword(UserUtil.createUserParam(userName, password));
        return new ReturnObject(userResult != null, "查询成功");
    }



}
