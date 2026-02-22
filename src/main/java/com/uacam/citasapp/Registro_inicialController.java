package com.uacam.citasapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Registro_inicialController {
    @FXML private TextField tfCodigoPostal;    
    @FXML private TextField tfNombre;
    @FXML private CheckBox cbAceptar;

    @FXML private void abrirAvisoPrivacidad(ActionEvent e){ Navigator.goTo("aviso_privacidad"); }
    @FXML private void continuar(ActionEvent e){ Navigator.goTo("feed"); }
}
