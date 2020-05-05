// CS 2365 OOP Spring 2020
// Mason Holley
package ang;

import java.util.ArrayList;

/**
 *
 * @author Owner
 */
public class SpecialAbilities {
    
    /**
    * This function is checks to see if this character in currently in the arrayList. 
    * If he is, returns the position of the character. Otherwise, return -1.
    * @author Mason Holley
    * @return bartPosition
    */ 
    public static int BartCassidy(){
        int bartValue = 1;
        int bartPosition;
        
        for(int i = 0; i < setup.getArrayList().size(); i++){
            if(setup.getArrayList().get(i).char_num == bartValue);{
                bartPosition = i;
                return bartPosition;
            }
        }  
        return -1;
}
    /**
    * This function is checks to see if this character in currently in the arrayList. 
    * If he is, returns the position of the character. Otherwise, return -1.
    * @author Mason Holley
    * @return grinPosition
    */ 
    public static int ElGringo(){
        int grinValue = 4;
        int grinPosition;
        
        for(int i = 0; i < setup.getArrayList().size(); i++){
            if(setup.getArrayList().get(i).char_num == grinValue);{
                grinPosition = i;
                return grinPosition;
            }
        }
        return -1;
    }
    
    /**
    * This function is checks to see if this character in currently in the arrayList. 
    * If he is, returns the position of the character. Otherwise, return -1.
    * @author Mason Holley
    * @return jessPosition
    */ 
    public static int JesseJones(){
        int jessValue = 5;
        int jessPosition;
        
        for(int i = 0; i < setup.getArrayList().size(); i++){
            if(setup.getArrayList().get(i).char_num == jessValue);{
                jessPosition = i;
                return jessPosition;
            }
        }
        return -1;
    }    
    
    /**
    * This function is checks to see if this character in currently in the arrayList. 
    * If he is, returns the position of the character. Otherwise, return -1.
    * @author Mason Holley
    * @return jourPosition
    */ 
    public static int Jourdonnais(){
        int jourValue = 6;
        int jourPosition;
        for(int i = 0; i < setup.getArrayList().size(); i++){
            if(setup.getArrayList().get(i).char_num == jourValue);{
                jourPosition = i;
                return jourPosition;
            }
        }
        return -1;
    }
    /**
    * This function is checks to see if this character in currently in the arrayList. 
    * If he is, returns the position of the character. Otherwise, return -1.
    * @author Mason Holley
    * @return paulPosition
    */ 
    public static int PaulRegret(){
        int paulValue = 9;
        int paulPosition;
        
        for(int i = 0; i < setup.getArrayList().size(); i++){
            if(setup.getArrayList().get(i).char_num == paulValue);{
                paulPosition = i;
                return paulPosition;
            }
        }
        return -1;
    }
    
    /**
    * This function is checks to see if this character in currently in the arrayList. 
    * If he is, returns the position of the character. Otherwise, return -1.
    * @author Mason Holley
    * @return pedroPosition
    */ 
    public static int PedroRamirez(){
        int pedroValue = 10;
        int pedroPosition;
        
        for(int i = 0; i < setup.getArrayList().size(); i++){
            if(setup.getArrayList().get(i).char_num == pedroValue);{
                pedroPosition = i;
                return pedroPosition;
            }
        }
        return -1;
    }
    
    /**
    * This function is checks to see if this character in currently in the arrayList. 
    * If he is, returns the position of the character. Otherwise, return -1.
    * @author Mason Holley
    * @return sidPosition
    */ 
//    public static int SidKetchum(){
//        int sidValue = 12;
//        int sidPosition = -1;
//        int sidHP; 
//        
//        for(int i = 0; i < setup.getArrayList().size(); i++){
//            if(setup.getArrayList().get(i).char_num == sidValue);{
//                sidPosition = i;
//            }
//        }       
//        if(TableController.gamePos == sidPosition){
//            sidHP = setup.getArrayList().get(sidPosition).gethp();
//            setup.getArrayList().get(sidPosition).sethp(sidHP + 1);
//      }
//        return sidPosition;
//    }


    /**
    * This function is called in the setup removePlayer method. It searches through the list to see if there is a Sam Vulture character 
    * If Sam is in the list, removePlayer will add two hp to Vulture Sam as long as he is not dead.
    * @author Mason Holley
    * returns samPosition 
    */ 
    public static int VultureSam(){
        int samValue = 15;
        int samPosition;
        int samHP;
            for(int i = 0; i < setup.getArrayList().size(); i++){
                if(setup.getArrayList().get(i).char_num == samValue);{
                    samPosition = i;
                    samHP = setup.getArrayList().get(samPosition).gethp(); 
                    return samPosition;
                }
            }
            return -1;
    }
}
