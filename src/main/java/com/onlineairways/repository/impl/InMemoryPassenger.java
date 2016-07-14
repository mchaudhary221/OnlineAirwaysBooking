/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlineairways.repository.impl;

import com.onlineairways.domain.PassengerInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ayush
 */
@Repository
public class InMemoryPassenger {
    
    
    private List<PassengerInfo> passInfo;

    public InMemoryPassenger() {
        passInfo=new ArrayList<>();
    }
    
    public void addPassenger(PassengerInfo passenger){
      this.passInfo.add(passenger);
    }
    
    public Map<String,String> getCountries(){
        Map<String,String> countries=new LinkedHashMap<>();
        countries.put("NewYork","New York");
        countries.put("LA","LosAngeles");
        return countries;
    }
    
    
}
