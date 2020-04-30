//CS2365 OOP Spring 2020 
//Project 3: bang the dice game

package bang_game;
import java.util.*;

/**
 *This class is used to create the decision graph so that the bot player can adjust their strategy during the game
 * @author vincenthew
 */
public class Decision {
    private static int[][] decisionGraph = new int[8][8];
    private static ArrayList<Character3> list = setup.getArrayList();
    /**
     * This static method is used to create the initial graph depends on each of player's role.
     * The default value for the empty space is -1
     *@author Vincent Hew
     */
    public static void createGraph() {
        //initaillze the graph to all -1
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                decisionGraph[i][j] = -1;
            }
        }
        //adjust strategies based on their role
        int column = 0;
        for(int row = 0; row < list.size(); row++) {
            switch(list.get(row).getrole()) {
                case 1:     //sheriff
                    for(column = 0; column < list.size(); column++) {
                        if(row == column)
                            decisionGraph[row][column] = 0;
                        else if(list.size() == 4)
                            decisionGraph[row][column] = 100;
                        else if(list.size() > 4)
                            decisionGraph[row][column] = 50;
                    }
                    break;
                case 2:     //renegades
                    for(column = 0; column < list.size(); column++) {
                        if(row == column)
                            decisionGraph[row][column] = 0;
                        else
                            decisionGraph[row][column] = 50;
                    }
                    break;
                case 3:     //outlaws
                    for(column = 0; column < list.size(); column++) {
                        if(row == column)
                            decisionGraph[row][column] = 0;
                        else if(list.get(column).getrole() == 1)
                            decisionGraph[row][column] = 100;
                        else if(list.size() > 4)
                            decisionGraph[row][column] = 50;
                        else if(list.size() == 4)
                            decisionGraph[row][column] = 0;
                    }
                    break;
                case 4:     //deputies
                    for(column = 0; column < list.size(); column++) {
                        if(row == column)
                            decisionGraph[row][column] = 0;
                        else if(list.get(column).getrole() == 1)
                            decisionGraph[row][column] = 0;
                        else if(list.size()== 5 || list.size() == 6)
                            decisionGraph[row][column] = 100;
                        else if(list.size()== 7 || list.size() == 8)
                            decisionGraph[row][column] = 50;
                    }
                    break;
            }
        }
    }
    /**
     * This static method is used to display the decision graph, and this will not print out the value of -1
     *@author Vincent Hew
     */
    public static void displayGraph() {
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if(decisionGraph[i][j] != -1)
                    System.out.print(decisionGraph[i][j] + "\t");
            }
            System.out.println();
        }
    }
    /**
     * This static method is used to update the decision graph after each time an actor either attack or heal the sheriff. 
     * The parameter of sheriffResult 0 is when the actor attack the sheriff, and 1 is when the actor heal the sheriff
     * @author Vincent Hew
     * @param actor (Character3 object)
     * @param sheriffResult (0: attack; 1: heal)
     */
    public static void updateGraph(Character3 actor, int sheriffResult) {
        int prev = 0;
        if(sheriffResult == 0) {        // sheriff get attacked by actor
            for(int i = 0; i < setup.getArrayList().size(); i++) {
                if(setup.getArrayList().get(i).equals(actor) == false) {
                    prev = decisionGraph[setup.getArrayList().get(i).getstartposition()][actor.getstartposition()];
                    switch(setup.getArrayList().get(i).getrole()) {
                        case 1:
                            decisionGraph[setup.getArrayList().get(i).getstartposition()][actor.getstartposition()] += 13;
                            if(decisionGraph[setup.getArrayList().get(i).getstartposition()][actor.getstartposition()] >= 100 && prev == 100)
                                decisionGraph[setup.getArrayList().get(i).getstartposition()][actor.getstartposition()] = 100;
                            else if(decisionGraph[setup.getArrayList().get(i).getstartposition()][actor.getstartposition()] >= 100 && prev != 100)
                                decisionGraph[setup.getArrayList().get(i).getstartposition()][actor.getstartposition()] = 99;
                            break;
                        case 2:
                            break;
                        case 3:
                            decisionGraph[setup.getArrayList().get(i).getstartposition()][actor.getstartposition()] -= 7;
                            if(decisionGraph[setup.getArrayList().get(i).getstartposition()][actor.getstartposition()] <= 0 && prev == 0)
                                decisionGraph[setup.getArrayList().get(i).getstartposition()][actor.getstartposition()] = 0;
                            else if(decisionGraph[setup.getArrayList().get(i).getstartposition()][actor.getstartposition()] <= 0 && prev != 0)
                                decisionGraph[setup.getArrayList().get(i).getstartposition()][actor.getstartposition()] = 1;
                            break;
                        case 4:
                            decisionGraph[setup.getArrayList().get(i).getstartposition()][actor.getstartposition()] += 13;
                            if(decisionGraph[setup.getArrayList().get(i).getstartposition()][actor.getstartposition()] >= 100 && prev == 100)
                                decisionGraph[setup.getArrayList().get(i).getstartposition()][actor.getstartposition()] = 100;
                            else if(decisionGraph[setup.getArrayList().get(i).getstartposition()][actor.getstartposition()] >= 100 && prev != 100)
                                decisionGraph[setup.getArrayList().get(i).getstartposition()][actor.getstartposition()] = 99;
                            break;
                    }
                }
            }
        }
        else if(sheriffResult == 1) {   // sheriff get healed
            for(int i = 0; i < setup.getArrayList().size(); i++) {
                if(setup.getArrayList().get(i).equals(actor) == false) {
                    prev = decisionGraph[setup.getArrayList().get(i).getstartposition()][actor.getstartposition()];
                    switch(setup.getArrayList().get(i).getrole()) {
                        case 1:
                            decisionGraph[setup.getArrayList().get(i).getstartposition()][actor.getstartposition()] -= 7;
                            if(decisionGraph[setup.getArrayList().get(i).getstartposition()][actor.getstartposition()] <= 0 && prev == 0)
                                decisionGraph[setup.getArrayList().get(i).getstartposition()][actor.getstartposition()] = 0;
                            else if(decisionGraph[setup.getArrayList().get(i).getstartposition()][actor.getstartposition()] <= 0 && prev != 0)
                                decisionGraph[setup.getArrayList().get(i).getstartposition()][actor.getstartposition()] = 1;
                            break;
                        case 2:
                            break;
                        case 3:
                            decisionGraph[setup.getArrayList().get(i).getstartposition()][actor.getstartposition()] += 13;
                            if(decisionGraph[setup.getArrayList().get(i).getstartposition()][actor.getstartposition()] >= 100 && prev == 100)
                                decisionGraph[setup.getArrayList().get(i).getstartposition()][actor.getstartposition()] = 100;
                            else if(decisionGraph[setup.getArrayList().get(i).getstartposition()][actor.getstartposition()] >= 100 && prev != 100)
                                decisionGraph[setup.getArrayList().get(i).getstartposition()][actor.getstartposition()] = 99;
                            break;
                        case 4:
                            decisionGraph[setup.getArrayList().get(i).getstartposition()][actor.getstartposition()] -= 7;
                            if(decisionGraph[setup.getArrayList().get(i).getstartposition()][actor.getstartposition()] <= 0 && prev == 0)
                                decisionGraph[setup.getArrayList().get(i).getstartposition()][actor.getstartposition()] = 0;
                            else if(decisionGraph[setup.getArrayList().get(i).getstartposition()][actor.getstartposition()] <= 0 && prev != 0)
                                decisionGraph[setup.getArrayList().get(i).getstartposition()][actor.getstartposition()] = 1;
                            break;
                    }
                }
            }
        }
    }
    /**
     * This static method is used to get access to the decision graph and return the threat level in the graph
     * @author Vincent Hew
     * @param selfPos (self position)
     * @param targetPos (target position)
     * @return temp (the threat level)
     */
    public static int getThreatLv(int selfPos, int targetPos) {
        int temp = 0;
        temp = decisionGraph[selfPos][targetPos];
        return temp;
    }
}
