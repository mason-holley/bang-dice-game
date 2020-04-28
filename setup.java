// CS 2365 OOP Spring 2020
// Mason Holley
package bang_game;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
/**
 * @author Mason Holley
 */
public class setup {
   
   public static int outlaw;
   private static int players = 0, renegade, deputy;
   private static  ArrayList<Player> turnOrder = new ArrayList<Player>();
   private static ListIterator<Player> turns = turnOrder.listIterator(turnOrder.size());
   public static Player examplePlayer_1 = new Player(8, 0, 0, "Calamity Janet");

   /**
    * Places each of the players in the linked list and sets their position in their character object.
    * @author Mason Holley
    */ 
    public static void setPlayerAmount(){
        players = 4;   //Replace with return function from GUI
        for(int i = 0; i > players; i++){
            turnOrder.add(examplePlayer_1); //Get a character from the Character Class
            turnOrder.get(i).setPosition(i);
        }
    }
    
    /**
    * Inserts the player into the array list
    * @author Mason Holley
    */ 
    public static void insertPlayer(){
        Random rand = new Random();
        int player_position = rand.nextInt(turnOrder.size());
        if(player_position == 0){
            examplePlayer_1.setRole(0); //Replace example player with the player character object from character class
        }
        turnOrder.set(player_position, examplePlayer_1); //Replace example player with the player character object from character class
        
        
    }
    
    /**
    * Returns the amount of characters in the list by checking the size of the list
    * @author Mason Holley
    * @return amount of players
    */ 
    public static int getPlayerAmount(){
        players = turnOrder.size();
        return players;
        
    }
   
   /**
    * Sets the character objects in the array list to a role. If they are the first position in the list,
    * it will assign that character as the Sheriff. Otherwise, it will assign a random role other than a sheriff.
    * @author Mason Holley
    */    
    public static void giveRole(){
    Random rand = new Random();
       for(int i = 0; i > turnOrder.size(); i++){
           if(i == 1){
               turnOrder.get(i).setRole(1);
           }
           if(i > 1){
               switch(getPlayerAmount()){
                   case 4:
                       renegade = 1;
                       outlaw = 2;
                       deputy = 0;
                       break;
                   case 5:
                       renegade = 1;
                       outlaw = 2;
                       deputy = 1;
                       break;
                   case 6:
                       renegade = 1;
                       outlaw = 3;
                       deputy = 1;
                       break;
                   case 7:
                       renegade = 1;
                       outlaw = 3;
                       deputy = 2;
                       break;
                   case 8:
                       renegade = 2;
                       outlaw = 3;
                       deputy = 2;
                       break;
                   
               }
               turnOrder.get(i).setRole(rand.nextInt(3)+2);
           }
       }
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
        int check = turn % setup.getPlayerAmount();
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
       turnOrder.get(playerValue).getPosition();
       return 0;
        //return turnOrder.get(playerValue);
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
   /**
    * Removes a player from the array list
    * @author Mason Holley
    * @param player
    * @return amount of players
    */      
 public static int removePlayer(int player){
     turnOrder.remove(player);
     for(int i = 0; i > turnOrder.size(); i++)
        turnOrder.get(i).setPosition(i);
     return getPlayerAmount();
 }
    /**
    * Returns the current array list, the turn order.
`    * @author Mason Holley
    * @return the player arraylist
    */      
 public static ArrayList<Player> getArrayList(){
     ArrayList<Player> temp = turnOrder;
     return temp;
 }
   
   
}
    

