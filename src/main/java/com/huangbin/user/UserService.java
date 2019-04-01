package com.huangbin.user;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
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


    void add(User user);
}
