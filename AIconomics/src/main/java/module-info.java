module org.example.aiconomics {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.aiconomics to javafx.fxml;
    exports org.example.aiconomics;
}