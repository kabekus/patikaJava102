package com.patikadev.Model;

public class Student extends User {
    public Student() {
    }

    public Student(int id, String user_name, String user_nickname, String password, String user_type) {
        super(id, user_name, user_nickname, password, user_type);
    }
}
