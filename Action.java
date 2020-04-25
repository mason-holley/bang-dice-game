
package bang_game;
/**
 *
 * @author vincenthew
 */
public class Action {
    private Player actPlayer;
    public Action(Player self) {
        actPlayer = self;
    }
    
    public void actArrows() {
        int arrowHeld = 0;
        for(int i = 0; i < TB.getList().size(); i++) {
            arrowHeld = TB.getList().get(i).getArrow();
            loseHP(TB.getList().get(i), arrowHeld);
            TB.getList().get(i).resetSelfArrow();
            addArrowBack(arrowHeld);
        }
    }
    public void actDynamite() {
        loseHP(actPlayer, 1);
    }
    public void actGatling() {
        for(int i = 0; i < TB.getList().size(); i++) {
            if(TB.getList().get(i).equals(actPlayer) == false) 
                loseHP(TB.getList().get(i), 1);
            addArrowBack(actPlayer.getArrow());
            actPlayer.resetSelfArrow();
        }
    }
    public void actBullet_1(int direction) {
        int target = 0;
        if(direction == 0) {
            target = leftTargetPos(TB.getList().indexOf(actPlayer));
            loseHP(TB.getList().get(target), 1);
        }
        else if(direction == 1) {
            target = rightTargetPos(TB.getList().indexOf(actPlayer));
            loseHP(TB.getList().get(target), 1);
        }
    }
    public void actBullet_2(int direction) {
        int target = 0;
        if(TB.getList().size() == 3 || TB.getList().size() == 2)
            actBullet_1(direction);
        else if(TB.getList().size() > 3 && direction == 0) {
            target = leftTargetPos((TB.getList().indexOf(actPlayer))+1);
            loseHP(TB.getList().get(target), 1);
        }
        else if(TB.getList().size() > 3 && direction == 1) {
            target = rightTargetPos((TB.getList().indexOf(actPlayer))-1);
            loseHP(TB.getList().get(target), 1);
        }
    }
    public void actBeer(int target) {
        gainHP(TB.getList().get(target), 1);
    }
    public void loseHP(Player actor, int hpVal) {
        actor.setHP(actor.getHP() - hpVal);
        if(actor.getHP() <= 0) {
            //dead condition
            actor.setHP(0);
        }
    }
    public void gainHP(Player actor, int hpVal) {
        actor.setHP(actor.getHP() + hpVal);
        if(actor.getHP() >= 9) {
            //over heal condition
            actor.setHP(9);
        }
    }
    public void gainArrow() {
        actPlayer.addArrow(1);
    }
    public void addArrowBack(int val) {
        Dice.setArrowPile(Dice.getArrowPile() + val);
    }
    
    //targeting system
    public static int leftTargetPos(int self) {
        int targetPos;
        targetPos = self + 1;
        //when the self position is at the end of list
        if(targetPos >= TB.getList().size()) {
            targetPos = targetPos - TB.getList().size();
        }
        return targetPos;
    }
    public static int rightTargetPos(int self) {
        int targetPos;
        targetPos = self - 1;
        //when the self position is at the begining of list
        if(targetPos < 0) {
            targetPos = targetPos + TB.getList().size();
        }
        return targetPos;
    }
}
