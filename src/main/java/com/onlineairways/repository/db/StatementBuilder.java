/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlineairways.repository.db;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class StatementBuilder {

    public static String createUser(String userName, String password, String email, String phone, String firstName, String lastName) {
        String query = String.format("INSERT INTO user(username,password,email,phone,firstname,lastname) values ('%s','%s','%s','%s','%s','%s')", userName, password, email, phone, firstName, lastName);
        return query;
    }

    public static String createPassengerInfo(String flightType, int passengerCount) {
        String query = String.format("INSERT INTO passengerinfo(flighttype, passengercount) values ('%s', %s)", flightType, passengerCount);
        return query;
    }

    public static String createBooking(int userId, int flightId, int passegerInfoId, Date bookingDate) {
        String query = String.format("INSERT INTO booking(uid, fid, pinfoid, bookingdate) values (%s, %s, %s, %s)", userId, flightId, passegerInfoId, bookingDate);
        return query;
    }

    public static String getAllUsers() {
        String query = String.format("SELECT * from user");
        return query;
    }

    public static String getAllPassengerInfo() {
        String query = String.format("SELECT * from passengerinfo");
        return query;
    }

    public static String getAllFlights() {
        String query = String.format("SELECT * from flight");
        return query;
    }

    public static String getAllFlightInfo() {
        String query = String.format("SELECT * from flightinfo");
        return query;
    }

    public static String getAllBookings() {
        String query = String.format("SELECT * from booking");
        return query;
    }

    public static String getUserByUserName(String userName) {
        String query = String.format("SELECT username,password from user where username = '%s'", userName);
        return query;
    }

}
