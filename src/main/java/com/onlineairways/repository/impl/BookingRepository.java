/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlineairways.repository.impl;

import com.onlineairways.domain.Booking;
import com.onlineairways.domain.Flight;
import com.onlineairways.domain.PassengerInfo;
import com.onlineairways.domain.User;
import com.onlineairways.repository.IBookingRepository;
import com.onlineairways.repository.db.ConnectionManager;
import com.onlineairways.repository.db.StatementBuilder;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mukesh
 */
@Repository
public class BookingRepository implements IBookingRepository {
    private Map<String,Booking> booking;
    

    @Override
    public boolean create(Booking obj) {
        boolean result = false;
        try {
            int rs = ConnectionManager.executeUpdate(StatementBuilder.createBooking(obj.getUser().getUserId(), obj.getFlight().getFlightId(),
                    obj.getpInfo().getInfoId(), obj.getBookingDate()));
            if (rs > 0) {
                result = true;
            }
        } catch (Exception ex) {
            result = false;
            System.out.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public Booking read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Booking obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Booking obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Booking> readAll() {
        List<Booking> results = new ArrayList<>();
        try {
            ResultSet rs = null;//ConnectionManager.executeQuery(StatementBuilder.getAllBookings());
            while (rs.next()) {
                Booking booking = new Booking();
                User user = new User();
                Flight flight = new Flight();
                PassengerInfo info = new PassengerInfo();
                booking.setBookingId(rs.getInt("bookingid"));
                user.setUserId(rs.getInt("uid"));
                flight.setFlightId(rs.getInt("fid"));
                info.setInfoId(rs.getInt("pinfoid"));
                booking.setUser(user);
                booking.setFlight(flight);
                booking.setpInfo(info);
                results.add(booking);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return results;
    }

}
