// CS 2365 OOP Spring 2020
// Mason Holley
package ang;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
/**
 * @author Mason Holley
 */
public class setup {
   
    
   public static int outlaw, renegade, deputy, player_position, sheriff;
   private static Integer[] character_check = new Integer[8];
   private static List<Integer> roleList;
   private static List<Integer> characterList;
   private static int players = 0;
   private static  ArrayList<Character3> turnOrder = new ArrayList<Character3>();
   private static ListIterator<Character3> turns = turnOrder.listIterator(turnOrder.size());
   public static Character3 examplePlayer_1 = new Character3(0, 0, 8, 0, 0, 0, 0, "Calamity Janet", true, 0);
   public static int oldPosition;

   /**
    * Places each of the players in the linked list and sets their position in their character object.
    * @author Mason Holley
    */ 
    public static void setPlayerAmount(){ 
        //character_check contains all the valid characters to be chosen by the player
        character_check[0] = 1; //Bart Cassidy
        character_check[1] = 4; //El Gringo
        character_check[2] = 5; //Jesse Jones
        character_check[3] = 6; //Jourdanais
        character_check[4] = 9; //Paul Regret
        character_check[5] = 10; //Pedro Ramirez
        character_check[6] = 12; //Sid Ketchum
        character_check[7] = 15; //Vulture Sam
        characterList = Arrays.asList(character_check); //Put the character array into a list 
        Collections.shuffle(characterList); //Shuffle the list
        players = FXMLDocumentController.playerNum; //Get the number of players choice from the gui
        for(int i = 0; i < players; i++){
            turnOrder.add(Character3.character_choice(characterList.get(i))); //Fill the array list with bots
            turnOrder.get(i).setposition(i); //Set each of their position values in the character object
            turnOrder.get(i).setstartposition(i); //Set the initial position of each in the character object
            
            
        }
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
    * Inserts the player into a random position in the array list
    * @author Mason Holley
    */ 
    public static void insertPlayer(){
        Random rand = new Random();
        player_position = rand.nextInt(players);
        if(player_position == 0){ //If they are placed into position zero, assign them the sheriff role
            Character3.humanPlayer(CharacterController.choice).setrole(1); 
        }
        turnOrder.set(player_position, Character3.humanPlayer(CharacterController.choice)); //This line replaces what the bot in player_position with the player object
        for (int i = 0; i < players; i++) // delete, used for testing
        {
            System.out.println(turnOrder.get(i).name);
        }
        turnOrder.get(player_position).setposition(player_position); //These two lines assign the position and start_position value into the player's character object
        turnOrder.get(player_position).setstartposition(player_position);
    }
    
   
   /**
    * Sets the character objects in the array list to a role. If they are the first position in the list,
    * it will assign that character as the Sheriff. Otherwise, it will assign a random role other than a sheriff.
    * @author Mason Holley
    */    
    public static void giveRole(){
    Integer[] role_count = new Integer[players -1];
               switch(getPlayerAmount()){ //This switch statement determines the amount of required roles depending on the amount of players
                   case 4:
                       sheriff = 1;
                       renegade = 1;
                       role_count[0] = 2;
                       outlaw = 2;
                       role_count[1] = 3;
                       role_count[2] = 3;
                       deputy = 0;
                       break;
                   case 5:
                       sheriff = 1;
                       renegade = 1;
                       role_count[0] = 2;
                       outlaw = 2;
                       role_count[1] = 3;
                       role_count[2] = 3;
                       deputy = 1;
                       role_count[3] = 4;
                       break;
                   case 6:
                       sheriff = 1;
                       renegade = 1;
                       role_count[0] = 2;
                       outlaw = 3;
                       role_count[1] = 3;
                       role_count[2] = 3;
                       role_count[3] = 3;
                       deputy = 1;
                       role_count[4] = 4;
                       break;
                   case 7:
                       sheriff = 1;
                       renegade = 1;
                       role_count[0] = 2;
                       outlaw = 3;
                       role_count[1] = 3;
                       role_count[2] = 3;
                       role_count[3] = 3;
                       deputy = 2;
                       role_count[4] = 4;
                       role_count[5] = 4;
                       break;
                   case 8:
                       sheriff = 1;
                       renegade = 2;
                       role_count[0] = 2;
                       role_count[1] = 2;
                       outlaw = 3;
                       role_count[2] = 3;
                       role_count[3] = 3;
                       role_count[4] = 3;
                       deputy = 2;
                       role_count[5] = 4;
                       role_count[6] = 4;
                       break;
                }
                roleList = Arrays.asList(role_count); 
                Collections.shuffle(roleList); //Randomize the roles
       for(int i = 0; i < turnOrder.size(); i++){
           if(i == 0){
               turnOrder.get(i).setrole(1); // For whoever is in position zero, they automatically get the sheriff role
           }
           if(i > 0){
                
                turnOrder.get(i).setrole(roleList.get(i-1)); //Everyone else gets a random role assigned from the available roles
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
       turnOrder.get(playerValue).getposition();
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
    public static int chooseCharacter(boolean player){ //Allows the player to choose their character, depreciated
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
    * Removes a player from the array list at a given position and updates all other character positions
    * @author Mason Holley
    * @param playPosition
    * @return amount of players
    */      
 public static int removePlayer(int playPosition){
     Dice.setArrowPile(Dice.getArrowPile() + turnOrder.get(playPosition).arrows);
     turnOrder.get(playPosition).arrows = 0;
     
     //Vulture Sam's Special Ability
     //If somebody dies, Sam's HP increases by two
     int samHP;
     if(SpecialAbilities.VultureSam() != -1){
         samHP = turnOrder.get(SpecialAbilities.VultureSam()).gethp();
         if(samHP < 0){
             turnOrder.get(SpecialAbilities.VultureSam()).sethp(samHP + 2);
         }
     }
     
     turnOrder.remove(playPosition);
     FXMLDocumentController.playerNum--;
     if (player_position > playPosition)
         player_position--;
     for(int i = 0; i < turnOrder.size(); i++)
        turnOrder.get(i).setposition(i);
     return getPlayerAmount();
 }
    /**
    * Returns the current array list, the turn order.
`    * @author Mason Holley
    * @return the player arraylist
    */      
 public static ArrayList<Character3> getArrayList(){
     ArrayList<Character3> temp = turnOrder;
     return temp;
 }
   
   
}