//Nicholas Valdes
//CS 2365 Section 001
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ang;

import java.io.File;
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
import javafx.scene.image.ImageView;
import java.util.Random;
import javafx.scene.image.Image;
import java.io.FileInputStream; 
import java.util.ArrayList;

/**
 * FXML Controller class
 *
 * @author Nicholas
 */

public class TableController implements Initializable {
    public static ArrayList<Dice> diceList = new ArrayList<Dice>();
    Random rand = new Random();

    @FXML
    public ImageView d2;
    public Button bot5;
    public ImageView d3;
    public Button bot6;
    public ImageView d4;
    public Button bot3;
    public ImageView d5;
    public Button bot4;
    public Button bot1;
    public Button bot2;
    public Button roll;
    public Button reroll;
    public Button start;
    public Button resolve;
    public ImageView d1;
    public CheckBox DC1;
    public CheckBox DC2;
    public CheckBox DC3;
    public CheckBox DC4;
    public CheckBox DC5;
    public Label HP;
    
    
      File f1 = new File("D:\\Documents\\NetBeansProjects\\ang\\src\\Arrow.png");
      Image arrow = new Image(f1.toURI().toString());
      File f2 = new File("D:\\Documents\\NetBeansProjects\\ang\\src\\Dynamite.png");
      Image dyn = new Image(f2.toURI().toString());
      File f3 = new File("D:\\Documents\\NetBeansProjects\\ang\\src\\one.png");
      Image one = new Image(f3.toURI().toString());
      File f4 = new File("D:\\Documents\\NetBeansProjects\\ang\\src\\two.png");
      Image two = new Image(f4.toURI().toString());
      File f5 = new File("D:\\Documents\\NetBeansProjects\\ang\\src\\beer.png");
      Image beer = new Image(f5.toURI().toString());
      File f6 = new File("D:\\Documents\\NetBeansProjects\\ang\\src\\gun.png");
      Image gun = new Image(f6.toURI().toString());
      
    Character3 activePlayer = new Character3();
    Dice dice1 = new Dice(activePlayer);
    Dice dice2 = new Dice(activePlayer);
    Dice dice3 = new Dice(activePlayer);
    Dice dice4 = new Dice(activePlayer);
    Dice dice5 = new Dice(activePlayer);
    
    
    
    @FXML
    public void start(ActionEvent event) {
        HP.setText("HP: " + activePlayer.gethp());
        roll.setDisable(false);
        start.setVisible(false);
        start.setDisable(true);
        
    }
    
    public void roll(ActionEvent event) {
        System.out.println("wgoa");
        DC1.setVisible(true);
        DC2.setVisible(true);
        DC3.setVisible(true);
        DC4.setVisible(true);
        DC5.setVisible(true);
        diceList.add(dice1);
        diceList.add(dice2);
        diceList.add(dice3);
        diceList.add(dice4);
        diceList.add(dice5);
        resolve.setDisable(false);
        
        reroll.setDisable(false);
        dice1.rollDice();
        switch (dice1.getDice()) {
            case 1:
                d1.setImage(arrow);
                break;
            case 2:
                d1.setImage(dyn);
                DC1.setVisible(false);
                break;
            case 3:
                d1.setImage(one);
                break;
            case 4:
                d1.setImage(two);
                break;
            case 5:
                d1.setImage(beer);
                break;
            case 6:
                d1.setImage(gun);
                break;
            default:
                break;
        }
        
        dice2.rollDice();
        
        switch (dice2.getDice()) {
            case 1:
                d2.setImage(arrow);
                break;
            case 2:
                d2.setImage(dyn);
                DC2.setVisible(false);
                break;
            case 3:
                d2.setImage(one);
                break;
            case 4:
                d2.setImage(two);
                break;
            case 5:
                d2.setImage(beer);
                break;
            case 6:
                d2.setImage(gun);
                break;
            default:
                break;
        }
        dice3.rollDice();
        
        switch (dice3.getDice()) {
            case 1:
                d3.setImage(arrow);
                break;
            case 2:
                d3.setImage(dyn);
                DC3.setVisible(false);
                break;
            case 3:
                d3.setImage(one);
                break;
            case 4:
                d3.setImage(two);
                break;
            case 5:
                d3.setImage(beer);
                break;
            case 6:
                d3.setImage(gun);
                break;
            default:
                break;
        }
        
        dice4.rollDice();
        
        switch (dice4.getDice()) {
            case 1:
                d4.setImage(arrow);
                break;
            case 2:
                d4.setImage(dyn);
                DC4.setVisible(false);
                break;
            case 3:
                d4.setImage(one);
                break;
            case 4:
                d4.setImage(two);
                break;
            case 5:
                d4.setImage(beer);
                break;
            case 6:
                d4.setImage(gun);
                break;
            default:
                break;
        }
        dice5.rollDice();
        
        switch (dice5.getDice()) {
            case 1:
                d5.setImage(arrow);
                break;
            case 2:
                d5.setImage(dyn);
                DC5.setVisible(false);
                break;
            case 3:
                d5.setImage(one);
                break;
            case 4:
                d5.setImage(two);
                break;
            case 5:
                d5.setImage(beer);
                break;
            case 6:
                d5.setImage(gun);
                break;
            default:
                break;
        }
        roll.setDisable(true);
    }
    
