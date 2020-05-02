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
import javafx.scene.image.Image;
import java.io.FileInputStream; 
import java.io.File;

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
    static int choice = 0;

    @FXML
    private void C1(ActionEvent event) {
        try {
            choice = 1;
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
    private void C2(ActionEvent event) {
        try {
            choice = 2;
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
    private void C3(ActionEvent event) {
        try {
            choice = 3;
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
    private void C4(ActionEvent event) {
        try {
            choice = 4;
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
    private void C5(ActionEvent event) {
        try {
            choice = 5;
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
    private void C6(ActionEvent event) {
        try {
            choice = 6;
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
    private void C7(ActionEvent event) {
        try {
            choice = 7;
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
    private void C8(ActionEvent event) {
        try {
            choice = 8;
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
    private void C9(ActionEvent event) {
        try {
            choice = 9;
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
    private void C10(ActionEvent event) {
        try {
            choice = 10;
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
    private void C11(ActionEvent event) {
        try {
            choice = 11;
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
    private void C12(ActionEvent event) {
        try {
            choice = 12;
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
    private void C13(ActionEvent event) {
        try {
            choice = 13;
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
    private void C14(ActionEvent event) {
        try {
            choice = 14;
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
    private void C15(ActionEvent event) {
        try {
            choice = 15;
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
    private void C16(ActionEvent event) {
        try {
            choice = 16;
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
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
