package com.huangbin.user;


import com.huangbin.web.BaseController;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Log4j2
@RequestMapping(value = "/user")
public class UserController extends BaseController {

    @Autowired
    UserService userService;


    @GetMapping("/users")
    @ResponseBody
    public List<User> findAll() {
        return userService.findAll();
    }


    @RequestMapping("/getOne")
    @ResponseBody
    public User getOne() {
        return userService.getOne();
    }


    @RequestMapping("/update")
    @ResponseBody
    public void updateUser() {
        userService.updateUser("liyao");
    }


    @GetMapping(value = "/get/{userName}")
    @ResponseBody
    public User getUserByUserName(@PathVariable("userName") String userName) {
        return userService.getUserByUserName(userName);
    }

}
