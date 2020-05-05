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
import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import javafx.application.Platform;



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
    public Button exit;
    public Button nextTurn;
    public Button player;
    public Button bot7;
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
    public CheckBox pos0;
    public CheckBox pos1;
    public CheckBox pos2;
    public CheckBox pos3;
    public CheckBox pos4;
    public CheckBox pos5;
    public CheckBox pos6;
    public CheckBox pos7;
    public Label HP;
    public Label mainText;
    public Label playRole;
    public ImageView playerChar;
    int playChoice = CharacterController.choice;
    public static int playPos = 0;
    public static int gamePos = 0;
    public static int targetPos = 0;
    static int ex = 0;
    
    
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
    File fc1 = new File("D:\\Documents\\NetBeansProjects\\ang\\src\\C1.png");
    Image temp = new Image(fc1.toURI().toString());
    File fc2 = new File("D:\\Documents\\NetBeansProjects\\ang\\src\\C2PNG.jpg");
    Image temp2 = new Image(fc2.toURI().toString());
    File fc3 = new File("D:\\Documents\\NetBeansProjects\\ang\\src\\C3PNG.jpg");
    Image temp3 = new Image(fc3.toURI().toString());
    File fc4 = new File("D:\\Documents\\NetBeansProjects\\ang\\src\\C4PNG.jpg");
    Image temp4 = new Image(fc4.toURI().toString());
    File fc5 = new File("D:\\Documents\\NetBeansProjects\\ang\\src\\C5PNG.jpg");
    Image temp5 = new Image(fc5.toURI().toString());
    File fc6 = new File("D:\\Documents\\NetBeansProjects\\ang\\src\\C6PNG.jpg");
    Image temp6 = new Image(fc6.toURI().toString());
    File fc7 = new File("D:\\Documents\\NetBeansProjects\\ang\\src\\C7PNG.jpg");
    Image temp7 = new Image(fc7.toURI().toString());
    File fc8 = new File("D:\\Documents\\NetBeansProjects\\ang\\src\\C8PNG.jpg");
    Image temp8 = new Image(fc8.toURI().toString());
    File fc9 = new File("D:\\Documents\\NetBeansProjects\\ang\\src\\C9PNG.jpg");
    Image temp9 = new Image(fc9.toURI().toString());      
    File fc10 = new File("D:\\Documents\\NetBeansProjects\\ang\\src\\C10PNG.jpg");
    Image temp10 = new Image(fc10.toURI().toString());
    File fc11 = new File("D:\\Documents\\NetBeansProjects\\ang\\src\\C11PNG.jpg");
    Image temp11 = new Image(fc11.toURI().toString());
    File fc12 = new File("D:\\Documents\\NetBeansProjects\\ang\\src\\C12PNG.jpg");
    Image temp12 = new Image(fc12.toURI().toString());
    File fc13 = new File("D:\\Documents\\NetBeansProjects\\ang\\src\\C13PNG.jpg");
    Image temp13 = new Image(fc13.toURI().toString());
    File fc14 = new File("D:\\Documents\\NetBeansProjects\\ang\\src\\C14PNG.jpg");
    Image temp14 = new Image(fc14.toURI().toString());
    File fc15 = new File("D:\\Documents\\NetBeansProjects\\ang\\src\\C15PNG.jpg");
    Image temp15 = new Image(fc15.toURI().toString());
    File fc16 = new File("D:\\Documents\\NetBeansProjects\\ang\\src\\C16PNG.jpg");
    Image temp16 = new Image(fc16.toURI().toString());
    
    Character3 activePlayer = new Character3();
    Dice dice1 = new Dice(activePlayer);
    Dice dice2 = new Dice(activePlayer);
    Dice dice3 = new Dice(activePlayer);
    Dice dice4 = new Dice(activePlayer);
    Dice dice5 = new Dice(activePlayer);
    
    
    @FXML
    public void start(ActionEvent event) throws InterruptedException {
//        HP.setText("HP: " + activePlayer.gethp());
        roll.setDisable(false);
        playRole.setVisible(true);
        start.setVisible(false);
        start.setDisable(true);
        nextTurn.setDisable(false);
        setup.insertPlayer();
        setup.giveRole();
        activePlayer = setup.getArrayList().get(0);
        playerCheck(activePlayer);
        int role = setup.getArrayList().get(setup.player_position).getrole();
        System.out.println(setup.player_position);
        for (int i = 0; i < FXMLDocumentController.playerNum; i++) {
            int compRole = setup.getArrayList().get(i).getrole();
            String CPUrole = checkRole(compRole);
            if (i == 0) {
                bot1.setVisible(true);
                pos0.setVisible(true);
                if (i == setup.player_position)
                    bot1.setText(setup.getArrayList().get(i).name + checkPlayRole(role) + "\nHP: " + setup.getArrayList().get(i).gethp());
                else
                    bot1.setText(setup.getArrayList().get(i).name + CPUrole + "\nHP: " + setup.getArrayList().get(i).gethp());
            }
            if (i == 1) {
                bot2.setVisible(true);
                pos1.setVisible(true);
                if (i == setup.player_position)
                    bot2.setText(setup.getArrayList().get(i).name + checkPlayRole(role) + "\nHP: " + setup.getArrayList().get(i).gethp());
                else
                    bot2.setText(setup.getArrayList().get(i).name + CPUrole + "\nHP: " + setup.getArrayList().get(i).gethp());
            }
            if (i == 2) {
                bot3.setVisible(true);
                pos2.setVisible(true);
                if (i == setup.player_position)
                    bot3.setText(setup.getArrayList().get(i).name + checkPlayRole(role) + "\nHP: " + setup.getArrayList().get(i).gethp());
                else
                    bot3.setText(setup.getArrayList().get(i).name + CPUrole + "\nHP: " + setup.getArrayList().get(i).gethp());
            }
            if (i == 3) {
                bot4.setVisible(true);
                pos3.setVisible(true);
                if (i == setup.player_position)
                    bot4.setText(setup.getArrayList().get(i).name + checkPlayRole(role) + "\nHP: " + setup.getArrayList().get(i).gethp());
                else
                    bot4.setText(setup.getArrayList().get(i).name + CPUrole + "\nHP: " + setup.getArrayList().get(i).gethp());
            }
            if (i == 4) {
                bot5.setVisible(true);
                pos4.setVisible(true);
                if (i == setup.player_position)
                    bot5.setText(setup.getArrayList().get(i).name + checkPlayRole(role) + "\nHP: " + setup.getArrayList().get(i).gethp());
                else 
                    bot5.setText(setup.getArrayList().get(i).name + CPUrole + "\nHP: " + setup.getArrayList().get(i).gethp());
            }
            if (i == 5) {
                bot6.setVisible(true);
                pos5.setVisible(true);
                if (i == setup.player_position)
                    bot6.setText(setup.getArrayList().get(i).name + checkPlayRole(role) + "\nHP: " + setup.getArrayList().get(i).gethp());
                else
                    bot6.setText(setup.getArrayList().get(i).name + CPUrole + "\nHP: " + setup.getArrayList().get(i).gethp());
            }
            if (i == 6) {
                bot7.setVisible(true);
                pos6.setVisible(true);
                if (i == setup.player_position)
                    bot7.setText(setup.getArrayList().get(i).name + checkPlayRole(role) + "\nHP: " + setup.getArrayList().get(i).gethp());
                else
                    bot7.setText(setup.getArrayList().get(i).name + CPUrole + "\nHP: " + setup.getArrayList().get(i).gethp());
            }
            if (i == 7) {
                player.setVisible(true);
                pos7.setVisible(true);
                if (i == setup.player_position)
                    player.setText(setup.getArrayList().get(i).name + checkPlayRole(role) + "\nHP: " + setup.getArrayList().get(i).gethp());
                else
                    player.setText(setup.getArrayList().get(i).name + CPUrole + "\nHP: " + setup.getArrayList().get(i).gethp());
            }
        
        }
        diceList.add(dice1);
        diceList.add(dice2);
        diceList.add(dice3);
        diceList.add(dice4);
        diceList.add(dice5);
        
        turn();
    }
    
    public void roll(ActionEvent event) {
        System.out.println("wgoa");
        DC1.setVisible(true);
        DC2.setVisible(true);
        DC3.setVisible(true);
        DC4.setVisible(true);
        DC5.setVisible(true);
        resolve.setDisable(false);
        
        reroll.setDisable(false);
        dice1.rollDice();
        diceList.set(0, dice1);
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
        diceList.set(0, dice1);
        diceList.set(1, dice2);
        diceList.set(2, dice3);
        diceList.set(3, dice4);
        diceList.set(4, dice5);
        roll.setDisable(true);
    }
    
    public void reroll(ActionEvent event) {
        Dice.rerollCount++;
        if (Dice.rerollCount == 2)
        {
           reroll.setDisable(true);
           DC1.setVisible(false);
           DC2.setVisible(false);
           DC3.setVisible(false);
           DC4.setVisible(false);
           DC5.setVisible(false);
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
        diceList.set(0, dice1);
        diceList.set(1, dice2);
        diceList.set(2, dice3);
        diceList.set(3, dice4);
        diceList.set(4, dice5);
        DC1.setSelected(false);
        DC2.setSelected(false);
        DC3.setSelected(false);
        DC4.setSelected(false);
        DC5.setSelected(false);
    }
    
    public void nextTurn(ActionEvent event) throws InterruptedException {
        turn();
    }
    
    public void turn() throws InterruptedException {
        
        playPos = setup.player_position;
        
        if (gamePos > FXMLDocumentController.playerNum-1) {
            gamePos = 0;
        }
        
        if (gamePos != playPos) {
            reroll.setDisable(true);
            resolve.setDisable(true);
            activePlayer = setup.getArrayList().get(gamePos);
            playerCheck(activePlayer);
            roll.setDisable(true);
            dice1 = new Dice(activePlayer);
            dice2 = new Dice(activePlayer);
            dice3 = new Dice(activePlayer);
            dice4 = new Dice(activePlayer);
            dice5 = new Dice(activePlayer);
            dice1.resetDice();
            dice2.resetDice();
            dice3.resetDice();
            dice4.resetDice();
            dice5.resetDice();
            DC1.setVisible(false);
            DC2.setVisible(false);
            DC3.setVisible(false);
            DC4.setVisible(false);
            DC5.setVisible(false);
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
        diceList.set(0, dice1);
        diceList.set(1, dice2);
        diceList.set(2, dice3);
        diceList.set(3, dice4);
        diceList.set(4, dice5);
            
        Dice.globalLockDown = true;
        dice1.rollDice();
        checkEnd();
        dice2.rollDice();
        checkEnd();
        dice3.rollDice();
        checkEnd();
        dice4.rollDice();
        checkEnd();
        dice5.rollDice();
        checkEnd();
        for(int i = 0; i < 5; i++) {
            System.out.println(diceList.get(i).getDice());
            }
        playerCheck(activePlayer);
        Action.playerStatus();
        gamePos++;
        if (setup.getArrayList().get(setup.player_position).alive == false) {
            setup.player_position = -1;
        }
        }
        else {
            nextTurn.setDisable(true);
            for(int i = 0; i < 5; i++) {
            System.out.println(diceList.get(i).getDice());
            }
            dice1.resetDice();
            dice2.resetDice();
            dice3.resetDice();
            dice4.resetDice();
            dice5.resetDice();
            activePlayer = setup.getArrayList().get(gamePos);
            playerCheck(activePlayer);
            roll.setDisable(false);
            
        }
        if (gamePos > FXMLDocumentController.playerNum-1) {
            gamePos = 0;
        }
        
        System.out.println("ex = " + ex);
        System.out.println("winCOndition = " + Action.winCondition);

    }
    
    int diceNum = 0;
    int firstResolve = 0;
    public void resolve(ActionEvent event) throws InterruptedException {
        reroll.setDisable(true);
        DC1.setVisible(false);
        DC2.setVisible(false);
        DC3.setVisible(false);
        DC4.setVisible(false);
        DC5.setVisible(false);
        for(int i = 0; i < 5; i++) {
            System.out.println(diceList.get(i).getDice());
            }
        int d = diceList.get(diceNum).getDice();
        System.out.println("D" + d);
        if (firstResolve != 0) {
            
            Dice.globalLockDown = true;
            
            checkTarget();
            if (d == 3)
            {
                System.out.println("one shot");
                if ((abs(targetPos - playPos) == 1) || (abs((targetPos - playPos)) == FXMLDocumentController.playerNum-1)) {
                    diceList.get(diceNum).rollDice();
                }
            }
            if (d == 4)
            {
                System.out.println("two shot");
                if ((abs(targetPos - playPos) == 2) || (abs((targetPos - playPos)) == FXMLDocumentController.playerNum-2)) {
                    diceList.get(diceNum).rollDice();
                }
                if (FXMLDocumentController.playerNum < 4) {
                    if ((abs(targetPos - playPos) == 2) || (abs((targetPos - playPos)) == FXMLDocumentController.playerNum-2) || (abs(targetPos - playPos) == 1) || (abs((targetPos - playPos)) == FXMLDocumentController.playerNum-1)) {
                    diceList.get(diceNum).rollDice();
                }
                }
            }
            if (d == 5)
            {
                System.out.println("heal");
                diceList.get(diceNum).rollDice();
            }
            
            if (diceNum < 4) {
                diceNum++;
            
            d = diceList.get(diceNum).getDice();
            while ((d == 1) || (d == 2) || (d == 6)) {
                System.out.println("This Dice is resolved");
                if (diceNum == 4) {
                    resolve.setDisable(true);
                    nextTurn.setDisable(false);
                    gamePos++;
                    firstResolve = 0;
                    diceNum = 0;
                    break;
                }
                diceNum++;
                d = diceList.get(diceNum).getDice();
            }
                if (d == 3) {
                    System.out.println("Click the checkbox of who you would like to shoot (One Space)");
                }
                if (d == 4) {
                    System.out.println("Click the checkbox of who you would like to shoot (Two Spaces)");
                }
                if (d == 5) {
                    System.out.println("Click the checkbox of who you would like to heal");
                }
            }
            else {
                resolve.setDisable(true);
                nextTurn.setDisable(false);
                gamePos++;
                firstResolve = 0;
                diceNum = 0;
            }

        }
        else {
            if ((d == 1) || (d == 2) || (d == 6)) {
                System.out.println("This dice is resolved");
            }
            if (d == 3) {
                System.out.println("Click the checkbox of who you would like to shoot (One Space)");
            }
            if (d == 4) {
                System.out.println("Click the checkbox of who you would like to shoot (Two Spaces)");
            }
            if (d == 5) {
                System.out.println("Click the checkbox of who you would like to heal");
            }
            firstResolve++;
        }
        Action.playerStatus();
        pos0.setSelected(false);
        pos1.setSelected(false);
        pos2.setSelected(false);
        pos3.setSelected(false);
        pos4.setSelected(false);
        pos5.setSelected(false);
        pos6.setSelected(false);
        pos7.setSelected(false);
        System.out.println("ex = " + ex);
        System.out.println("winCOndition = " + Action.winCondition);
        checkEnd();
        
    }
    
    public void checkTarget() {
        if (pos0.isSelected()) {
            targetPos = 0;
        }
        else if (pos1.isSelected()) {
            targetPos = 1;
        }
        else if (pos2.isSelected()) {
            targetPos = 2;
        }
        else if (pos3.isSelected()) {
            targetPos = 3;
        }
        else if (pos4.isSelected()) {
            targetPos = 4;
        }
        else if (pos5.isSelected()) {
            targetPos = 5;
        }
        else if (pos6.isSelected()) {
            targetPos = 6;
        }
        else if (pos7.isSelected()) {
            targetPos = 7;
        }
        else {
            targetPos = 0;
        }
    }
    
    public String checkPlayRole(int x) {
        switch(x) {
            case 1:
                return("(You) Sheriff");
            case 2:
                return("(You) Renegade");
            case 3:
                return("(You) Outlaw");
            case 4: 
                return("(You) Deputy");
            default:
                return "";
        }

    }
    
    public String checkRole(int x) {
        switch(x) {
            case 1:
                return(" Sheriff");
                //Comment out this for actual game leaving for testings
            case 2:
                return(" Renegade");
            case 3:
                return(" Outlaw");
            case 4: 
                return(" Deputy");
            default:
                return "";
        }
    }
    
    public void playerCheck(Character3 curPlay) {
        HP.setText("HP: " + curPlay.gethp());
        int x = curPlay.getrole();
        if (x == 1)
        {
            playRole.setText("Role: Sheriff");
        }
        else
            playRole.setText("");
        switch(curPlay.getcharnum()) {
        case 1:
            playerChar.setImage(temp);
            break;
        case 2:
            playerChar.setImage(temp2);
            break;
        case 3:
            playerChar.setImage(temp3);
            break;
        case 4:
            playerChar.setImage(temp4);
            break;
        case 5:
            playerChar.setImage(temp5);
            break;
        case 6:
            playerChar.setImage(temp6);
            break;
        case 7:
            playerChar.setImage(temp7);
            break;
        case 8:
            playerChar.setImage(temp8);
            break;
        case 9:
            playerChar.setImage(temp9);
            break;
        case 10:
            playerChar.setImage(temp10);
            break;
        case 11:
            playerChar.setImage(temp11);
            break;
        case 12:
            playerChar.setImage(temp12);
            break;
        case 13:
            playerChar.setImage(temp13);
            break;
        case 14:
            playerChar.setImage(temp14);
            break;
        case 15:
            playerChar.setImage(temp15);
            break;
        case 16:
            playerChar.setImage(temp16);
            break;
        default:
            break;
        }
    }
    
    public void checkEnd() throws InterruptedException {
        if (ex != 0) {
            ex();
        }
    }
    public void close(ActionEvent event) {
//         Stage stage = (Stage) exit.getScene().getWindow();
//         stage.close();
    }
    
    public void ex() throws InterruptedException {
        nextTurn.setVisible(false);
        roll.setVisible(false);
        reroll.setVisible(false);
        resolve.setVisible(false);
        HP.setVisible(false);
        playRole.setVisible(false);
        playerChar.setVisible(false);
        d1.setVisible(false);
        d2.setVisible(false);
        d3.setVisible(false);
        d4.setVisible(false);
        d5.setVisible(false);
        pos0.setVisible(false);
        pos1.setVisible(false);
        pos2.setVisible(false);
        pos3.setVisible(false);
        pos4.setVisible(false);
        pos5.setVisible(false);
        pos6.setVisible(false);
        pos7.setVisible(false);
        DC1.setVisible(false);
        DC2.setVisible(false);
        DC3.setVisible(false);
        DC4.setVisible(false);
        DC5.setVisible(false);
        bot1.setVisible(false);
        bot2.setVisible(false);
        bot3.setVisible(false);
        bot4.setVisible(false);
        bot5.setVisible(false);
        bot6.setVisible(false);
        bot7.setVisible(false);
        if (Action.winCondition != 0) {
            switch(Action.winCondition) {
                case 1:
                    mainText.setText("Sheriff and Deputys Win!");
                    break;
                case 2:
                    mainText.setText("Renegades Win!");
                    break;
                case 3:
                    mainText.setText("Outlaws Win!");
                    break;
            }
//            while (Action.winCondition != 0) {
                System.out.println("wghile");
//            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
