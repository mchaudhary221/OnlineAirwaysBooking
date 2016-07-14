/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlineairways.service.impl;

import com.onlineairways.domain.User;
import com.onlineairways.repository.IUserRepository;
import com.onlineairways.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mukesh
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserRepository repo;

    public UserServiceImpl() {
    }

    public UserServiceImpl(IUserRepository repo) {
        this.repo = repo;
    }
    
    @Override
    public boolean authenticate(User user) {
        User userWithMatchingName = repo.getuserByName(user.getUserName());
        if (userWithMatchingName != null) {
            return userWithMatchingName.getPassword().equals(user.getPassword());
        }
        return false;
    }

    @Override
    public boolean register(User user) {
        return repo.create(user);   
    }
}
