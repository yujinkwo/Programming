package com.example.library;

public class Book {
    String title;
    String author;

    public Book (String title, String author){
        this.title = title;
        this.author = author;
    }
    public String toString(){
        return "Title: " + title + " Author: " + author;
    }

    public boolean execAction(String st) {
        return false;
    }
}
