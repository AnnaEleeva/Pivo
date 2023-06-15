package com.example.demo.controller;

public class UserView {

    public String name;
    public int age;
    public String link;

    UserView() {}

    public UserView(String name,
                    int age, String link) {
        this.name = name;
        this.age = age;
        this.link = link;
    }
}
