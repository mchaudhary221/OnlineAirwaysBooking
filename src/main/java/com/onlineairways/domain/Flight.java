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
public class Flight {
    private int flightId;
    private FlightType flightType;
    private String fromDestination;
    private String toDestination;
    private Date arrivalDate;
    private Date departureDate;
    private int duration;
    private String flightName;
    private BookingClass bookingClass;

    public int getFlightId() {
        return flightId;
    }

    public Flight(FlightType flightType, String fromDestination, String toDestination, Date arrivalDate, Date departureDate, int duration, String flightName, BookingClass bookingClass) {
        this.flightType = flightType;
        this.fromDestination = fromDestination;
        this.toDestination = toDestination;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.duration = duration;
        this.flightName = flightName;
        this.bookingClass = bookingClass;
    }


    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public FlightType getFlightType() {
        return flightType;
    }

    public void setFlightType(FlightType flightType) {
        this.flightType = flightType;
    }

    public String getFromDestination() {
        return fromDestination;
    }

    public void setFromDestination(String fromDestination) {
        this.fromDestination = fromDestination;
    }

    public String getToDestination() {
        return toDestination;
    }

    public void setToDestination(String toDestination) {
        this.toDestination = toDestination;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    
    public Flight() {
    }

    public BookingClass getBookingClass() {
        return bookingClass;
    }

    public void setBookingClass(BookingClass bookingClass) {
        this.bookingClass = bookingClass;
    }
    
    
}
