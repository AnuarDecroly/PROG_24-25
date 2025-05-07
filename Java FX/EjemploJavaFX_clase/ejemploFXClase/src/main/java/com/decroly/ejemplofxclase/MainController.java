package com.decroly.ejemplofxclase;

import com.decroly.model.Persona;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    //Objetos para controlar las entidades Persona
    private Persona person;
    private ObservableList<Persona> personas = FXCollections.observableArrayList();


    //Paneles de la aplicacion
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

    @FXML
    private TextField dniTextField;


    //ListView
    @FXML
    private ListView<Persona> personListView;


    //Botones del panel de ListPeople
    @FXML
    private Button SavePeopleBtn;

    @FXML
    private Button removeSelectedBtn;


    //Eventos de los botones
    @FXML
    protected void onSaveButtonAction(ActionEvent event){
        person = new Persona();

        try{
            person.setDni(dniTextField.getText());
            person.setNombre(nameTextField.getText());
            person.setApellido(surNameTextField.getText());
            person.setEmail(emailTextField.getText());
            person.setEdad(Integer.parseInt(ageTextField.getText()));
            person.setTelefono(phoneTextField.getText());

            //Ir al panel de la lista de personas
            selectPanelVisible(2);

            personas.add(person);


        } catch (NumberFormatException e) {
            //ageTextField.setStyle(ageTextField.getStyle() + "-fx-prompt-fill: red");
            ageTextField.setText("");
            ageTextField.setPromptText("Escriba un numero");

        }

    }

    @FXML
    protected void onCloseButtonAction(ActionEvent event){
        //Ir al panel inicial
        selectPanelVisible(0);

    }

    @FXML
    protected void OnRegisterBtnAction(ActionEvent event){
        //Ir al panel de registro
        selectPanelVisible(1);
        this.clearFields();
    }

    @FXML
    protected void onViewPeopleAction(ActionEvent event){

        //Ir al panel de la lista de personas
        selectPanelVisible(2);
    }

    @FXML
    protected void OnBackBtnListPeopleAction(ActionEvent event){
        //Ir al panel de inicio
        selectPanelVisible(0);
        this.clearFields();
    }

    @FXML
    protected void OnRemoveSelecteditemsAction(ActionEvent event){
        boolean remove = personas.remove(personListView.getSelectionModel().getSelectedItem());
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
        dniTextField.setPromptText("Dni");


        personListView.setItems(personas);

        SavePeopleBtn.setDisable(true);
        removeSelectedBtn.setDisable(true);

        //Añadir listener a la propiedad de elemento seleccionado de la lista
        personListView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue == null) {
                SavePeopleBtn.setDisable(true);
                removeSelectedBtn.setDisable(true);
            }
            else{
                SavePeopleBtn.setDisable(false);
                removeSelectedBtn.setDisable(false);
            }
        });


    //Añadir listeners a la propiedades de focus de los TextFields
        nameTextField.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if(!newValue){
                if(!validateName(nameTextField.getText())){
                    nameTextField.setText("");
                    nameTextField.setPromptText("Valor incorrecto");
                }
            }
        });

        surNameTextField.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if(!newValue){
                if(!validateName(surNameTextField.getText())){
                    surNameTextField.setText("");
                    surNameTextField.setPromptText("Valor incorrecto");
                }
            }
        });

        emailTextField.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if(!newValue){
                if(!validateEmail(emailTextField.getText())){
                    emailTextField.setText("");
                    emailTextField.setPromptText("Valor incorrecto");
                }
            }
        });

        ageTextField.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if(!newValue){
                if(!validateAge(ageTextField.getText())){
                    ageTextField.setText("");
                    ageTextField.setPromptText("Valor incorrecto");
                }
            }
        });

        phoneTextField.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if(!newValue){
                if(!validatePhone(phoneTextField.getText())){
                    phoneTextField.setText("");
                    phoneTextField.setPromptText("Valor incorrecto");
                }

            }
        });

        dniTextField.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if(!newValue){
                if(!validateDni(dniTextField.getText())){
                    dniTextField.setText("");
                    dniTextField.setPromptText("Valor incorrecto");
                }
            }
        });



    }//metodo initialize

    // Metodos internos para realizar operaciones
    private void clearFields() {
        nameTextField.setText("");
        surNameTextField.setText("");
        emailTextField.setText("");
        ageTextField.setText("");
        phoneTextField.setText("");
    }

    private void selectPanelVisible(int panel){
        switch (panel) {

            case 0:
                startPanel.setVisible(true);
                mainPanel.setVisible(false);
                listPersonsPanel.setVisible(false);
                break;

            case 1:
                startPanel.setVisible(false);
                mainPanel.setVisible(true);
                listPersonsPanel.setVisible(false);
                break;

            case 2:
                startPanel.setVisible(false);
                mainPanel.setVisible(false);
                listPersonsPanel.setVisible(true);
                break;

            case 3:
                startPanel.setVisible(true);
                mainPanel.setVisible(false);
                listPersonsPanel.setVisible(false);
                break;

            default:
                startPanel.setVisible(true);
                mainPanel.setVisible(false);
                listPersonsPanel.setVisible(false);

        }
    }

    private boolean validateName(String name){
        return (name.length() > 3 && name.matches("[A-Z]{1}[a-z]{2,25}"));
    }

    private boolean validatePhone(String phone){
        return phone.matches("[1-9]{9}");
    }

    private boolean validateEmail(String email){
        String emailPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        return email.matches(emailPattern);
    }

    private boolean validateAge(String age){
        return age.matches("[1-9]{1,3}");
    }

    private boolean validateDni(String dni){
        return dni.matches("[0-9]{7,8}[A-Z a-z]");
    }
}