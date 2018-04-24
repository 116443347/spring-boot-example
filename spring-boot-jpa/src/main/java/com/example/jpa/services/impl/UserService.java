package com.example.jpa.services.impl;

import com.example.jpa.entity.User;
import com.example.jpa.persistence.UserRepository;
import com.example.jpa.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * @author xiaowei.huang
 */
@Component
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User selectById(String id) {
        User user = userRepository.getOne(id);
        return user;
    }

    @Override
    public User updateById(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteById(String id) {
        userRepository.delete(id);
    }
}
