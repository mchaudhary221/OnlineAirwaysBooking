/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlineairways.service;
import com.onlineairways.domain.User;

public interface IUserService {
    public boolean authenticate(User user);
    public boolean register(User user);
}
