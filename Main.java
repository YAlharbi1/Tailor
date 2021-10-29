/*
 * To change this license header, choose License Headers in Main Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author yasse
 */
public class Main extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
    FXMLLoader load=new FXMLLoader(getClass().getResource("SignInDesign.fxml"));
    Scene scene = new Scene(load.load());
    stage.setScene(scene);
    stage.setTitle("Sign In ");
    stage.show();
    }
    
}
