module com.decroly.demobootstrap {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.decroly.demobootstrap to javafx.fxml;
    exports com.decroly.demobootstrap;
}