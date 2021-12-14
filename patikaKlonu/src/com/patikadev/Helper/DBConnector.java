package com.patikadev.Helper;
import java.sql.*;

public class DBConnector {
    private  Connection connect = null;


    public  Connection connectDB(){
        try {
            this.connect= DriverManager.getConnection(Config.DB_URL,Config.DB_USERNAME,Config.DB_PASSWORD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return this.connect;
    }

    public static  Connection getInstance(){
        DBConnector dbConnector = new DBConnector();
        return dbConnector.connectDB();

    }
}
