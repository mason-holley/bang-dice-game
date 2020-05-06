// CS 2435 Spring 2020
// Nicholas Ingle
/*
    Take the value given and return a object that holds the chosen characters information
    and provide multiple methods to interacte with said objects
 */
package bang._dice_game;
import java.util.*;
import bang._dice_game.setup;

/*
Class Name: Character3
Description of Class:   Take the value given and return a object that holds the chosen characters information
                        and provide multiple methods to interacte with said objects

Author : Nicholas Ingle
Contributors: Vincent Hew
Work Done:
Nicholas Ingle - Created main code including all if statements ,Character3 class objects and all methods to get and change values within the objects
Vincent Hew- Created defualt Character3 constructer

/*defualt character constructer for use outside of Character3 file*/

public class Character3 {
    public int charvalue,char_num, hp, arrows,position,role,playernumber,startposition,starthp;
    public static int playernum = 1;
    String name, ability;
    boolean alive, use;
    public Character3() {
        this.role = 0;
        this.char_num = 0;
        this.hp = 8;
        this.starthp = 8;
        this.arrows = 0;
        this.position = 0;
        this.startposition = 0;
        this.alive = true;
    }
    /*character class that holds integers to represents the role of the character, a specific number to represent the chosen character, the chosen characters starting health,
    a int to hold the starting health for use outside of Character3, a int to hold the number of arrows that the character has at any given time, a int that holds the postion in the array list,
    holds the origional starting postion for use outside of Character3, a string holding the name of the chosen character, a boolean to tell if the character is alive, and a int for a what bot or the 
    player is using the character*/
    public Character3 (int role, int char_num, int hp,int starthp, int arrows,int position,int startposition,String name, boolean alive,int playernumber) 
    {
        this.role = role;
        this.char_num = char_num;
        this.hp = hp;
        this.starthp = starthp;
        this.arrows = arrows;
        this.position = position;
        this.startposition = startposition;
        this.alive = true;
        this.playernumber = playernumber;
        
    }
    
    /*a method to get the position in the array list of the desired character*/
    public int getposition ()
    {
        return this.position;
    }
    
    /*a method to set the position in the array list of the desired character*/
    public void setposition (int newpostion)
    {
        this.position = newpostion;
    }
    
    /*a method to get the health of the desired character*/
    public int gethp ()
    {
        return this.hp;
    }
    
    /*a method to get the starting health of the desired character*/
    public int getstarthp ()
    {
        return this.starthp;
    }
    
    /*a method to set the health of the desired character*/
    public void sethp (int newhp)
    {
        this.hp = newhp;
    }
    
    /*a method to get the role of the desired character*/
     public int getrole ()
    {
        return this.role;
    }
     
    /*a method to set the role of the desired character*/
    public void setrole (int role)
    {
        this.role = role;
    }
    
    /*a method to get the number of arrows currently held by the desired character*/
    
     public int getarrows ()
    {
        return this.arrows;
    }
     
    /*a method to add arrows to number of arrows currently held by the desired character*/
     public void addarrows (int newarrows)
    {
        this.arrows += newarrows;
        Dice.setArrowPile(Dice.getArrowPile()-1);
    }
     
    /*a method to set the number of arrows currently held by the desired character*/
    public void setarrows (int newarrows)
    {
        this.arrows = newarrows;
    }
    
    /*a method to get the starting position of the desired character*/
     public int getstartposition ()
    {
        return this.startposition;
    }
     
    /*a method to set the starting position of the desired character*/
    public void setstartposition (int newpostion)
    {
        this.startposition = newpostion;
    }
    
    /*a method to get the unique number representing who the character is*/
    public int getcharnum ()
    {
        return this.char_num;
    }
    
    /*a mothod to set a character as dead*/
    public void setdead ()
    {
        this.alive = false;
    }
    
    /*a method to get the unique number that represents who has this character*/
    public int getplayernumber ()
    {
        return this.playernumber;
    }
    
