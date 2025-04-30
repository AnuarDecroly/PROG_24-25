package com.decroly.ejemplofxclase;

import com.decroly.model.Persona;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    private Persona person;

    //Panel principal
    @FXML
    private VBox mainPanel;


    //Campos de textos del formulario
    @FXML
    private TextField nameTextField;

    @FXML
    private TextField ageTextField;

    @FXML
    private TextField surNameTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField phoneTextField;



    //Eventos
    @FXML
    protected void onSaveButtonAction(ActionEvent event){
        person = new Persona();

        try{
            person.setNombre(nameTextField.getText());
            person.setApellido(surNameTextField.getText());
            person.setEmail(emailTextField.getText());
            person.setEdad(Integer.parseInt(ageTextField.getText()));
            person.setTelefono(phoneTextField.getText());

            mainPanel.setVisible(false);


        } catch (NumberFormatException e) {
            //ageTextField.setStyle(ageTextField.getStyle() + "-fx-prompt-fill: red");
            ageTextField.setText("");
            ageTextField.setPromptText("Escriba un numero");

        }

    }

    @FXML
    protected void onCloseButtonAction(ActionEvent event){
        Platform.exit();

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nameTextField.setPromptText("Nombre");
        ageTextField.setPromptText("Edad");
        surNameTextField.setPromptText("Apellidos");
        emailTextField.setPromptText("Email");
        phoneTextField.setPromptText("Telefono");

    }
}