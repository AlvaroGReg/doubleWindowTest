package com.example.doublewindowtest;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Label label;
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        label.setText("1st panel button");
    }

    public void new_text(ActionEvent actionEvent) {

        label.setText("2nd panel button");
    }
}