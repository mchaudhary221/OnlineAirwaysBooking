/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlineairways.domain;

/**
 *
 * @author mukesh
 */
public class PassengerInfo {
    private int infoId;
    private FlightType flight;
    private int passengerCount;

    public int getInfoId() {
        return infoId;
    }

    public void setInfoId(int infoId) {
        this.infoId = infoId;
    }

    public FlightType getFlight() {
        return flight;
    }

    public void setFlight(FlightType flight) {
        this.flight = flight;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }
    
    
}
