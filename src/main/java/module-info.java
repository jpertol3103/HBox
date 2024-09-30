module com.example.hbox_example {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hbox_example to javafx.fxml;
    exports com.example.hbox_example;
}