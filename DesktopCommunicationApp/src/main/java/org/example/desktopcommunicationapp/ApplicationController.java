package org.example.desktopcommunicationapp;

import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;
import static java.lang.System.exit;

public class ApplicationController {

    @FXML
    public ScrollPane sidebarScroll;

    @FXML
    protected void handleLogoutButtonAction() {
        exit(0);
    }
}