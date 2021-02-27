package com.barracuda.database;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

public class Connector {
    private static Enumeration<Driver> drivers = DriverManager.getDrivers();

    //testing
//    public static void main(String[] args) {
//        while(drivers.hasMoreElements()){
//            Driver d = drivers.nextElement();
//            System.out.println(d.getClass().getCanonicalName());
//        }
//    }

    //step 2:
    public static Connection getConnection(String url, String user, String password){
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ошибка установки соединения с БД");
        }
        return null;
    }
}
