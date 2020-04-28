//CS2365 OOP Spring 2020 
//Project 3: bang the dice game
/*
 *  1 = arrow
 *  2 = Dynamite 
 *  3 = bull eye 1
 *  4 = bull eye 2
 *  5 = beer
 *  6 = gatling
*/
package bang_game;
import java.util.Random;

/**
 *This class is used to implement the die
 * @author Vincent Hew
 */
public class Dice{
    private int diceResult;
    private boolean lock;
    public static boolean globalLockDown;
    private int solveCount;
    private static int arrows;
    private static int dynamite;
    private static int gatling;
    private static int firstRoll;
    public static int rerollCount;
    private Action diceAct;
    /**
     * This constructor is used to create a dice object with default attributes
     *@author Vincent Hew
     * @param self (current player: Player)
     */
    public Dice(Player self) {
        diceResult = 0;
        arrows = 9;
        dynamite = 0;
        gatling = 0;
        lock = false;
        globalLockDown = false;
        rerollCount = 0;
        solveCount = 0;
        firstRoll = 0;
        diceAct = new Action(self);
    }
    /**
     *This method is used to roll the single dice and resolve after the dice is locked
     * @author Vincent Hew
     */
    public void rollDice(){
        Random randDice = new Random();
        if(rerollCount == 0) {
            firstRoll++;
        }
        //dice cannot reroll more than twice
        if(rerollCount > 2) {
            lock = true;
            globalLockDown = true;
        }
        if(lock == false && globalLockDown == false) {
            diceResult = randDice.nextInt(6)+1;
        }
        else if(lock == true || globalLockDown == true) {
            if(dynamite >= 3 && firstRoll == 5) {
                System.out.println(">ALERT: Global lock down");
            }
            else
                System.out.println(">ALERT: Dice cannot be rerolled.");
            diceResolve();
        }
        //resolve arrows and dynamite immediately
        if(lock == false && globalLockDown == false) {
            switch(diceResult) {
                case 1:
                    arrows--;
                    diceAct.gainArrow();
                    //when the arrow pile is empty
                    if(arrows == 0) {
                        diceAct.actArrows();
                    }
                    break;
                case 2:
                    dynamite++;
                    lock = true;
                    //when there are three dyn
                    if(dynamite >= 3 && firstRoll == 5) {
                        globalLockDown = true;
                        diceAct.actDynamite();
                        for(int i = 0; i < Bang_game.diceList.size(); i++) {
                            Bang_game.diceList.get(i).rollDice();
                        }
                    }
                    break;
            }
        }
    }
    /**
     *This method is used to lock the single dice
     * @author Vincent Hew
     * @param lockStatus (true is lock the dice; false is unlock the dice: boolean)
     */
    public void diceLock(boolean lockStatus) {
        if(lockStatus == true)
            lock = true;
        else
            lock = false;
    }
    /**
     *This method is used to access the diceResult and return the value
     * @author Vincent Hew
     * @return temp (dice result: int)
     */
    public int getDice() {
        int temp;
        temp = diceResult;
        return temp;
    }
    /**
     * This method is used to resolve the dice result only for bull eye 1, bull eye 2, beer, and gatling
     * @author Vincent Hew
     */
    private void diceResolve(){
        solveCount++;
        if(solveCount == 1) {
            switch(diceResult) {
                case 3:
                    diceAct.actBullet_1();
                    break;
                case 4:
                    diceAct.actBullet_2();
                    break;
                case 5:
                    diceAct.actBeer();
                    break;
                case 6:
                    gatling++;
                    if(gatling >= 3) {
                        diceAct.actGatling();
                    }
                    break;                
            }
        }
    }
    /**
     *This method is used to get access to the arrow pile value and return how many arrows left in the pile
     * @author Vincent Hew
     * @return temp (arrows left in the pile: int)
     */
    public static int getArrowPile() {
        int temp = arrows;
        return temp;
    }
    /**
     *This method is used to set the value to the arrow pile
     * @author Vincent Hew
     * @param val (arrows to set the pile: int)
     */
    public static void setArrowPile(int val) {
        arrows = val;
    }
    /**
     *This method is to reset the single dice back to the default value
     * @author Vincent Hew
     */
    public void resetDice() {
        diceResult = 0;
        dynamite = 0;
        gatling = 0;
        rerollCount = 0;
        solveCount = 0;
        firstRoll = 0;
        lock = false;
        globalLockDown = false;
    }
}
