// CS 2365 OOP Spring 2020
// Mason Holley
package bang_game;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author Mason Holley
 */
public class setup {
    
   private static int players = 0;
   private static ArrayList<Integer> turnOrder = new ArrayList<Integer>();
   private static ListIterator<Integer> turns = turnOrder.listIterator(turnOrder.size());
   
   
   /**
    * Obtains the player amount, then returns it.
    * Using the obtained player amount, it sets up the turn order for each of the players.
    * Set it to true at the start of the game in order to gather how many players there should be.
    * Set it to false to return the current number of players.
    * @author Mason Holley
    * @param player
    * @return amount of players
    */ 
   public static int getPlayerAmount(boolean player){
        if(player == true){
            Scanner scan = new Scanner(System.in);
            System.out.print("Please enter the number of players: ");
            players = scan.nextInt();
            for(int i = 0; i > players; i++)
                turnOrder.add(i);
            return players;
        }
        else
            return players;
    }
   
   /**
    * Advances the current turn by navigating an array list.
    * If is is the last player turn, it will loop back around.
    * Keeps track of the total turns in a separate value that it returns.
    * @author Mason Holley
    * @param turn
    * @return current total turns 
    */   
   public static int getTurn(int turn){
        int check = turn % setup.getPlayerAmount(false);
        if (check == 0)
            while(turns.hasPrevious())
                turns.previous();
        
        else if(turns.hasNext())
            turns.next();
        return turn += 1;
   }

   /**
    * Returns the given playerValue's turn position by checking the player position array list
    * @author Mason Holley
    * @param playerValue
    * @return current player's turn value
    */      
   public static int charGetTurn(int playerValue){
        return turnOrder.get(playerValue);
   }

   /**
    * If given a true value, then it will allow the player to choose their character and returns their character value.
    * If given a false value, it will randomly return a character value to be set for a BOT player
    * @author Mason Holley
    * @param player
    * @return character value
    */      
    public static int chooseCharacter(boolean player){ //Allows the player to choose their character
        int charValue = 0;
        Random rand = new Random();
        if(player == true){
            String[] characterNames = {"Bart Cassidy", "Paul Regret", "Black Jack", "Pedro Ramirez", "Calamity Janet", "Rose Doolan", "El Gringo", "Sid Ketchum", "Jesse Jones", "Slab the Killer", "Jourdonnais", "Suzy Lafayette", "Kit Carlson", "Vulture Sam", "Lucky Duke", "Willy the Kid"};
            for(int i = 0; i <= 15; i++)
                System.out.println((i+1) + ")" + characterNames[i]);
            System.out.print("Select a character by entering their number: ");
            Scanner scan = new Scanner(System.in);
            charValue = scan.nextInt();
            return charValue;
        }
        else if (player == false)
            charValue = rand.nextInt(16);
            return charValue;
        
    }

   
   
   
}
    

