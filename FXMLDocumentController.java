//Nicholas Valdes
//CS 2365 Section 001
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ang;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Nicholas
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField TF;
    public Button exit;
    static int playerNum = 0;
    
    
    @FXML
    private void start(ActionEvent event) {
        try {
            playerNum = Integer.parseInt(TF.getText());
            setup.setPlayerAmount();
            Stage stage = (Stage) exit.getScene().getWindow();
            stage.close();
            Parent root1 = FXMLLoader.load(getClass().getResource("character.fxml"));
            stage = new Stage();
            
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (IOException ex) {
            System.out.println("What");
        }
    }
    
    @FXML
    public void exit(ActionEvent event) {
        Stage stage = (Stage) exit.getScene().getWindow();
        stage.close();
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
}

