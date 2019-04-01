package com.huangbin.user;


import com.huangbin.web.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Log4j2
@RequestMapping(value = "/user")
@Api(value = "用户管理模块")
public class UserController extends BaseController {

    @Autowired
    UserService userService;


    @GetMapping("/users")
    @ResponseBody
    @ApiOperation(value = "查询所有用户", notes = "查询所有用户")
    public List<User> findAll() {
        return userService.findAll();
    }


    @PostMapping(value = "/add")
    @ResponseBody
    @ApiOperation(value = "新增用户信息", notes = "新增用户信息")
    public User add(@RequestBody User user) {
        userService.add(user);
        return user;
    }

    @GetMapping("/getOne")
    @ResponseBody
    @ApiOperation(value = "获取用户信息", notes = "获取一个用户实例")
    public User getOne() {
        return userService.getOne();
    }


    /**
     * 更新用户信息
     */
    @PutMapping("/update")
    @ResponseBody
    @ApiOperation(value = "更新用户", notes = "更新用户姓名")
    public void updateUser(@RequestParam String userName) {
        userService.updateUser(userName);
    }


    /**
     * @param userName
     * @return
     */
    @GetMapping(value = "/get/{userName}")
    @ResponseBody
    @ApiOperation(value = "条件查询用户", notes = "根据用户名查找用户")
    public User getUserByUserName(@PathVariable("userName") String userName) {
        return userService.getUserByUserName(userName);
    }

}
