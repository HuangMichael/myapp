package com.huangbin.controller;

import com.huangbin.domain.User;
import com.huangbin.service.UserService;
import com.huangbin.utils.ReturnObject;
import com.huangbin.utils.UserUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Log4j2
public class LoginController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/login")
    @ResponseBody
    public ReturnObject login(@RequestParam("userName") String userName, @RequestParam("password") String password) {
        log.info(UserUtil.createUserParam(userName, password).toString());
        User userResult = userService.findByUserNameAndPassword(UserUtil.createUserParam(userName, password));
        return new ReturnObject(userResult != null, "查询成功");
    }
}
