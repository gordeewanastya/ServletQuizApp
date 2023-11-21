package com.gordeeva.servletsquizapp.dbconfig;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigurationDBConnection {
    private static String url = "jdbc:postgresql://localhost:5432/postgres";

    private static String username = "postgres";

    private static String password = "postgres";

    public static Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url,username,password);
            System.out.println("Connection established successfully");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}