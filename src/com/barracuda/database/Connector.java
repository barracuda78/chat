package com.barracuda.database;

import java.sql.*;
import java.util.Enumeration;

public class Connector {
    private static Enumeration<Driver> drivers = DriverManager.getDrivers();
    private static Statement statement;
    private static Connection connection;
    private final static String query = "CREATE TABLE test (" +
            "id INT," +
            "name VARCHAR(30)" +
            "info VARCHAR(100))";

    //testing
    public static void main(String[] args) {
        while(drivers.hasMoreElements()){
            Driver d = drivers.nextElement();
            System.out.println(d.getClass().getCanonicalName());
        }
    }


    //step 2:
    public static Connection getConnection(String url, String user, String password){
        try {

            connection =  DriverManager.getConnection(url, user, password);
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ошибка установки соединения с БД");
        }
        return null;
    }

    public static void executeQuery(String query){
        Connection connection = getConnection("", "user", "12345");
        try {
            statement = connection.createStatement();
            boolean b =statement.execute(query);

            if(b){
                ResultSet rs = statement.getResultSet();
            }
            else{
                int count = statement.getUpdateCount();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void close(){
        try {
            if(connection!=null && !connection.isClosed()){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    //step 3: statement

}
