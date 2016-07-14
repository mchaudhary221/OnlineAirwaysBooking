/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlineairways.repository.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author Administrator
 */
public class ConnectionManager {

    private static DataSource dataSource;
    
    public void setDataSource(DataSource dataSource) {
        ConnectionManager.dataSource = dataSource;
    }

    public static List<Object> executeQuery(String query) {
        List<Object> list = new ArrayList<>();
        try (Connection con = dataSource.getConnection(); Statement stmt = con.createStatement();) {
            ResultSet rs = stmt.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            int count = rsmd.getColumnCount();
            Object[] rows = new Object[count];
            while(rs.next()){
                for(int i = 0; i < count; i++){
                    rows[i] = rs.getObject(i);
                }  
                list.add(rows);
            }
        } catch (SQLException ex) {
            System.out.println("Exception thrown while executing...." + ex.getMessage());
        }
        return list;
    }

    public static int executeUpdate(String query) {
        int count = 0;
        try (Connection con = dataSource.getConnection();
                Statement stmt = con.createStatement();) {
            count = stmt.executeUpdate(query); 
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Exception thrown while updating...." + ex.getMessage());
        }
        return count;
    }

}
