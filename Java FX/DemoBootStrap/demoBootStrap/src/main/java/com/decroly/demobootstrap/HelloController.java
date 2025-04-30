package com.decroly.demobootstrap;

import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    private Persona p;

    @FXML
    private Label welcomeText;

    @FXML
    private TextField nameText;

    @FXML
    private TextField surnameText;

    @FXML
    private TextField emailText;

    @FXML
    private TextField phoneText;

    @FXML
    private TextField dniText;

    @FXML
    private Pane Panel;

    public void setBindings(){
        welcomeText.textProperty().bind(nameText.textProperty());
    }


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onSaveBtnAction() {

        Panel.setVisible(false);
        //welcomeText.setText();

    }

    @FXML
    protected void onCancelBtnAction() {

        Platform.exit();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        p = new Persona();
//        StringProperty s = new SimpleStringProperty(p.nombre);
//        nameText.textProperty().bindBidirectional(s);

        this.nameText.setPromptText("Nombre");
        this.surnameText.setPromptText("Apellido");
        this.emailText.setPromptText("Email");
        this.phoneText.setPromptText("Telefono");
        this.dniText.setPromptText("DNI");
    }
}