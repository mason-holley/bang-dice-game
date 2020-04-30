/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bang._dice_game;
import java.util.*;
import bang._dice_game.setup;
/**
 *
 * @author Nicholas
 */
public class Character3 {
    public static int charvalue,char_num, hp, arrows,position,role,playernum,playernumber,startposition,starthp;
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
    public int getposition ()
    {
        return this.position;
    }
    public void setposition (int newpostion)
    {
        this.position = newpostion;
    }
    public int gethp ()
    {
        return this.hp;
    }
    public int getstarthp ()
    {
        return this.starthp;
    }
    public void sethp (int newhp)
    {
        this.hp = newhp;
    }
     public int getrole ()
    {
        return this.role;
    }
    public void setrole (int role)
    {
        this.role = role;
    }
     public int getarrows ()
    {
        return this.arrows;
    }
     public void addarrows (int newarrows)
    {
        this.arrows += newarrows;
    }
    public void setarrows (int newarrows)
    {
        this.arrows = newarrows;
    }
     public int getstartposition ()
    {
        return this.startposition;
    }
    public void setstartposition (int newpostion)
    {
        this.startposition = newpostion;
    }
    public int getcharnum ()
    {
        return this.char_num;
    }
    public void setdead ()
    {
        this.alive = false;
    }
    public Character3 character_choice(int charvalue)
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
        }
        return null;
    } 
}       
