/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlineairways.repository;

import com.onlineairways.domain.User;

/**
 *
 * @author mukesh
 */
public interface IUserRepository extends IRepository<User> {
    User getuserByName(String userName);
}
