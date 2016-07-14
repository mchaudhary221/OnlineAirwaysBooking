/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlineairways.controller;

import com.onlineairways.domain.FlightDomain;
import com.onlineairways.service.impl.FlightListService;
import com.onlineairways.service.impl.PassengerService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Administrator
 */
@Controller
public class BookingController {

    @Autowired
    FlightListService serv;

    @Autowired
    PassengerService service;

    @RequestMapping("/")
    public String list(Model m) {
        m.addAttribute("flightlist", serv.getinfo());
        return "flightList";
    }

    @RequestMapping(value = "/booking", method = RequestMethod.GET)
    public String booking(Model model) {
        FlightDomain domain = new FlightDomain();
        model.addAttribute("searchInfo", domain);
        model.addAttribute("countries", service.getCountries());
        Map<Integer, Integer> counts = new LinkedHashMap<>();
        for (int i = 0; i < 11; i++) {
            counts.put(i, i);
        }
        model.addAttribute("counter", counts);
        return "booking";
    }

    @RequestMapping(value = "/booking", method = RequestMethod.POST)
    public String start(Model model) {
        return "";
    }

    @RequestMapping(value = "/bookflight/{fid}&{pcount}", method = RequestMethod.GET)
    public String book(@PathVariable("fid") String flightid, @PathVariable("pcount") String pcount, HttpServletRequest request, RedirectAttributes rda) {
        if (request.getSession().getAttribute("user") == null) {
            rda.addFlashAttribute("flightid", flightid);
            rda.addFlashAttribute("pcount", pcount);
            return "redirect:/bookingconfirmation";
        } else {
            return "redirect:/register";
        }
    }
    

    @RequestMapping(value = "/bookingconfirmation", method = RequestMethod.GET)
    public String book(Model model, RedirectAttributes rda) {
        List<Object> result = new ArrayList<>();
        Map<String, ?> rdas = rda.getFlashAttributes();
        result.add(rdas.get("flightid"));
        result.add(rdas.get("pcount"));
        model.addAttribute("resultdata", "bibek");
        return "bookingconfirmation";
    }
    
    @RequestMapping(value = "/confirm/{fid}&{pcount}", method = RequestMethod.POST)
    public String book(@PathVariable("fid") String flightid, @PathVariable("pcount") String pcount) {
        return "";
    }
    
    //confirm

}
