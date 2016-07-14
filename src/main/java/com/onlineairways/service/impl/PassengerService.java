/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlineairways.service.impl;

import com.onlineairways.domain.PassengerInfo;
import com.onlineairways.repository.impl.InMemoryPassenger;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ayush
 */
@Service
public class PassengerService {
    @Autowired
    InMemoryPassenger repo;

    public PassengerService() {
    }
    
    public void addPassenger(PassengerInfo passenger){
        repo.addPassenger(passenger);
    }
    
    public Map<String,String> getCountries(){
        Map<String,String> countries=repo.getCountries();
        return countries;
    }
}
