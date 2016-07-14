/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlineairways.repository;

import com.onlineairways.domain.Flight;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ayush
 */
@Repository
public class InMem {
    
    private List<Flight> info;

    public InMem() {
        Flight flight1=new Flight();
         Flight flight2=new Flight();
       info=new ArrayList<>();
       flight1.setFlightId(22);
        flight1.setFlightName("chicagoAir");
        flight1.setFromDestination("newyork");
        flight1.setToDestination("chicago");
        flight1.setDepartureDate(new Date(2/2/2016));
        flight1.setDuration(6);
        flight2.setFlightName("newyorkAir");
        flight2.setFromDestination("chicago");
        flight2.setToDestination("newyork");
        flight2.setToDestination("chicago");
        flight2.setDepartureDate(new Date(2/2/2016));
        flight2.setDuration(7);
         flight1.setFlightId(11);
//        flight.setFlightName("yetiAir");
//        flight.setFlightName("jetAir");
        info.add(flight1);
        info.add(flight2);
    }
    public List<Flight> getInfo(){
       return info;
    }
    
    public Flight getById(int fid){
        return info.get(0);
    }
}
