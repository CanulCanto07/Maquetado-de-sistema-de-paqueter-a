package com.uacam.citasapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Mensaje_detalleController {
    @FXML private Label lblContacto;
    @FXML private void aceptar(ActionEvent e){ lblContacto.setText("Datos de contacto: correo@ejemplo.com · +52 555 123 4567"); }
    @FXML private void rechazar(ActionEvent e){ Navigator.goTo("bandeja"); }
    @FXML private void volver(ActionEvent e){ Navigator.goTo("bandeja"); }
}
