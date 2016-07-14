/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlineairways.repository;

import java.util.List;

/**
 *
 * @author bibek
 * @param <T>
 */
public interface  IRepository<T> {
    boolean create(T obj);
    T read(int id);
    boolean update(T obj);
    boolean delete(T obj);
    List<T> readAll(); 
}
