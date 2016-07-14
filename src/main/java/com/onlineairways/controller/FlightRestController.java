/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlineairways.controller;

import com.onlineairways.domain.Flight;
import com.onlineairways.service.impl.FlightListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author mukesh
 */
@Controller
@RequestMapping("/rest")
public class FlightRestController {

    @Autowired
    FlightListService serv;

    @RequestMapping(value = "/flightdetails/{fid}", method = RequestMethod.GET)
    public @ResponseBody
    String list(@PathVariable(value = "fid") String flightid) {
        StringBuilder sb = new StringBuilder();
        Flight fl = serv.getById(Integer.parseInt(flightid));
        sb.append("{");
        sb.append("\"flightname\" : ").append("\"").append(fl.getFlightName()).append("\"").append(",");
        sb.append("\"from\" : ").append("\"").append(fl.getFromDestination()).append("\"");
        sb.append("}");
        return sb.toString();
    }
}
