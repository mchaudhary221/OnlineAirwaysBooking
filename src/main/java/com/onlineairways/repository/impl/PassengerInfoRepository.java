/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlineairways.repository.impl;

import com.onlineairways.domain.FlightType;
import com.onlineairways.domain.PassengerInfo;
import com.onlineairways.repository.IPassengerInfoRepository;
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
public class PassengerInfoRepository implements IPassengerInfoRepository {

    @Override
    public boolean create(PassengerInfo obj) {
        boolean result = false;
        try {
            int rs = ConnectionManager.executeUpdate(StatementBuilder.createPassengerInfo(obj.getFlight().toString(), obj.getPassengerCount()));
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
    public PassengerInfo read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(PassengerInfo obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(PassengerInfo obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PassengerInfo> readAll() {
        List<PassengerInfo> results = new ArrayList<>();
        try {
            ResultSet rs = null;//ConnectionManager.executeQuery(StatementBuilder.getAllPassengerInfo());
            while (rs.next()) {
                PassengerInfo flightinfo = new PassengerInfo();
                flightinfo.setInfoId(rs.getInt("infoid"));
                flightinfo.setPassengerCount(rs.getInt("passengercount"));
                flightinfo.setFlight(FlightType.valueOf(rs.getString("flighttype")));
                results.add(flightinfo);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return results;
    }

}
