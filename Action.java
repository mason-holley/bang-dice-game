//CS2365 OOP Spring 2020 
//Project 3: bang the dice game

package bang_game;
import java.util.Random;

/**
 *This class is used to implement all the dice actions and actions needs to take during the game
 * @author vincenthew
 */
public class Action {
    private Player actPlayer;
    private int optionL = 0;
    private int optionR = 0;
    /**
     *This constructor assign the current player to actPlayer object
     * @author vincenthew
     * @param self (Player object)
     */
    public Action(Player self) {
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
            arrowHeld = setup.getArrayList().get(i).getArrow();
            loseHP(setup.getArrayList().get(i), arrowHeld);
            setup.getArrayList().get(i).resetSelfArrow();
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
        addArrowBack(actPlayer.getArrow());
        actPlayer.resetSelfArrow();
    }
    /**
     *This method is used to resolve the dice effect for bull eye 1
     * which will attack the target on the left or right whose distance by 1 based on the threat level from the decision graph
     * @author vincenthew
     */
    public void actBullet_1() {
        int left = 0;
        int right = 0;
        Player actTarget = new Player();
        Random rand = new Random();
        left = leftTargetPos(setup.getArrayList().indexOf(actPlayer));
        right = rightTargetPos(setup.getArrayList().indexOf(actPlayer));
        optionL = Decision.getThreatLv(actPlayer.getOriPos(), setup.getArrayList().get(left).getOriPos());
        optionR = Decision.getThreatLv(actPlayer.getOriPos(), setup.getArrayList().get(right).getOriPos());
        if(actPlayer.getRole() == 2 && (setup.getArrayList().get(left).getRole() == 1 || setup.getArrayList().get(right).getRole() == 1)) {
            if(setup.getArrayList().get(left).getRole() == 1) {
                if(setup.getArrayList().get(left).getHP() > actPlayer.getHP()) {
                    loseHP(setup.getArrayList().get(left), 1);
                    actTarget = setup.getArrayList().get(left);
                }
                else {
                    loseHP(setup.getArrayList().get(right), 1);
                    actTarget = setup.getArrayList().get(right);
                }
            }
            else if(setup.getArrayList().get(right).getRole() == 1) {
                if(setup.getArrayList().get(right).getHP() > actPlayer.getHP()) {
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
        if(actTarget.getRole() == 1)
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
        Player actTarget = new Player();
        Random rand = new Random();
        if(setup.getArrayList().size() == 3 || setup.getArrayList().size() == 2)
            actBullet_1();
        else {
            left = leftTargetPos((setup.getArrayList().indexOf(actPlayer))+1);
            right = rightTargetPos((setup.getArrayList().indexOf(actPlayer))-1);
            optionL = Decision.getThreatLv(actPlayer.getOriPos(), setup.getArrayList().get(left).getOriPos());
            optionR = Decision.getThreatLv(actPlayer.getOriPos(), setup.getArrayList().get(right).getOriPos());
            if(actPlayer.getRole() == 2 && (setup.getArrayList().get(left).getRole() == 1 || setup.getArrayList().get(right).getRole() == 1)) {
                if(setup.getArrayList().get(left).getRole() == 1) {
                    if(setup.getArrayList().get(left).getHP() > actPlayer.getHP()) {
                        loseHP(setup.getArrayList().get(left), 1);
                        actTarget = setup.getArrayList().get(left);
                    }
                    else {
                        loseHP(setup.getArrayList().get(right), 1);
                        actTarget = setup.getArrayList().get(right);
                    }
                }
                else if(setup.getArrayList().get(right).getRole() == 1) {
                    if(setup.getArrayList().get(right).getHP() > actPlayer.getHP()) {
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
            if(actTarget.getRole() == 1)
                Decision.updateGraph(actPlayer, 0);
        }
    }
    /**
     *This method is used to resolve the dice effect of beer
     * which will choose one player by specific strategy and heal the player by 1 health point
     * @author Vincent Hew
     */
    public void actBeer() {
        Player actTarget = new Player();
        if(actPlayer.getRole() == 2) {
            if(searchPlayer(1).getHP() < 5 && TB.outlawsCount > 0 && actPlayer.getHP() > searchPlayer(1).getHP()) {
                gainHP(setup.getArrayList().get(searchSheriff()), 1);
                actTarget = setup.getArrayList().get(searchSheriff());
            }
            else {
                gainHP(actPlayer, 1);
                actTarget = actPlayer;
            }
        }
        else if(actPlayer.getRole() == 4) {
            if(searchPlayer(1).getHP() != searchPlayer(1).getInitialHP()) {
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
        if(actTarget.equals(actPlayer) == false && actTarget.getRole() == 1) 
            Decision.updateGraph(actPlayer, 1);
    }
    /**
     *This method is used to take amount of health point out from the player
     * @author Vincent Hew
     * @param actor
     * @param hpVal (amount of health point to lose from player)
     */
    public void loseHP(Player actor, int hpVal) {
        actor.setHP(actor.getHP() - hpVal);
        if(actor.getHP() <= 0) {
            //dead condition
            actor.setHP(0);
        }
    }
    /**
     *This method is used to add amount of health point to the player
     * @author Vincent Hew
     * @param actor
     * @param hpVal (amount of health point to add on player)
     */
    public void gainHP(Player actor, int hpVal) {
        actor.setHP(actor.getHP() + hpVal);
        if(actor.getHP() >= actor.getInitialHP()) {
            //over heal condition
            actor.setHP(actor.getInitialHP());
        }
    }
    /**
     * This method is used to add one arrow to the player
     *@author Vincent Hew
     */
    public void gainArrow() {
        actPlayer.addArrow(1);
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
     * @return foundPlayer (Player type)
     */
    public static Player searchPlayer(int roleSearch) {
        Player foundPlayer = new Player();
        for(int i = 0; i < setup.getArrayList().size(); i++) {
            if(setup.getArrayList().get(i).getRole() == roleSearch) 
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
            if(setup.getArrayList().get(i).getRole() == 1)
                sheriffPos = i;
        }
        return sheriffPos;
    }
}
