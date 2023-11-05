package com.example.proyectojavafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Button botonAdd;

    @FXML
    private Button botonMenos;

    @FXML
    private TableView<persona> tabla;

    @FXML
    private TableColumn<persona, String> edad;

    @FXML
    private TableColumn<persona, String> nombre;

    @FXML
    private TableColumn<persona, String> tlfno;


    @FXML
    private TextField textEdad;

    @FXML
    private TextField textNom;

    @FXML
    private TextField textTlfno;

    ObservableList<persona> lista = FXCollections.observableArrayList(
            new persona("Juan","20","3432342")
    );
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nombre.setCellValueFactory(new PropertyValueFactory<persona,String>("Nombre"));
        edad.setCellValueFactory(new PropertyValueFactory<persona,String>("Edad"));
        tlfno.setCellValueFactory(new PropertyValueFactory<persona,String>("Tlfno"));

        tabla.setItems(lista);
    }

    @FXML
    void onaddaction(ActionEvent event) {
        persona nuevo = new persona(textNom.getText(),textEdad.getText(),textTlfno.getText());
        lista.add(nuevo);
    }

    @FXML
    void onrestaaction(ActionEvent event) {
        ObservableList<persona> sel, items;
        items = tabla.getItems();
        sel = tabla.getSelectionModel().getSelectedItems();
        for (persona m : sel)
        {
            items.remove(m);
        }
    }
}
