package com.example.library;

public class User {
    String id;
    String name;

    public User(String id, String name){
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return "Id: " + id + " Name: " + name;
    }

    public boolean execAction(String st) {
        return false;
    }
}
