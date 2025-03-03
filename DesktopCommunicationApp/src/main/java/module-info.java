module org.example.aiconomics {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.desktopcommunicationapp to javafx.fxml;
    exports org.example.desktopcommunicationapp;
}