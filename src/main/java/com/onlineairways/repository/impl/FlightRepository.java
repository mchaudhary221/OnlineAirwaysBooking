/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlineairways.repository.impl;

import com.onlineairways.domain.BookingClass;
import com.onlineairways.domain.Flight;
import com.onlineairways.domain.FlightType;
import com.onlineairways.repository.IFlightRepository;
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
public class FlightRepository implements IFlightRepository {
    
    @Override
    public boolean create(Flight obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Flight read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public boolean update(Flight obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public boolean delete(Flight obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public List<Flight> readAll() {
        List<Flight> results = new ArrayList<>();
        try {
            ResultSet rs = null;//ConnectionManager.executeQuery(StatementBuilder.getAllFlights());
            while (rs.next()) {
                Flight flight = new Flight();
                flight.setFlightId(rs.getInt("flightid"));
                flight.setFromDestination(rs.getString("fromdestination"));
                flight.setToDestination(rs.getString("todestination"));
                flight.setArrivalDate(rs.getDate("arrivaldate"));
                flight.setDepartureDate(rs.getDate("departuredate"));
                flight.setDuration(Integer.parseInt(rs.getString("duration")));
                flight.setFlightName(rs.getString("flightname"));
                flight.setBookingClass(BookingClass.valueOf(rs.getString("bookingclass")));
                flight.setFlightType(FlightType.valueOf(rs.getString("flighttype")));
                results.add(flight);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return results;
    }
}
