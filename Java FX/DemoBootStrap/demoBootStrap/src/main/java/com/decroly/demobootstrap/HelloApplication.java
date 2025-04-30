package com.decroly.demobootstrap;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        //Para acceder al controller
        VBox root = (VBox) fxmlLoader.load();

        Scene scene = new Scene(root, 400, 400);
        stage.setTitle("Hola mundo !!!");

        stage.setScene(scene);
        stage.show();

//        HelloController controller = fxmlLoader.<HelloController>getController();
//        controller.setBindings();
    }

    public static void main(String[] args) {
        launch();
    }
}