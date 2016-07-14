/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlineairways.repository.impl;

import com.onlineairways.domain.User;
import com.onlineairways.repository.IUserRepository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mukesh
 */
@Repository
public class UserRepository implements IUserRepository {

    Map<String, User> users;

    public UserRepository() {
        users = new HashMap<>();
        User u1 = new User("bibek", "bibek12345");
        User u2 = new User("mukesh", "mukesh12345");
        users.put(u1.getUserName(), u1);
        users.put(u2.getUserName(), u2);
    }

    @Override
    public User getuserByName(String userName) {
        return users.get(userName);
    }

    @Override
    public boolean create(User user) {
        boolean result;
        if (getuserByName(user.getUserName()) != null) {
            result = false;
        } else {
            users.put(user.getUserName(), user);
            result = true;
        }
        return result;
    }

    @Override
    public List<User> readAll() {
        return new ArrayList(users.values());
    }

    @Override
    public boolean update(User obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(User obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
