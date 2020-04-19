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
    private static int arrows;
    private static int dynamite;
    private static int gatling;
    private boolean lock;
    public static int rerollCount;
    private Action diceAct = new Action();
    
    public Dice() {
        diceResult = 0;
        arrows = 9;
        dynamite = 0;
        gatling = 0;
        lock = false;
        rerollCount = 0;
    }
    
    public void rollDice(){
        Random randDice = new Random();
        //dice cannot reroll more than twice
        if(rerollCount > 2) {
            lock = true;
        }
        if(lock == false) {
            diceResult = randDice.nextInt(6)+1;
        }
        else if(lock == true) {
            System.out.println(">ALERT: Dice cannot be rerolled.");
            diceResolve();
        }
        //resolve arrows and dynamite immediately
        if(lock == false) {
            switch(diceResult) {
                case 1:
                    arrows--;
                    if(arrows == 0) {
                        diceAct.actArrows();
                        System.out.println(">Trigger: indian attack due to 0 arrows left");
                    }
                    break;
                case 2:
                    dynamite++;
                    lock = true;
                    if(dynamite >= 3) {
                        diceAct.actDynamite();
                        System.out.println(">Trigger: turn ends immediately due to " + dynamite + " dynamites");
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
    
    public void resetDice() {
        diceResult = 0;
        dynamite = 0;
        gatling = 0;
        rerollCount = 0;
        lock = false;
    }
}
