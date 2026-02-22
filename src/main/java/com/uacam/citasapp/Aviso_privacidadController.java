package com.uacam.citasapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Aviso_privacidadController {
    @FXML private void aceptar(ActionEvent e){ Navigator.goTo("registro_inicial"); }
}
