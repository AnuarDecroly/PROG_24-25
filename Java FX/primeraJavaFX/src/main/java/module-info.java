module com.example.primerajavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.primerajavafx to javafx.fxml;
    exports com.example.primerajavafx;
}