module com.decroly.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.decroly.demo to javafx.fxml;
    exports com.decroly.demo;
}