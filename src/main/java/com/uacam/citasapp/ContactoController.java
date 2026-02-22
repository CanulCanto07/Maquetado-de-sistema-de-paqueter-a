package com.uacam.citasapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;

public class ContactoController {
    @FXML private ToggleButton tbLike;
    @FXML private ToggleButton tbInteres;

    @FXML private void enviar(ActionEvent e){ Navigator.goTo("feed"); }
    @FXML private void cancelar(ActionEvent e){ Navigator.goTo("feed"); }

    @FXML private void marcarLike(ActionEvent e){ System.out.println("Like: "+(tbLike!=null && tbLike.isSelected())); }
    @FXML private void marcarInteres(ActionEvent e){ System.out.println("Interesado: "+(tbInteres!=null && tbInteres.isSelected())); }
}
