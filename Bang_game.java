// CS 2365 OOP Spring 2020
// Project 3
// Mason Holley
package bang_game;

/**
 *
 * @author Owner
 */
public class Bang_game {

    /**
     * Code to run the game
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int turn = 0;
        setup.getPlayerAmount(true);
        setup.chooseCharacter(true);
        for(int i = 0; i < setup.getPlayerAmount(false); i++){
            turn = setup.getTurn(turn);
            System.out.println("The current turn is: " + turn);
            }
    }
    
}