    public static Character3 humanPlayer(int charvalue) {
        if (charvalue == 1)
            {
                Character3 player = new Character3 (0, 1, 8,8, 0,0,0,"BART CASSIDY (8)", true,0);
                playernum += 1;
                System.out.println("this one");
                return player;
            }
            if (charvalue == 2)
            {
                Character3 player = new Character3 (0, 2, 8,8, 0,0,0,"BLACK JACK (8)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 3)
            {
                Character3 player = new Character3 (0, 3, 8,8, 0,0,0,"CALAMITY JANET (8)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 4)
            {
                Character3 player = new Character3 (0, 4, 7,7, 0,0,0,"EL GRINGO (7)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 5)
            {
                Character3 player = new Character3 (0, 5, 9,9, 0,0,0,"JESSE JONES (9)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 6)
            {
                Character3 player = new Character3 (0, 6, 7,7, 0,0,0,"JOURDONNAIS (7)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 7)
            {
                Character3 player = new Character3 (0, 7, 7,7, 0,0,0,"KIT CARLSON (7)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 8)
            {
                Character3 player = new Character3 (0, 8, 8,8, 0,0,0,"LUCKY DUKE (8)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 9)
            {
                Character3 player = new Character3 (0, 9, 9,9, 0,0,0,"PAUL REGRET (9)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 10)
            {
                Character3 player = new Character3 (0, 10, 8,8, 0,0,0,"PEDRO RAMIREZ (8)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 11)
            {
                Character3 player = new Character3 (0, 11, 9,9, 0,0,0,"ROSE DOOLAN (9)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 12)
            {
                Character3 player = new Character3 (0, 12, 8,8, 0,0,0,"SID KETCHUM (8)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 13)
            {
                Character3 player = new Character3 (0, 13, 8,8, 0,0,0,"SLAB THE KILLER (8)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 14)
            {
                Character3 player = new Character3 (0, 14, 8,8, 0,0,0,"SUZY LAFAYETTE (8)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 15)
            {
                Character3 player = new Character3 (0, 15, 9,9, 0,0,0,"VULTURE SAM (9)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 16)
            {
                Character3 player = new Character3 (0, 16, 8,8, 0,0,0,"WILLY THE KID (8)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 17)
            {
                Character3 player = new Character3 (0, 17, 7,7, 0,0,0,"JOSÉ DELGADO (7)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 18)
            {
                Character3 player = new Character3 (0, 18, 7,7, 0,0,0,"TEQUILA JOE (7)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 19)
            {
                Character3 player = new Character3 (0, 19, 9,9, 0,0,0,"APACHE KID (9)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 20)
            {
                Character3 player = new Character3 (0, 20,9,9, 0,0,0,"BILL NOFACE (9)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 21)
            {
                Character3 player = new Character3 (0, 21, 7,7, 0,0,0,"ELENA FUENTE (7)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 22)
            {
                Character3 player = new Character3 (0, 22, 7,7, 0,0,0,"VERA CUSTER (7)", true,0);
                playernum += 1;
                return player;
            }
             if (charvalue == 23)
            {
                Character3 player = new Character3 (0, 23, 8,8, 0,0,0,"BELLE STAR (8)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 24)
            {
                Character3 player = new Character3 (0, 24, 8,8, 0,0,0,"CHUCK WENGAM (8)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 25)
            {
                Character3 player = new Character3 (0, 25, 7,7, 0,0,0,"GREG DIGGER (7)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 26)
            {
                Character3 player = new Character3 (0, 26, 8,8, 0,0,0,"HERB HUNTER (8)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 27)
            {
                Character3 player = new Character3 (0, 27, 8,8, 0,0,0,"PAT BRENNAN (8)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 28)
            {
                Character3 player = new Character3 (0, 28, 9,9, 0,0,0,"PIXIE PETE (9)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 29)
            {
                Character3 player = new Character3 (0, 29, 7,7, 0,0,0,"SAM THE HEALER (7)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 30)
            {
                Character3 player = new Character3 (0, 30, 8,8, 0,0,0,"SEAN MALLORY (8)", true,0);
                playernum += 1;
                return player;
            }
            return null;
    }
    
    /*IF YOU VALUE YOUR TIME READ THE COMMENT BELOW BEFORE GOING FORWARD*/
    /*the following is 1085 lines of if statements to create a Character3 for the player, bot1, bot2, bot3, bot4, bot5, bot6, and bot7. It operates by interating playernum each time it is called with
    playernum = 1 being for the player, playernum = 2 for bot1 and so forth. After the playernum if statement is found, it then has a series of if statements that checks the charvalue. Since each character
    has a unique number so long as the same number isn't passed twice there will be no repeated characters. Each playernum if statement is the same inside with the only differences being
    that the name of the character3 object is different along with what object is returned ie. Character3 player = new Character3 ... return player if playernum = 1 and Character3 bot1 = new Character3...
    return bot1 if playrnum = 2. There is no code writen after these if statements.*/
    public static Character3 character_choice(int charvalue)
    {
        if (playernum == 1)
        {
            if (charvalue == 1)
            {
                Character3 player = new Character3 (0, 1, 8,8, 0,0,0,"BART CASSIDY (8)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 2)
            {
                Character3 player = new Character3 (0, 2, 8,8, 0,0,0,"BLACK JACK (8)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 3)
            {
                Character3 player = new Character3 (0, 3, 8,8, 0,0,0,"CALAMITY JANET (8)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 4)
            {
                Character3 player = new Character3 (0, 4, 7,7, 0,0,0,"EL GRINGO (7)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 5)
            {
                Character3 player = new Character3 (0, 5, 9,9, 0,0,0,"JESSE JONES (9)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 6)
            {
                Character3 player = new Character3 (0, 6, 7,7, 0,0,0,"JOURDONNAIS (7)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 7)
            {
                Character3 player = new Character3 (0, 7, 7,7, 0,0,0,"KIT CARLSON (7)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 8)
            {
                Character3 player = new Character3 (0, 8, 8,8, 0,0,0,"LUCKY DUKE (8)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 9)
            {
                Character3 player = new Character3 (0, 9, 9,9, 0,0,0,"PAUL REGRET (9)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 10)
            {
                Character3 player = new Character3 (0, 10, 8,8, 0,0,0,"PEDRO RAMIREZ (8)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 11)
            {
                Character3 player = new Character3 (0, 11, 9,9, 0,0,0,"ROSE DOOLAN (9)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 12)
            {
                Character3 player = new Character3 (0, 12, 8,8, 0,0,0,"SID KETCHUM (8)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 13)
            {
                Character3 player = new Character3 (0, 13, 8,8, 0,0,0,"SLAB THE KILLER (8)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 14)
            {
                Character3 player = new Character3 (0, 14, 8,8, 0,0,0,"SUZY LAFAYETTE (8)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 15)
            {
                Character3 player = new Character3 (0, 15, 9,9, 0,0,0,"VULTURE SAM (9)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 16)
            {
                Character3 player = new Character3 (0, 16, 8,8, 0,0,0,"WILLY THE KID (8)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 17)
            {
                Character3 player = new Character3 (0, 17, 7,7, 0,0,0,"JOSÉ DELGADO (7)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 18)
            {
                Character3 player = new Character3 (0, 18, 7,7, 0,0,0,"TEQUILA JOE (7)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 19)
            {
                Character3 player = new Character3 (0, 19, 9,9, 0,0,0,"APACHE KID (9)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 20)
            {
                Character3 player = new Character3 (0, 20,9,9, 0,0,0,"BILL NOFACE (9)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 21)
            {
                Character3 player = new Character3 (0, 21, 7,7, 0,0,0,"ELENA FUENTE (7)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 22)
            {
                Character3 player = new Character3 (0, 22, 7,7, 0,0,0,"VERA CUSTER (7)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 23)
            {
                Character3 player = new Character3 (0, 23, 8,8, 0,0,0,"BELLE STAR (8)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 24)
            {
                Character3 player = new Character3 (0, 24, 8,8, 0,0,0,"CHUCK WENGAM (8)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 25)
            {
                Character3 player = new Character3 (0, 25, 7,7, 0,0,0,"GREG DIGGER (7)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 26)
            {
                Character3 player = new Character3 (0, 26, 8,8, 0,0,0,"HERB HUNTER (8)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 27)
            {
                Character3 player = new Character3 (0, 27, 8,8, 0,0,0,"PAT BRENNAN (8)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 28)
            {
                Character3 player = new Character3 (0, 28, 9,9, 0,0,0,"PIXIE PETE (9)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 29)
            {
                Character3 player = new Character3 (0, 29, 7,7, 0,0,0,"SAM THE HEALER (7)", true,0);
                playernum += 1;
                return player;
            }
            if (charvalue == 30)
            {
                Character3 player = new Character3 (0, 30, 8,8, 0,0,0,"SEAN MALLORY (8)", true,0);
                playernum += 1;
                return player;
            }
        }
        if (playernum == 2)
        {
            if (charvalue == 1)
            {
                Character3 bot1 = new Character3 (0, 1, 8,8, 0,0,0,"BART CASSIDY (8)", true,1);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 2)
            {
                Character3 bot1 = new Character3 (0, 2, 8,8, 0,0,0,"BLACK JACK (8)", true,1);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 3)
            {
                Character3 bot1 = new Character3 (0, 3, 8,8, 0,0,0,"CALAMITY JANET (8)", true,1);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 4)
            {
                Character3 bot1 = new Character3 (0, 4, 7,7, 0,0,0,"EL GRINGO (7)", true,1);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 5)
            {
                Character3 bot1 = new Character3 (0, 5, 9,9, 0,0,0,"JESSE JONES (9)", true,1);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 6)
            {
                Character3 bot1 = new Character3 (0, 6, 7,7, 0,0,0,"JOURDONNAIS (7)", true,1);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 7)
            {
                Character3 bot1 = new Character3 (0, 7, 7,7, 0,0,0,"KIT CARLSON (7)", true,1);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 8)
            {
                Character3 bot1 = new Character3 (0, 8, 8,8, 0,0,0,"LUCKY DUKE (8)", true,1);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 9)
            {
                Character3 bot1 = new Character3 (0, 9, 9,9, 0,0,0,"PAUL REGRET (9)", true,1);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 10)
            {
                Character3 bot1 = new Character3 (0, 10, 8,8, 0,0,0,"PEDRO RAMIREZ (8)", true,1);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 11)
            {
                Character3 bot1 = new Character3 (0, 11, 9,9, 0,0,0,"ROSE DOOLAN (9)", true,1);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 12)
            {
                Character3 bot1 = new Character3 (0, 12, 8,8, 0,0,0,"SID KETCHUM (8)", true,1);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 13)
            {
                Character3 bot1 = new Character3 (0, 13, 8,8, 0,0,0,"SLAB THE KILLER (8)", true,1);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 14)
            {
                Character3 bot1 = new Character3 (0, 14, 8,8, 0,0,0,"SUZY LAFAYETTE (8)", true,1);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 15)
            {
                Character3 bot1 = new Character3 (0, 15, 9,9, 0,0,0,"VULTURE SAM (9)", true,1);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 16)
            {
                Character3 bot1 = new Character3 (0, 16, 8,8, 0,0,0,"WILLY THE KID (8)", true,1);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 17)
            {
                Character3 bot1 = new Character3 (0, 17, 7,7, 0,0,0,"JOSÉ DELGADO (7)", true,1);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 18)
            {
                Character3 bot1 = new Character3 (0, 18, 7,7, 0,0,0,"TEQUILA JOE (7)", true,1);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 19)
            {
                Character3 bot1 = new Character3 (0, 19, 9,9, 0,0,0,"APACHE KID (9)", true,1);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 20)
            {
                Character3 bot1 = new Character3 (0, 20,9,9, 0,0,0,"BILL NOFACE (9)", true,1);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 21)
            {
                Character3 bot1 = new Character3 (0, 21, 7,7, 0,0,0,"ELENA FUENTE (7)", true,1);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 22)
            {
                Character3 bot1 = new Character3 (0, 22, 7,7, 0,0,0,"VERA CUSTER (7)", true,1);
                playernum += 1;
                return bot1;
                
            }
            if (charvalue == 23)
            {
                Character3 bot1 = new Character3 (0, 23, 8,8, 0,0,0,"BELLE STAR (8)", true,1);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 24)
            {
                Character3 bot1 = new Character3 (0, 24, 8,8, 0,0,0,"CHUCK WENGAM (8)", true,1);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 25)
            {
                Character3 bot1 = new Character3 (0, 25, 7,7, 0,0,0,"GREG DIGGER (7)", true,1);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 26)
            {
                Character3 bot1 = new Character3 (0, 26, 8,8, 0,0,0,"HERB HUNTER (8)", true,1);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 27)
            {
                Character3 bot1 = new Character3 (0, 27, 8,8, 0,0,0,"PAT BRENNAN (8)", true,1);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 28)
            {
                Character3 bot1 = new Character3 (0, 28, 9,9, 0,0,0,"PIXIE PETE (9)", true,1);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 29)
            {
                Character3 bot1 = new Character3 (0, 29, 7,7, 0,0,0,"SAM THE HEALER (7)", true,1);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 30)
            {
                Character3 bot1 = new Character3 (0, 30, 8,8, 0,0,0,"SEAN MALLORY (8)", true,1);
                playernum += 1;
                return bot1;
            }
        }
        if (playernum == 3)
        {
            if (charvalue == 1)
            {
                Character3 bot2 = new Character3 (0, 1, 8,8, 0,0,0,"BART CASSIDY (8)", true,2);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 2)
            {
                Character3 bot2 = new Character3 (0, 2, 8,8, 0,0,0,"BLACK JACK (8)", true,2);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 3)
            {
                Character3 bot2 = new Character3 (0, 3, 8,8, 0,0,0,"CALAMITY JANET (8)", true,2);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 4)
            {
                Character3 bot2 = new Character3 (0, 4, 7, 7,0,0,0,"EL GRINGO (7)", true,2);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 5)
            {
                Character3 bot2 = new Character3 (0, 5, 9,9, 0,0,0,"JESSE JONES (9)", true,2);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 6)
            {
                Character3 bot2 = new Character3 (0, 6, 7,7, 0,0,0,"JOURDONNAIS (7)", true,2);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 7)
            {
                Character3 bot2 = new Character3 (0, 7, 7,7, 0,0,0,"KIT CARLSON (7)", true,2);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 8)
            {
                Character3 bot2 = new Character3 (0, 8, 8,8, 0,0,0,"LUCKY DUKE (8)", true,2);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 9)
            {
                Character3 bot2 = new Character3 (0, 9, 9,9, 0,0,0,"PAUL REGRET (9)", true,2);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 10)
            {
                Character3 bot2 = new Character3 (0, 10, 8, 8,0,0,0,"PEDRO RAMIREZ (8)", true,2);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 11)
            {
                Character3 bot2 = new Character3 (0, 11, 9,9, 0,0,0,"ROSE DOOLAN (9)", true,2);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 12)
            {
                Character3 bot2 = new Character3 (0, 12, 8, 8,0,0,0,"SID KETCHUM (8)", true,2);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 13)
            {
                Character3 bot2 = new Character3 (0, 13, 8,8, 0,0,0,"SLAB THE KILLER (8)", true,2);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 14)
            {
                Character3 bot2 = new Character3 (0, 14, 8,8, 0,0,0,"SUZY LAFAYETTE (8)", true,2);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 15)
            {
                Character3 bot2 = new Character3 (0, 15, 9,9, 0,0,0,"VULTURE SAM (9)", true,2);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 16)
            {
                Character3 bot2 = new Character3 (0, 16, 8,8, 0,0,0,"WILLY THE KID (8)", true,2);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 17)
            {
                Character3 bot2 = new Character3 (0, 17, 7,7, 0,0,0,"JOSÉ DELGADO (7)", true,2);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 18)
            {
                Character3 bot2 = new Character3 (0, 18, 7,7, 0,0,0,"TEQUILA JOE (7)", true,2);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 19)
            {
                Character3 bot2 = new Character3 (0, 19, 9,9, 0,0,0,"APACHE KID (9)", true,2);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 20)
            {
                Character3 bot2 = new Character3 (0, 20,9,9, 0,0,0,"BILL NOFACE (9)", true,2);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 21)
            {
                Character3 bot2 = new Character3 (0, 21, 7,7, 0,0,0,"ELENA FUENTE (7)", true,2);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 22)
            {
                Character3 bot2 = new Character3 (0, 22, 7,7, 0,0,0,"VERA CUSTER (7)", true,2);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 23)
            {
                Character3 bot2 = new Character3 (0, 23, 8,8, 0,0,0,"BELLE STAR (8)", true,2);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 24)
            {
                Character3 bot2 = new Character3 (0, 24, 8,8, 0,0,0,"CHUCK WENGAM (8)", true,2);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 25)
            {
                Character3 bot2 = new Character3 (0, 25, 7,7, 0,0,0,"GREG DIGGER (7)", true,2);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 26)
            {
                Character3 bot2 = new Character3 (0, 26, 8,8, 0,0,0,"HERB HUNTER (8)", true,2);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 27)
            {
                Character3 bot2 = new Character3 (0, 27, 8,8, 0,0,0,"PAT BRENNAN (8)", true,2);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 28)
            {
                Character3 bot2 = new Character3 (0, 28, 9,9, 0,0,0,"PIXIE PETE (9)", true,2);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 29)
            {
                Character3 bot2 = new Character3 (0, 29, 7,7, 0,0,0,"SAM THE HEALER (7)", true,2);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 30)
            {
                Character3 bot2 = new Character3 (0, 30, 8,8, 0,0,0,"SEAN MALLORY (8)", true,2);
                playernum += 1;
                return bot2;
            }
        }
        if (playernum == 4)
        {
            if (charvalue == 1)
            {
                Character3 bot3 = new Character3 (0, 1, 8,8, 0,0,0,"BART CASSIDY (8)", true,3);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 2)
            {
                Character3 bot3 = new Character3 (0, 2, 8, 8,0,0,0,"BLACK JACK (8)", true,3);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 3)
            {
                Character3 bot3 = new Character3 (0, 3, 8,8, 0,0,0,"CALAMITY JANET (8)", true,3);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 4)
            {
                Character3 bot3 = new Character3 (0, 4, 7,7, 0,0,0,"EL GRINGO (7)", true,3);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 5)
            {
                Character3 bot3 = new Character3 (0, 5, 9, 9,0,0,0,"JESSE JONES (9)", true,3);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 6)
            {
                Character3 bot3 = new Character3 (0, 6, 7, 7,0,0,0,"JOURDONNAIS (7)", true,3);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 7)
            {
                Character3 bot3 = new Character3 (0, 7, 7,7, 0,0,0,"KIT CARLSON (7)", true,3);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 8)
            {
                Character3 bot3 = new Character3 (0, 8, 8,8, 0,0,0,"LUCKY DUKE (8)", true,3);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 9)
            {
                Character3 bot3 = new Character3 (0, 9, 9,9, 0,0,0,"PAUL REGRET (9)", true,3);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 10)
            {
                Character3 bot3 = new Character3 (0, 10, 8,8, 0,0,0,"PEDRO RAMIREZ (8)", true,3);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 11)
            {
                Character3 bot3 = new Character3 (0, 11, 9,9, 0,0,0,"ROSE DOOLAN (9)", true,3);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 12)
            {
                Character3 bot3 = new Character3 (0, 12, 8,8, 0,0,0,"SID KETCHUM (8)", true,3);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 13)
            {
                Character3 bot3 = new Character3 (0, 13, 8,8, 0,0,0,"SLAB THE KILLER (8)", true,3);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 14)
            {
                Character3 bot3 = new Character3 (0, 14, 8,8, 0,0,0,"SUZY LAFAYETTE (8)", true,3);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 15)
            {
                Character3 bot3 = new Character3 (0, 15, 9,9, 0,0,0,"VULTURE SAM (9)", true,3);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 16)
            {
                Character3 bot3 = new Character3 (0, 16, 8,8, 0,0,0,"WILLY THE KID (8)", true,3);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 17)
            {
                Character3 bot3 = new Character3 (0, 17, 7,7, 0,0,0,"JOSÉ DELGADO (7)", true,3);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 18)
            {
                Character3 bot3 = new Character3 (0, 18, 7, 7,0,0,0,"TEQUILA JOE (7)", true,3);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 19)
            {
                Character3 bot3 = new Character3 (0, 19, 9,9, 0,0,0,"APACHE KID (9)", true,3);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 20)
            {
                Character3 bot3 = new Character3 (0, 20,9,9, 0,0,0,"BILL NOFACE (9)", true,3);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 21)
            {
                Character3 bot3 = new Character3 (0, 21, 7, 7,0,0,0,"ELENA FUENTE (7)", true,3);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 22)
            {
                Character3 bot3 = new Character3 (0, 22, 7,7, 0,0,0,"VERA CUSTER (7)", true,3);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 23)
            {
                Character3 bot3 = new Character3 (0, 23, 8,8, 0,0,0,"BELLE STAR (8)", true,3);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 24)
            {
                Character3 bot3 = new Character3 (0, 24, 8,8, 0,0,0,"CHUCK WENGAM (8)", true,3);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 25)
            {
                Character3 bot3 = new Character3 (0, 25, 7,7, 0,0,0,"GREG DIGGER (7)", true,3);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 26)
            {
                Character3 bot3 = new Character3 (0, 26, 8,8, 0,0,0,"HERB HUNTER (8)", true,3);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 27)
            {
                Character3 bot3 = new Character3 (0, 27, 8,8, 0,0,0,"PAT BRENNAN (8)", true,3);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 28)
            {
                Character3 bot3 = new Character3 (0, 28, 9,9, 0,0,0,"PIXIE PETE (9)", true,3);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 29)
            {
                Character3 bot3 = new Character3 (0, 29, 7,7, 0,0,0,"SAM THE HEALER (7)", true,3);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 30)
            {
                Character3 bot3 = new Character3 (0, 30, 8,8, 0,0,0,"SEAN MALLORY (8)", true,3);
                playernum += 1;
                return bot3;
            }
        }
        if (playernum == 5)
        {
            if (charvalue == 1)
            {
                Character3 bot4 = new Character3 (0, 1, 8, 8,0,0,0,"BART CASSIDY (8)", true,4);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 2)
            {
                Character3 bot4 = new Character3 (0, 2, 8,8, 0,0,0,"BLACK JACK (8)", true,4);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 3)
            {
                Character3 bot4 = new Character3 (0, 3, 8,8, 0,0,0,"CALAMITY JANET (8)", true,4);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 4)
            {
                Character3 bot4 = new Character3 (0, 4, 7,7, 0,0,0,"EL GRINGO (7)", true,4);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 5)
            {
                Character3 bot4 = new Character3 (0, 5, 9,9, 0,0,0,"JESSE JONES (9)", true,4);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 6)
            {
                Character3 bot4 = new Character3 (0, 6, 7,7, 0,0,0,"JOURDONNAIS (7)", true,4);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 7)
            {
                Character3 bot4 = new Character3 (0, 7, 7, 7,0,0,0,"KIT CARLSON (7)", true,4);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 8)
            {
                Character3 bot4 = new Character3 (0, 8, 8, 8,0,0,0,"LUCKY DUKE (8)", true,4);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 9)
            {
                Character3 bot4 = new Character3 (0, 9, 9, 9,0,0,0,"PAUL REGRET (9)", true,4);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 10)
            {
                Character3 bot4 = new Character3 (0, 10, 8,8, 0,0,0,"PEDRO RAMIREZ (8)", true,4);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 11)
            {
                Character3 bot4 = new Character3 (0, 11, 9,9, 0,0,0,"ROSE DOOLAN (9)", true,4);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 12)
            {
                Character3 bot4 = new Character3 (0, 12, 8,8, 0,0,0,"SID KETCHUM (8)", true,4);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 13)
            {
                Character3 bot4 = new Character3 (0, 13, 8,8, 0,0,0,"SLAB THE KILLER (8)", true,4);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 14)
            {
                Character3 bot4 = new Character3 (0, 14, 8, 8,0,0,0,"SUZY LAFAYETTE (8)", true,4);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 15)
            {
                Character3 bot4 = new Character3 (0, 15, 9,9, 0,0,0,"VULTURE SAM (9)", true,4);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 16)
            {
                Character3 bot4 = new Character3 (0, 16, 8,8, 0,0,0,"WILLY THE KID (8)", true,4);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 17)
            {
                Character3 bot4 = new Character3 (0, 17, 7,7, 0,0,0,"JOSÉ DELGADO (7)", true,4);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 18)
            {
                Character3 bot4 = new Character3 (0, 18, 7,7, 0,0,0,"TEQUILA JOE (7)", true,4);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 19)
            {
                Character3 bot4 = new Character3 (0, 19, 9,9, 0,0,0,"APACHE KID (9)", true,4);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 20)
            {
                Character3 bot4 = new Character3 (0, 20,9,9, 0,0,0,"BILL NOFACE (9)", true,4);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 21)
            {
                Character3 bot4 = new Character3 (0, 21, 7,7, 0,0,0,"ELENA FUENTE (7)", true,4);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 22)
            {
                Character3 bot4 = new Character3 (0, 22, 7,7, 0,0,0,"VERA CUSTER (7)", true,4);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 23)
            {
                Character3 bot4 = new Character3 (0, 23, 8,8, 0,0,0,"BELLE STAR (8)", true,4);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 24)
            {
                Character3 bot4 = new Character3 (0, 24, 8,8, 0,0,0,"CHUCK WENGAM (8)", true,4);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 25)
            {
                Character3 bot4 = new Character3 (0, 25, 7,7, 0,0,0,"GREG DIGGER (7)", true,4);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 26)
            {
                Character3 bot4 = new Character3 (0, 26, 8,8, 0,0,0,"HERB HUNTER (8)", true,4);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 27)
            {
                Character3 bot4 = new Character3 (0, 27, 8,8, 0,0,0,"PAT BRENNAN (8)", true,4);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 28)
            {
                Character3 bot4 = new Character3 (0, 28, 9,9, 0,0,0,"PIXIE PETE (9)", true,4);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 29)
            {
                Character3 bot4 = new Character3 (0, 29, 7,7, 0,0,0,"SAM THE HEALER (7)", true,4);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 30)
            {
                Character3 bot4 = new Character3 (0, 30, 8,8, 0,0,0,"SEAN MALLORY (8)", true,4);
                playernum += 1;
                return bot4;
            }
        }
        if (playernum == 6)
        {
            if (charvalue == 1)
            {
                Character3 bot5 = new Character3 (0, 1, 8, 8,0,0,0,"BART CASSIDY (8)", true,5);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 2)
            {
                Character3 bot5 = new Character3 (0, 2, 8,8, 0,0,0,"BLACK JACK (8)", true,5);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 3)
            {
                Character3 bot5 = new Character3 (0, 3, 8,8, 0,0,0,"CALAMITY JANET (8)", true,5);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 4)
            {
                Character3 bot5 = new Character3 (0, 4, 7,7, 0,0,0,"EL GRINGO (7)", true,5);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 5)
            {
                Character3 bot5 = new Character3 (0, 5, 9,9, 0,0,0,"JESSE JONES (9)", true,5);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 6)
            {
                Character3 bot5 = new Character3 (0, 6, 7,7, 0,0,0,"JOURDONNAIS (7)", true,5);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 7)
            {
                Character3 bot5 = new Character3 (0, 7, 7,7, 0,0,0,"KIT CARLSON (7)", true,5);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 8)
            {
                Character3 bot5 = new Character3 (0, 8, 8,8, 0,0,0,"LUCKY DUKE (8)", true,5);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 9)
            {
                Character3 bot5 = new Character3 (0, 9, 9,9, 0,0,0,"PAUL REGRET (9)", true,5);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 10)
            {
                Character3 bot5 = new Character3 (0, 10, 8,8, 0,0,0,"PEDRO RAMIREZ (8)", true,5);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 11)
            {
                Character3 bot5 = new Character3 (0, 11, 9, 9,0,0,0,"ROSE DOOLAN (9)", true,5);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 12)
            {
                Character3 bot5 = new Character3 (0, 12, 8,8, 0,0,0,"SID KETCHUM (8)", true,5);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 13)
            {
                Character3 bot5 = new Character3 (0, 13, 8,8, 0,0,0,"SLAB THE KILLER (8)", true,5);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 14)
            {
                Character3 bot5 = new Character3 (0, 14, 8,8, 0,0,0,"SUZY LAFAYETTE (8)", true,5);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 15)
            {
                Character3 bot5 = new Character3 (0, 15, 9, 9,0,0,0,"VULTURE SAM (9)", true,5);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 16)
            {
                Character3 bot5 = new Character3 (0, 16, 8,8, 0,0,0,"WILLY THE KID (8)", true,5);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 17)
            {
                Character3 bot5 = new Character3 (0, 17, 7,7, 0,0,0,"JOSÉ DELGADO (7)", true,5);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 18)
            {
                Character3 bot5 = new Character3 (0, 18, 7,7, 0,0,0,"TEQUILA JOE (7)", true,5);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 19)
            {
                Character3 bot5 = new Character3 (0, 19, 9,9, 0,0,0,"APACHE KID (9)", true,5);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 20)
            {
                Character3 bot5 = new Character3 (0, 20,9,9, 0,0,0,"BILL NOFACE (9)", true,5);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 21)
            {
                Character3 bot5 = new Character3 (0, 21, 7,7, 0,0,0,"ELENA FUENTE (7)", true,5);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 22)
            {
                Character3 bot5 = new Character3 (0, 22, 7,7, 0,0,0,"VERA CUSTER (7)", true,5);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 23)
            {
                Character3 bot5 = new Character3 (0, 23, 8,8, 0,0,0,"BELLE STAR (8)", true,5);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 24)
            {
                Character3 bot5 = new Character3 (0, 24, 8,8, 0,0,0,"CHUCK WENGAM (8)", true,5);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 25)
            {
                Character3 bot5 = new Character3 (0, 25, 7,7, 0,0,0,"GREG DIGGER (7)", true,5);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 26)
            {
                Character3 bot5 = new Character3 (0, 26, 8,8, 0,0,0,"HERB HUNTER (8)", true,5);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 27)
            {
                Character3 bot5 = new Character3 (0, 27, 8,8, 0,0,0,"PAT BRENNAN (8)", true,5);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 28)
            {
                Character3 bot5 = new Character3 (0, 28, 9,9, 0,0,0,"PIXIE PETE (9)", true,5);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 29)
            {
                Character3 bot5 = new Character3 (0, 29, 7,7, 0,0,0,"SAM THE HEALER (7)", true,5);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 30)
            {
                Character3 bot5 = new Character3 (0, 30, 8,8, 0,0,0,"SEAN MALLORY (8)", true,5);
                playernum += 1;
                return bot5;
            }
        }
        if (playernum == 7)
        {
            if (charvalue == 1)
            {
                Character3 bot6 = new Character3 (0, 1, 8,8, 0,0,0,"BART CASSIDY (8)", true,6);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 2)
            {
                Character3 bot6 = new Character3 (0, 2, 8,8, 0,0,0,"BLACK JACK (8)", true,6);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 3)
            {
                Character3 bot6 = new Character3 (0, 3, 8,8, 0,0,0,"CALAMITY JANET (8)", true,6);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 4)
            {
                Character3 bot6 = new Character3 (0, 4, 7,7, 0,0,0,"EL GRINGO (7)", true,6);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 5)
            {
                Character3 bot6 = new Character3 (0, 5, 9,9, 0,0,0,"JESSE JONES (9)", true,6);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 6)
            {
                Character3 bot6 = new Character3 (0, 6, 7,7, 0,0,0,"JOURDONNAIS (7)", true,6);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 7)
            {
                Character3 bot6 = new Character3 (0, 7, 7,7, 0,0,0,"KIT CARLSON (7)", true,6);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 8)
            {
                Character3 bot6 = new Character3 (0, 8, 8,8, 0,0,0,"LUCKY DUKE (8)", true,6);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 9)
            {
                Character3 bot6 = new Character3 (0, 9, 9,9, 0,0,0,"PAUL REGRET (9)", true,6);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 10)
            {
                Character3 bot6 = new Character3 (0, 10, 8,8, 0,0,0,"PEDRO RAMIREZ (8)", true,6);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 11)
            {
                Character3 bot6 = new Character3 (0, 11, 9,9, 0,0,0,"ROSE DOOLAN (9)", true,6);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 12)
            {
                Character3 bot6 = new Character3 (0, 12, 8,8, 0,0,0,"SID KETCHUM (8)", true,6);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 13)
            {
                Character3 bot6 = new Character3 (0, 13, 8,8, 0,0,0,"SLAB THE KILLER (8)", true,6);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 14)
            {
                Character3 bot6 = new Character3 (0, 14, 8,8, 0,0,0,"SUZY LAFAYETTE (8)", true,6);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 15)
            {
                Character3 bot6 = new Character3 (0, 15, 9,9, 0,0,0,"VULTURE SAM (9)", true,6);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 16)
            {
                Character3 bot6 = new Character3 (0, 16, 8,8, 0,0,0,"WILLY THE KID (8)", true,6);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 17)
            {
                Character3 bot6 = new Character3 (0, 17, 7,7, 0,0,0,"JOSÉ DELGADO (7)", true,6);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 18)
            {
                Character3 bot6 = new Character3 (0, 18, 7,7, 0,0,0,"TEQUILA JOE (7)", true,6);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 19)
            {
                Character3 bot6 = new Character3 (0, 19, 9,9, 0,0,0,"APACHE KID (9)", true,6);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 20)
            {
                Character3 bot6 = new Character3 (0, 20,9,9, 0,0,0,"BILL NOFACE (9)", true,6);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 21)
            {
                Character3 bot6 = new Character3 (0, 21, 7,7, 0,0,0,"ELENA FUENTE (7)", true,6);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 22)
            {
                Character3 bot6 = new Character3 (0, 22, 7,7, 0,0,0,"VERA CUSTER (7)", true,6);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 23)
            {
                Character3 bot6 = new Character3 (0, 23, 8,8, 0,0,0,"BELLE STAR (8)", true,6);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 24)
            {
                Character3 bot6 = new Character3 (0, 24, 8,8, 0,0,0,"CHUCK WENGAM (8)", true,6);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 25)
            {
                Character3 bot6 = new Character3 (0, 25, 7,7, 0,0,0,"GREG DIGGER (7)", true,6);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 26)
            {
                Character3 bot6 = new Character3 (0, 26, 8,8, 0,0,0,"HERB HUNTER (8)", true,6);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 27)
            {
                Character3 bot6 = new Character3 (0, 27, 8,8, 0,0,0,"PAT BRENNAN (8)", true,6);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 28)
            {
                Character3 bot6 = new Character3 (0, 28, 9,9, 0,0,0,"PIXIE PETE (9)", true,6);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 29)
            {
                Character3 bot6 = new Character3 (0, 29, 7,7, 0,0,0,"SAM THE HEALER (7)", true,6);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 30)
            {
                Character3 bot6 = new Character3 (0, 30, 8,8, 0,0,0,"SEAN MALLORY (8)", true,6);
                playernum += 1;
                return bot6;
            }
        }
        if (playernum == 8)
        {
            if (charvalue == 1)
            {
                Character3 bot7 = new Character3 (0, 1, 8,8, 0,0,0,"BART CASSIDY (8)", true,7);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 2)
            {
                Character3 bot7 = new Character3 (0, 2, 8,8, 0,0,0,"BLACK JACK (8)", true,7);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 3)
            {
                Character3 bot7 = new Character3 (0, 3, 8,8, 0,0,0,"CALAMITY JANET (8)", true,7);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 4)
            {
                Character3 bot7 = new Character3 (0, 4, 7,7, 0,0,0,"EL GRINGO (7)", true,7);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 5)
            {
                Character3 bot7 = new Character3 (0, 5, 9,9, 0,0,0,"JESSE JONES (9)", true,7);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 6)
            {
                Character3 bot7 = new Character3 (0, 6, 7,7, 0,0,0,"JOURDONNAIS (7)", true,7);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 7)
            {
                Character3 bot7 = new Character3 (0, 7, 7,7, 0,0,0,"KIT CARLSON (7)", true,7);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 8)
            {
                Character3 bot7 = new Character3 (0, 8, 8,8, 0,0,0,"LUCKY DUKE (8)", true,7);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 9)
            {
                Character3 bot7 = new Character3 (0, 9, 9,9, 0,0,0,"PAUL REGRET (9)", true,7);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 10)
            {
                Character3 bot7 = new Character3 (0, 10, 8,8, 0,0,0,"PEDRO RAMIREZ (8)", true,7);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 11)
            {
                Character3 bot7 = new Character3 (0, 11, 9,9, 0,0,0,"ROSE DOOLAN (9)", true,7);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 12)
            {
                Character3 bot7 = new Character3 (0, 12, 8,8, 0,0,0,"SID KETCHUM (8)", true,7);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 13)
            {
                Character3 bot7 = new Character3 (0, 13, 8,8, 0,0,0,"SLAB THE KILLER (8)", true,7);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 14)
            {
                Character3 bot7 = new Character3 (0, 14, 8,8, 0,0,0,"SUZY LAFAYETTE (8)", true,7);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 15)
            {
                Character3 bot7 = new Character3 (0, 15, 9,9, 0,0,0,"VULTURE SAM (9)", true,7);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 16)
            {
                Character3 bot7 = new Character3 (0, 16, 8,8, 0,0,0,"WILLY THE KID (8)", true,7);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 17)
            {
                Character3 bot7 = new Character3 (0, 17, 7,7, 0,0,0,"JOSÉ DELGADO (7)", true,7);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 18)
            {
                Character3 bot7 = new Character3 (0, 18, 7,7, 0,0,0,"TEQUILA JOE (7)", true,7);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 19)
            {
                Character3 bot7 = new Character3 (0, 19, 9,9, 0,0,0,"APACHE KID (9)", true,7);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 20)
            {
                Character3 bot7 = new Character3 (0, 20,9,9, 0,0,0,"BILL NOFACE (9)", true,7);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 21)
            {
                Character3 bot7 = new Character3 (0, 21, 7,7, 0,0,0,"ELENA FUENTE (7)", true,7);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 22)
            {
                Character3 bot7 = new Character3 (0, 22, 7,7, 0,0,0,"VERA CUSTER (7)", true,7);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 23)
            {
                Character3 bot7 = new Character3 (0, 23, 8,8, 0,0,0,"BELLE STAR (8)", true,7);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 24)
            {
                Character3 bot7 = new Character3 (0, 24, 8,8, 0,0,0,"CHUCK WENGAM (8)", true,7);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 25)
            {
                Character3 bot7 = new Character3 (0, 25, 7,7, 0,0,0,"GREG DIGGER (7)", true,7);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 26)
            {
                Character3 bot7 = new Character3 (0, 26, 8,8, 0,0,0,"HERB HUNTER (8)", true,7);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 27)
            {
                Character3 bot7 = new Character3 (0, 27, 8,8, 0,0,0,"PAT BRENNAN (8)", true,7);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 28)
            {
                Character3 bot7 = new Character3 (0, 28, 9,9, 0,0,0,"PIXIE PETE (9)", true,7);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 29)
            {
                Character3 bot7 = new Character3 (0, 29, 7,7, 0,0,0,"SAM THE HEALER (7)", true,7);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 30)
            {
                Character3 bot7 = new Character3 (0, 30, 8,8, 0,0,0,"SEAN MALLORY (8)", true,7);
                playernum += 1;
                return bot7;
            }
        }
        return null;
    } 
}       
