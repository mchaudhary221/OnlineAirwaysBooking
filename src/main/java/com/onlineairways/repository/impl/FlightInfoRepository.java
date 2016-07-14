/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlineairways.repository.impl;

import com.onlineairways.domain.BookingClass;
import com.onlineairways.domain.Flight;
import com.onlineairways.domain.FlightInfo;
import com.onlineairways.domain.FlightType;
import com.onlineairways.repository.IFlightInfoRepository;
import com.onlineairways.repository.db.ConnectionManager;
import com.onlineairways.repository.db.StatementBuilder;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mukesh
 */
@Repository
public class FlightInfoRepository implements IFlightInfoRepository {

    @Override
    public boolean create(FlightInfo obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FlightInfo read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(FlightInfo obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(FlightInfo obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<FlightInfo> readAll() {
        List<FlightInfo> results = new ArrayList<>();
        try {
            ResultSet rs = null;//ConnectionManager.executeQuery(StatementBuilder.getAllFlightInfo());
            while (rs.next()) {
                FlightInfo flightinfo = new FlightInfo();
                Flight flight = new Flight();
                flightinfo.setId(rs.getInt("id"));
                flightinfo.setAvailableSeats(rs.getInt("availableseats"));
                flight.setFlightId(rs.getInt("fid"));
                flightinfo.setFlight(flight);
                results.add(flightinfo);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return results;
    }

}
