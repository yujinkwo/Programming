package com.example.library;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class BookController implements Initializable {
    public TextField Title;
    public TextField Author;
    private Book book;

    public BookController(String name, String author, boolean b, int i) {

    }

    public void Book(ActionEvent actionEvent) {
        String title = Title.getText();
        String author = Author.getText();

        boolean b = title.isEmpty() || author.isEmpty();

        if (!b){
            String st = "INSERT INTO BOOKS VALUES " + "(" +
                    "'" + Title + "'," +
                    "'" + Author + "'," +
                    "'" + false + "')";

            if (book.execAction(st)){
                Title.clear();
                Author.clear();
                System.out.println("Book added");
            } else{
                System.out.println("Book was not added");
            }
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}

