package com.uacam.citasapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/com/uacam/citasapp/registro_inicial.fxml"));
        Scene scene = new Scene(root, 960, 600);
        scene.getStylesheets().add(getClass().getResource("/com/uacam/citasapp/styles.css").toExternalForm());
        Navigator.setStage(stage);
        stage.setTitle("CitasApp · Maquetado v2");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){ launch(args);}    
}
//Proyecto realizado por: © Canul Canto Isabel Del Rosario. © Lopez Gonzalez David Concepción. © Cruz Martinez Alejandro. © Sosa Paredes Fernando Miguel.