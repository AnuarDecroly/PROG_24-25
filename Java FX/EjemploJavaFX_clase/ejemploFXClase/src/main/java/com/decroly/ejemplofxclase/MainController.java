package com.decroly.ejemplofxclase;

import com.decroly.model.Persona;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    private Persona person;
    private ObservableList<Persona> personas = FXCollections.observableArrayList();


    //Panel principal
    @FXML
    private VBox mainPanel;

    @FXML
    private VBox listPersonsPanel;

    @FXML
    private GridPane startPanel;


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


    //ListView
    @FXML
    private ListView<Persona> personListView;

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
            listPersonsPanel.setVisible(true);

            personas.add(person);


        } catch (NumberFormatException e) {
            //ageTextField.setStyle(ageTextField.getStyle() + "-fx-prompt-fill: red");
            ageTextField.setText("");
            ageTextField.setPromptText("Escriba un numero");

        }

    }

    @FXML
    protected void onCloseButtonAction(ActionEvent event){
        startPanel.setVisible(true);
        mainPanel.setVisible(false);
        listPersonsPanel.setVisible(false);

    }

    @FXML
    protected void OnRegisterBtnAction(ActionEvent event){
        startPanel.setVisible(false);
        mainPanel.setVisible(true);
        listPersonsPanel.setVisible(false);

        this.clearFields();
    }

    @FXML
    protected void onViewPeopleAction(ActionEvent event){
        startPanel.setVisible(false);
        mainPanel.setVisible(false);
        listPersonsPanel.setVisible(true);
    }

    @FXML
    protected void OnBackBtnListPeopleAction(ActionEvent event){
        startPanel.setVisible(true);
        mainPanel.setVisible(false);
        listPersonsPanel.setVisible(false);

        this.clearFields();
    }

    @FXML
    protected void OnRemoveSelecteditemsAction(ActionEvent event){
        boolean remove = personas.remove(personListView.getSelectionModel().getSelectedItem());
    }


    private void clearFields() {
        nameTextField.setText("");
        surNameTextField.setText("");
        emailTextField.setText("");
        ageTextField.setText("");
        phoneTextField.setText("");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        startPanel.setVisible(true);
        mainPanel.setVisible(false);
        listPersonsPanel.setVisible(false);


        nameTextField.setPromptText("Nombre");
        ageTextField.setPromptText("Edad");
        surNameTextField.setPromptText("Apellidos");
        emailTextField.setPromptText("Email");
        phoneTextField.setPromptText("Telefono");


        personListView.setItems(personas);




    }
}