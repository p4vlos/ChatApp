package com.pavlosnicolaou.androidchat.model;

/**
 * Created by pn94 on 15/11/2016.
 */

public class User {

    public String username;
    public String firstName;
    public String lastName;

    public User() {
        //Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String username, String firstName, String lastName) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
