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
 *
 * @author vincenthew
 */
public class Dice{
    private int diceResult;
    private boolean lock;
    private static boolean globalLockDown;
    private int solveCount;
    private static int arrows;
    private static int dynamite;
    private static int gatling;
    private static int firstRoll;
    public static int rerollCount;
    private Action diceAct;
    
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
    
    public void diceLock(boolean lockStatus) {
        if(lockStatus == true)
            lock = true;
        else
            lock = false;
    }
    
    public int getDice() {
        int temp;
        temp = diceResult;
        return temp;
    }
    
    private void diceResolve(){
        Random randDecision = new Random();
        int targetDecision = 0;
        solveCount++;
        if(solveCount == 1) {
            switch(diceResult) {
                case 3:
                    targetDecision = randDecision.nextInt(1);
                    diceAct.actBullet_1(targetDecision);
                    break;
                case 4:
                    targetDecision = randDecision.nextInt(1);
                    diceAct.actBullet_2(targetDecision);
                    break;
                case 5:
                    targetDecision = randDecision.nextInt(TB.getList().size());
                    diceAct.actBeer(targetDecision);
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
    
    public static int getArrowPile() {
        int temp = arrows;
        return temp;
    }
    public static void setArrowPile(int val) {
        arrows = val;
    }
    
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
