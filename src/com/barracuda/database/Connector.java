package com.barracuda.database;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class Connector {
    private static Enumeration<Driver> drivers = DriverManager.getDrivers();


    public static void main(String[] args) {
        while(drivers.hasMoreElements()){
            Driver d = drivers.nextElement();
            System.out.println(d.getClass().getCanonicalName());
        }
    }
}
