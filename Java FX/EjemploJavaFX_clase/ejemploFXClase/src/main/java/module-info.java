module com.decroly.ejemplofxclase {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.decroly.ejemplofxclase to javafx.fxml;
    exports com.decroly.ejemplofxclase;
}