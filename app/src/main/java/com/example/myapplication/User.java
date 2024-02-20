package com.example.myapplication;


import java.io.Serializable;

public class User implements Serializable {

    public String email;
    public String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
