package com.example.nhahangandroid;

public class HelperClass1 {
    String mainUsername;

    public String getUsername() {
        return mainUsername;
    }

    public void setUsername(String username) {
        this.mainUsername = username;
    }


    public HelperClass1( String username, String email, String password) {

        this.mainUsername = username;

    }

    public HelperClass1() {
    }
}
