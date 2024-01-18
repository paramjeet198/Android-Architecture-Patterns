package com.example.androidpattern.mvp.model;

public class LoginModel {
    public boolean isValidUser(String username, String password) {
        // Check if the provided username and password are valid (e.g., from a server or local storage)
        return "user123".equals(username) && "pass123".equals(password);
    }
}
