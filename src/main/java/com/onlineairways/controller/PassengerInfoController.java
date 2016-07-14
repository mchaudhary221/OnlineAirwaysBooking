/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlineairways.controller;

import com.onlineairways.domain.Flight;
import com.onlineairways.domain.PassengerInfo;
import com.onlineairways.domain.User;
import com.onlineairways.service.impl.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ayush
 */
@Controller
public class PassengerInfoController {
    
    @Autowired
    PassengerService service;
    
//    @RequestMapping("/passengerInfo")
//    public String getPassenger(Model model){
//        PassengerInfo passenger=new PassengerInfo();
//        model.addAttribute("newPassenger", passenger);
//     return "travellersInfo";
//    }
    
    
//    @RequestMapping(value="/passengerInfo", method=RequestMethod.POST)
//    public String processPassenger(Model model,@ModelAttribute("newPassenger") PassengerInfo passenger,Flight flight){
//         service.addPassenger(passenger);
//         model.addAttribute("passenger", passenger);
//         model.addAttribute("flight", flight);
//         return "passengerDetails";
//    }
  

}
