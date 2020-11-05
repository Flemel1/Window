module com.mycompany.window {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.window to javafx.fxml;
    exports com.mycompany.window;
}