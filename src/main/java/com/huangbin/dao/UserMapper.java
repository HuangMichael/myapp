package com.huangbin.dao;

import com.huangbin.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户信息映射类
 */
@Mapper
public interface UserMapper {

    /**
     * @return
     */
    List<User> findAll();


    /**
     * @return
     */
    User getOne();


    /**
     * @param userName
     */
    void updateUser(String userName);


    /**
     * @param user
     * @return
     */
    User findByUserNameAndPassword(@Param("user") User user);


    /**
     * @param userName
     * @return
     */
    User getUserByUserName(@Param("userName") String userName);


}
