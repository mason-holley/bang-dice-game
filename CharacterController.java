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
import ang.TableController;

/**
 * FXML Controller class
 *
 * @author Nicholas
 */
public class CharacterController implements Initializable {

    @FXML

    private Button C1;
    private Button C2;
    private Button C3;
    private Button C4;
    private Button C5;
    private Button C6;
    private Button C7;
    private Button C8;
    private Button C9;    
    private Button C10;
    private Button C11;
    private Button C12;
    private Button C13;
    private Button C14;
    private Button C15;
    private Button C16;
    public Button close;

    @FXML
    private void C1(ActionEvent event) {
        try {
            Stage stage = (Stage) C1.getScene().getWindow();
            stage.close();

            Parent root2 = FXMLLoader.load(getClass().getResource("table.fxml"));
            stage = new Stage();
            
            stage.setScene(new Scene(root2));
            stage.show();
        } catch (IOException ex) {
           System.out.println("hoal");
        }
    }

    @FXML
    void C2(ActionEvent event) {

    }

    @FXML
    void C3(ActionEvent event) {

    }

    @FXML
    void C4(ActionEvent event) {

    }

    @FXML
    void C5(ActionEvent event) {

    }

    @FXML
    void C6(ActionEvent event) {

    }

    @FXML
    void C7(ActionEvent event) {

    }

    @FXML
    void C8(ActionEvent event) {

    }

    @FXML
    void C9(ActionEvent event) {

    }

    @FXML
    void C10(ActionEvent event) {

    }

    @FXML
    void C11(ActionEvent event) {

    }

    @FXML
    void C12(ActionEvent event) {

    }

    @FXML
    void C13(ActionEvent event) {

    }

    @FXML
    void C14(ActionEvent event) {

    }

    @FXML
    void C15(ActionEvent event) {

    }

    @FXML
    void C16(ActionEvent event) {

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
