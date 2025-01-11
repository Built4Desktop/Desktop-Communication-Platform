package org.example.aiconomics;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ApplicationController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onMessageButtonClick() {
        welcomeText.setText("Welcome to The AIconomics Application!");
    }
}