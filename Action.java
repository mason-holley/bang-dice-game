//CS2365 OOP Spring 2020 
//Project 3: bang the dice game

package ang;
import java.util.Random;

/**
 *This class is used to implement all the dice actions and actions needs to take during the game
 * @author vincenthew
 */
public class Action {
    public static Character3 winnerRenegade = new Character3();
    public static int winCondition = 0;
    private Character3 actPlayer;
    private int optionL = 0;
    private int optionR = 0;
    /**
     *This constructor assign the current player to actPlayer object
     * @author vincenthew
     * @param self (Player object)
     */
    public Action(Character3 self) {
        this.actPlayer = self;
    }
    /**
     *This method is used to resolve the dice effect when there is no arrow left in the pile
     * which the players will lose health point based on the arrows they have and return them back to pile
     * @author vincenthew
     */
    public void actArrows() {
        int arrowHeld = 0;
        for(int i = 0; i < setup.getArrayList().size(); i++) {
            arrowHeld = setup.getArrayList().get(i).getarrows();
            loseHP(setup.getArrayList().get(i), arrowHeld);
            setup.getArrayList().get(i).setarrows(0);
            addArrowBack(arrowHeld);
        }
    }
    /**
     * This method is used to resolve the dice effect when there are 3 or more dynamite
     * which will let the current player lose 1 health point
     *@author vincenthew
     */
    public void actDynamite() {
        loseHP(actPlayer, 1);
    }
    /**
     *This method is used to resolve the dice effect when there are 3 or more gatling
     * which everyone except the current player will lose 1 health point, and the current player will discard all the arrows he held
     * @author vincenthew
     */
    public void actGatling() {
        for(int i = 0; i < setup.getArrayList().size(); i++) {
            if(setup.getArrayList().get(i).equals(actPlayer) == false) 
                loseHP(setup.getArrayList().get(i), 1);
        }
        addArrowBack(actPlayer.getarrows());
        actPlayer.setarrows(0);
    }
    /**
     *This method is used to resolve the dice effect for bull eye 1
     * which will attack the target on the left or right whose distance by 1 based on the threat level from the decision graph
     * @author vincenthew
     */
    public void actBullet_1() {
        int left = 0;
        int right = 0;
        Character3 actTarget = new Character3();
        Random rand = new Random();
        left = leftTargetPos(setup.getArrayList().indexOf(actPlayer));
        right = rightTargetPos(setup.getArrayList().indexOf(actPlayer));
        optionL = Decision.getThreatLv(actPlayer.getstartposition(), setup.getArrayList().get(left).getstartposition());
        optionR = Decision.getThreatLv(actPlayer.getstartposition(), setup.getArrayList().get(right).getstartposition());
        if(actPlayer.getrole() == 2 && (setup.getArrayList().get(left).getrole() == 1 || setup.getArrayList().get(right).getrole() == 1)) {
            if(setup.getArrayList().get(left).getrole() == 1) {
                if(setup.getArrayList().get(left).gethp() > actPlayer.gethp()) {
                    loseHP(setup.getArrayList().get(left), 1);
                    actTarget = setup.getArrayList().get(left);
                }
                else {
                    loseHP(setup.getArrayList().get(right), 1);
                    actTarget = setup.getArrayList().get(right);
                }
            }
            else if(setup.getArrayList().get(right).getrole() == 1) {
                if(setup.getArrayList().get(right).gethp() > actPlayer.gethp()) {
                    loseHP(setup.getArrayList().get(right), 1);
                    actTarget = setup.getArrayList().get(right);
                }
                else {
                    loseHP(setup.getArrayList().get(left), 1);
                    actTarget = setup.getArrayList().get(left);
                }
            }  
        }
        else if(optionL > optionR) {
            loseHP(setup.getArrayList().get(left), 1);
            actTarget = setup.getArrayList().get(left);
        }
        else if(optionL < optionR) {
            loseHP(setup.getArrayList().get(right), 1);
            actTarget = setup.getArrayList().get(right);
        }
        else if(optionL == optionR) {
            if(rand.nextInt(2) == 0) {
                loseHP(setup.getArrayList().get(left), 1);
                actTarget = setup.getArrayList().get(left);
            }
            else {
                loseHP(setup.getArrayList().get(right), 1);
                actTarget = setup.getArrayList().get(right);
            }
        }
        // update graph
        if(actTarget.getrole() == 1)
            Decision.updateGraph(actPlayer, 0);
    }
    /**
     *This method is used to resolve the dice effect of bull eye 2
     * which will attack the target on the left or right whose distance by 2 based on the threat level from the decision graph
     * exception: when there are only 2 or 3 total player left, it will take the same action as bull eye 1
     * @author vincenthew
     */
    public void actBullet_2() {
        int left = 0;
        int right = 0;
        Character3 actTarget = new Character3();
        Random rand = new Random();
        if(setup.getArrayList().size() == 3 || setup.getArrayList().size() == 2)
            actBullet_1();
        else {
            left = leftTargetPos((setup.getArrayList().indexOf(actPlayer))+1);
            right = rightTargetPos((setup.getArrayList().indexOf(actPlayer))-1);
            optionL = Decision.getThreatLv(actPlayer.getstartposition(), setup.getArrayList().get(left).getstartposition());
            optionR = Decision.getThreatLv(actPlayer.getstartposition(), setup.getArrayList().get(right).getstartposition());
            if(actPlayer.getrole() == 2 && (setup.getArrayList().get(left).getrole() == 1 || setup.getArrayList().get(right).getrole() == 1)) {
                if(setup.getArrayList().get(left).getrole() == 1) {
                    if(setup.getArrayList().get(left).gethp() > actPlayer.gethp()) {
                        loseHP(setup.getArrayList().get(left), 1);
                        actTarget = setup.getArrayList().get(left);
                    }
                    else {
                        loseHP(setup.getArrayList().get(right), 1);
                        actTarget = setup.getArrayList().get(right);
                    }
                }
                else if(setup.getArrayList().get(right).getrole() == 1) {
                    if(setup.getArrayList().get(right).gethp() > actPlayer.gethp()) {
                        loseHP(setup.getArrayList().get(right), 1);
                        actTarget = setup.getArrayList().get(right);
                    }
                    else {
                        loseHP(setup.getArrayList().get(left), 1);
                        actTarget = setup.getArrayList().get(left);
                    }
                }  
            }
            else if(optionL > optionR) {
                loseHP(setup.getArrayList().get(left), 1);
                actTarget = setup.getArrayList().get(left);
            }
            else if(optionL < optionR) {
                loseHP(setup.getArrayList().get(right), 1);
                actTarget = setup.getArrayList().get(right);
            }
            else if(optionL == optionR) {
                if(rand.nextInt(2) == 0) {
                    loseHP(setup.getArrayList().get(left), 1);
                    actTarget = setup.getArrayList().get(left);
                }
                else {
                    loseHP(setup.getArrayList().get(right), 1);
                    actTarget = setup.getArrayList().get(right);
                }
            }
            // update graph
            if(actTarget.getrole() == 1)
                Decision.updateGraph(actPlayer, 0);
        }
    }
    /**
     *This method is used to resolve the dice effect of beer
     * which will choose one player by specific strategy and heal the player by 1 health point
     * @author Vincent Hew
     */
    public void actBeer() {
        Character3 actTarget = new Character3();
        if(actPlayer.getrole() == 2) {
            if(searchPlayer(1).gethp() < 5 && setup.outlaw > 0 && actPlayer.gethp() > searchPlayer(1).gethp()) {
                gainHP(setup.getArrayList().get(searchSheriff()), 1);
                actTarget = setup.getArrayList().get(searchSheriff());
            }
            else {
                gainHP(actPlayer, 1);
                actTarget = actPlayer;
            }
        }
        else if(actPlayer.getrole() == 4) {
            if(searchPlayer(1).gethp() != searchPlayer(1).getstarthp()) {
                gainHP(setup.getArrayList().get(searchSheriff()), 1);
                actTarget = setup.getArrayList().get(searchSheriff());
            }
            else {
                gainHP(actPlayer, 1);
                actTarget = actPlayer;
            }
        }
        else {
            gainHP(actPlayer, 1);
            actTarget = actPlayer;
        }
        // update graph
        if(actTarget.equals(actPlayer) == false && actTarget.getrole() == 1) 
            Decision.updateGraph(actPlayer, 1);
    }
    /**
     *This method is used to take amount of health point out from the player
     * This method will also check the win condition and remove the dead player from the list
     * @author Vincent Hew
     * @param actor
     * @param hpVal (amount of health point to lose from player)
     */
    public void loseHP(Character3 actor, int hpVal) {
        actor.sethp(actor.gethp() - hpVal);
        if(actor.gethp() <= 0) {
            //dead condition
            actor.sethp(0);
            actor.setdead();
            if(actor.getrole() == 2)
                setup.renegade--;
            else if(actor.getrole() == 3)
                setup.outlaw--;
            else if(actor.getrole() == 4)
                setup.deputy--;
            setup.removePlayer(actor.getposition());
            if(winCondition == 0)
                winCondition = victoryCheck();
        }
    }
    /**
     *This method is used to add amount of health point to the player
     * @author Vincent Hew
     * @param actor
     * @param hpVal (amount of health point to add on player)
     */
    public void gainHP(Character3 actor, int hpVal) {
        actor.sethp(actor.gethp() + hpVal);
        if(actor.gethp() >= actor.getstarthp()) {
            //over heal condition
            actor.sethp(actor.getstarthp());
        }
    }
    /**
     * This method is used to add one arrow to the player
     *@author Vincent Hew
     */
    public void gainArrow() {
        actPlayer.addarrows(1);
    }
    /**
     *This method is used to add the arrows that player held back to the pile
     * @author Vincent Hew
     * @param val
     */
    public void addArrowBack(int val) {
        Dice.setArrowPile(Dice.getArrowPile() + val);
    }
    /**
     *This method is used to find the left available target position
     * @author Vincent Hew
     * @param self (self position)
     * @return targetPos (left target position)
     */
    public static int leftTargetPos(int self) {
        int targetPos;
        targetPos = self + 1;
        //when the self position is at the end of list
        if(targetPos >= setup.getArrayList().size()) {
            targetPos = targetPos - setup.getArrayList().size();
        }
        return targetPos;
    }
    /**
     *This method is used to find the right available target position
     * @author Vincent Hew
     * @param self (self position)
     * @return targetPos (right target position)
     */
    public static int rightTargetPos(int self) {
        int targetPos;
        targetPos = self - 1;
        //when the self position is at the begining of list
        if(targetPos < 0) {
            targetPos = targetPos + setup.getArrayList().size();
        }
        return targetPos;
    }
    /**
     *This method is used to search the player through the arrayList by their role
     * @author Vincent Hew
     * @param roleSearch (int: their role)
     * @return foundPlayer (Character3 type)
     */
    public static Character3 searchPlayer(int roleSearch) {
        Character3 foundPlayer = new Character3();
        for(int i = 0; i < setup.getArrayList().size(); i++) {
            if(setup.getArrayList().get(i).getrole() == roleSearch) 
                foundPlayer = setup.getArrayList().get(i);
        }
        return foundPlayer;
    }
    /**
     *This method is used to find the sheriff through the arrayList and return the sheriff position
     * @author Vincent Hew
     * @return sheriffPos (sheriff position)
     */
    public static int searchSheriff() {
        int sheriffPos = 0;
        for(int i = 0; i < setup.getArrayList().size(); i++) {
            if(setup.getArrayList().get(i).getrole() == 1)
                sheriffPos = i;
        }
        return sheriffPos;
    }
    /**
     * This method is used to check the win condition. 
     * If it returns 0 means the game will continue and no one win,
     * If it return 1 means sheriff and deputies win as a team
     * If it return 2 means the specific last renegade wins
     * If it return 3 means outlaws win as a team
     * @author Vincent Hew
     * @return winner
     */
    public static int victoryCheck() {
        int winRole = 0;
        //renegade win
        if(setup.getArrayList().size() == 1 && setup.renegade == 1) {
            winnerRenegade = setup.getArrayList().get(0);
            winRole = winnerRenegade.getrole(); //should be 2
            System.out.println("Renegade character: " + winnerRenegade.name + " wins!");
        }
        //outlaws win
        else if(setup.getArrayList().get(searchSheriff()).alive == false && setup.outlaw != 0) {
            System.out.println("Outlaws win!");
            winRole = 3;
        }
        //sheriff and deputies win
        else if(setup.getArrayList().get(searchSheriff()).alive == true && setup.renegade == 0 && setup.outlaw == 0) {
            System.out.println("Sheriff and deputies win!");
            winRole = 1;
        }
        return winRole;
    }
}
