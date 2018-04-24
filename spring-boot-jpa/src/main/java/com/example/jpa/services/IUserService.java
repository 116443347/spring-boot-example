package com.example.jpa.services;

import com.example.jpa.entity.User;

/**
 * @author xiaowei.huang
 */
public interface IUserService {

    User selectById(String id) ;

    User updateById(User user);

    void deleteById(String id);
}
