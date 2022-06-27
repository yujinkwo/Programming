package com.example.library;

import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class UserController implements Initializable {
    public TextField ID;
    public TextField Name;
    private User user;

    public void addUser(){
        String id = ID.getText();
        String name = Name.getText();

        boolean b = id.isEmpty() || name.isEmpty();

        if (!b){
            String st = "INSERT INTO USERS VALUES " + "(" +
                    "'" + id + "'," +
                    "'" + name + "'," +
                    "'" + false + "')";
            if (user.execAction(st)){
                ID.clear();
                Name.clear();
                System.out.println("User added");
            } else{
                System.out.println("User was not added");
            }
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
