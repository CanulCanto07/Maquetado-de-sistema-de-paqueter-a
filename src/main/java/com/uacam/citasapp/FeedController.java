package com.uacam.citasapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class FeedController {
    @FXML private ListView<String> lvPersonas;
    @FXML public void initialize(){
        lvPersonas.getItems().addAll(
            "Ana, 24 — Intereses: cine, senderismo",
            "Luis, 28 — Intereses: fotografía, café",
            "María, 26 — Intereses: lectura, yoga",
            "Carlos, 30 — Intereses: ciclismo, tecnología"
        );
        lvPersonas.getSelectionModel().selectedItemProperty().addListener((obs, o, n)->{ if(n!=null) Navigator.goTo("contacto"); });
    }
    @FXML private void abrirFiltros(ActionEvent e){ Navigator.goTo("filtros"); }
    @FXML private void abrirBandeja(ActionEvent e){ Navigator.goTo("bandeja"); }
    @FXML private void abrirPerfil(ActionEvent e){ Navigator.goTo("perfil"); }
}
