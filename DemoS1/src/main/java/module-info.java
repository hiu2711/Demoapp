module com.hiu2711.demos1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.hiu2711.demos1 to javafx.fxml;
    exports com.hiu2711.demos1;
}
