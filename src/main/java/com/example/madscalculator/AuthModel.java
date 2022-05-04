package com.example.madscalculator;

/**
 * User: Avinash Vijayvargiya
 * Date: 05-May-22
 * Time: 12:52 AM
 */
public class AuthModel {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String username;
    private String password;
}
