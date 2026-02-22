package com.uacam.citasapp;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Navigator {
    private static Stage stage;
    public static void setStage(Stage s){ stage = s; }
    public static void goTo(String fxml){
        try{
            Parent root = FXMLLoader.load(Navigator.class.getResource("/com/uacam/citasapp/"+fxml+".fxml"));
            Scene scene = stage.getScene();
            if(scene==null){ scene = new Scene(root, 960, 600); stage.setScene(scene);} else { scene.setRoot(root);}            
        }catch(IOException e){ e.printStackTrace(); }
    }
}
