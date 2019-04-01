package com.huangbin.user;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户业务类
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    /**
     * @return
     */
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    /**
     * @return
     */
    @Override
    public void add(User user) {

        userMapper.add(user);
    }


    /**
     * @return
     */
    @Override
    public User getOne() {
        return userMapper.getOne();
    }


    /**
     * @param userName
     */
    public void updateUser(String userName) {

        userMapper.updateUser(userName);
    }

    /**
     * @param user
     * @return
     */
    @Override
    public User findByUserNameAndPassword(User user) {
        return userMapper.findByUserNameAndPassword(user);
    }


    /**
     * @return
     */
    @Override
    public User getUserByUserName(String userName) {
        return userMapper.getUserByUserName(userName);
    }




}
