package com.patikadev.Model;
import com.patikadev.Helper.DBConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class User {
    private int id;
    private String name, User_name,password,user_type;

    public User() {

    }

    public User(int id, String name, String user_name, String password, String user_type) {
        this.id = id;
        this.name = name;
        this.User_name = user_name;
        this.password = password;
        this.user_type = user_type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_name() {
        return User_name;
    }

    public void setUser_name(String user_name) {
        User_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public static ArrayList<User> getList(){
        ArrayList<User> userList = new ArrayList<>();
        String query = "SELECT * From user";
        User object;
        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                object = new User();
                object.setId(rs.getInt("id"));
                object.setName(rs.getString("name"));
                object.setUser_name(rs.getString("user_name"));
                object.setPassword(rs.getString("password"));
                object.setPassword(rs.getString("user_type"));
                userList.add(object);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

}
