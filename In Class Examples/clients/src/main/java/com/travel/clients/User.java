package com.travel.clients;

public class User {
    private String name;
    private String email;
    private String password;
    private int age;
    private String bio;

    public User(String name, String email, String password, int age) {
        this.name = name;
        this.email = name + "@gmail.com";
        this.password = password;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}
