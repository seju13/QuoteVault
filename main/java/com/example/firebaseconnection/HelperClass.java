package com.example.firebaseconnection;

public class HelperClass {
    String name , email , password , username;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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


    public HelperClass(String name, String email, String password, String username) {
        this.name = name;
        this.email= this.email;
        this.username= this.username;
        this.password= this.password;
    }

    public HelperClass() {
    }
}