    public void reroll(ActionEvent event) {
        Dice.rerollCount++;
        if (Dice.rerollCount == 2)
        {
           reroll.setDisable(true);
        }
        if (DC1.isSelected())
        {
           dice1.rollDice();
            switch (dice1.getDice()) {
                case 1:
                    d1.setImage(arrow);
                    break;
                case 2:
                    d1.setImage(dyn);
                    DC1.setVisible(false);
                    break;
                case 3:
                    d1.setImage(one);
                    break;
                case 4:
                    d1.setImage(two);
                    break;
                case 5:
                    d1.setImage(beer);
                    break;
                case 6:
                    d1.setImage(gun);
                    break;
                default:
                    break;
            }
        }
        
        if (DC2.isSelected())
        {
            dice2.rollDice();
        
            switch (dice2.getDice()) {
                case 1:
                    d2.setImage(arrow);
                    break;
                case 2:
                    d2.setImage(dyn);
                    DC2.setVisible(false);
                    break;
                case 3:
                    d2.setImage(one);
                    break;
                case 4:
                    d2.setImage(two);
                    break;
                case 5:
                    d2.setImage(beer);
                    break;
                case 6:
                    d2.setImage(gun);
                    break;
                default:
                    break;
            }
        }
        
        if (DC3.isSelected())
        {
            dice3.rollDice();
        
            switch (dice3.getDice()) {
                case 1:
                    d3.setImage(arrow);
                    break;
                case 2:
                    d3.setImage(dyn);
                    DC3.setVisible(false);
                    break;
                case 3:
                    d3.setImage(one);
                    break;
                case 4:
                    d3.setImage(two);
                    break;
                case 5:
                    d3.setImage(beer);
                    break;
                case 6:
                    d3.setImage(gun);
                    break;
                default:
                    break;
            }
        }
        
        if (DC4.isSelected())
        {
            dice4.rollDice();
        
            switch (dice4.getDice()) {
                case 1:
                    d4.setImage(arrow);
                    break;
                case 2:
                    d4.setImage(dyn);
                    DC4.setVisible(false);
                    break;
                case 3:
                    d4.setImage(one);
                    break;
                case 4:
                    d4.setImage(two);
                    break;
                case 5:
                    d4.setImage(beer);
                    break;
                case 6:
                    d4.setImage(gun);
                    break;
                default:
                    break;
            }
        }
        
        if (DC5.isSelected())
        {
            dice5.rollDice();
        
            switch (dice5.getDice()) {
                case 1:
                    d5.setImage(arrow);
                    break;
                case 2:
                    d5.setImage(dyn);
                    DC5.setVisible(false);
                    break;
                case 3:
                    d5.setImage(one);
                    break;
                case 4:
                    d5.setImage(two);
                    break;
                case 5:
                    d5.setImage(beer);
                    break;
                case 6:
                    d5.setImage(gun);
                    break;
                default:
                    break;
            }
        }
    }
    
    public void resolve(ActionEvent event) {
        Dice.globalLockDown = true;
        for (int i = 0; i < 5; i++)
        {
            diceList.get(i).rollDice();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
