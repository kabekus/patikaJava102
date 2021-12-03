package com.patikadev.Helper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnector {
    private Connection connect = null;

    public Connection connectDB(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            this.connect= DriverManager.getConnection(Config.DB_URL);

            Statement statement = connect.createStatement();
            ResultSet resultSet;

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return this.connect;
    }
    public static  Connection getInstance(){
        DBConnector dbConnector = new DBConnector();
        return dbConnector.connectDB();

    }
}
