package com.huangbin.service;


import com.huangbin.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface UserService {
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
    User findByUserNameAndPassword(User user);


    /**
     * @param userName
     * @return
     */
    User getUserByUserName(String userName);
}
