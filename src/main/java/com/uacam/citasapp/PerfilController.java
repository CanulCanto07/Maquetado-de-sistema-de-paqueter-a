package com.uacam.citasapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class PerfilController {
    @FXML private void guardar(ActionEvent e){ Navigator.goTo("feed"); }
    @FXML private void volver(ActionEvent e){ Navigator.goTo("feed"); }
}
