package com.uacam.citasapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class FiltrosController {
    @FXML private void aplicar(ActionEvent e){ Navigator.goTo("feed"); }
    @FXML private void cancelar(ActionEvent e){ Navigator.goTo("feed"); }
}
