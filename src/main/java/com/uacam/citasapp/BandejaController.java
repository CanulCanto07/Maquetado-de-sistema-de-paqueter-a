package com.uacam.citasapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class BandejaController {
    @FXML private ListView<String> lvMensajes;
    @FXML public void initialize(){
        lvMensajes.getItems().addAll(
            "Ana: ¿Te gustaría un café este viernes?",
            "Luis: Hola, vi que te gusta la fotografía",
            "María: ¡Compartimos gusto por el yoga!"
        );
        lvMensajes.getSelectionModel().selectedItemProperty().addListener((o, old, sel)->{ if(sel!=null) Navigator.goTo("mensaje_detalle"); });
    }
    @FXML private void volver(ActionEvent e){ Navigator.goTo("feed"); }
}
