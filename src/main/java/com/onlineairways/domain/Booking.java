/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlineairways.domain;

import java.util.Date;

/**
 *
 * @author mukesh
 */
public class Booking {
    private User user;
    private int bookingId;
    private Date bookingDate;
    private Flight flight;
    private PassengerInfo pInfo;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public PassengerInfo getpInfo() {
        return pInfo;
    }

    public void setpInfo(PassengerInfo pInfo) {
        this.pInfo = pInfo;
    }
    
}
