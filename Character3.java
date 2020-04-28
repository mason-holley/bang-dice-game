/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bang._dice_game;
import java.util.*;
import java.util.Random; 
import bang._dice_game.setup;
/**
 *
 * @author Nicholas
 */
public class Character3 {
    public static int charvalue,char_num, hp, arrows,postion,role,bot1,bot2,bot3,bot4,bot5,bot6,bot7,character_ub_rand = 16, character_rand,playernum;
    String name, ability;
    boolean alive, use;
    public Character3 (int role, int char_num, int hp, int arrows,int postion,String name, boolean alive) 
    {
        this.role = role;
        this.char_num = char_num;
        this.hp = hp;
        this.arrows = arrows;
        this.alive = true;
        this.use = true;
        
    }
    public static Character3 character_choice(int charvalue)
    {
        if (playernum == 1)
        {
            if (charvalue == 1)
            {
                Character3 player = new Character3 (0, 1, 8, 0,0,"BART CASSIDY (8)", true);
                playernum += 1;
                return player;
            }
            if (charvalue == 2)
            {
                Character3 player = new Character3 (0, 2, 8, 0,0,"BLACK JACK (8)", true);
                playernum += 1;
                return player;
            }
            if (charvalue == 3)
            {
                Character3 player = new Character3 (0, 3, 8, 0,0,"CALAMITY JANET (8)", true);
                playernum += 1;
                return player;
            }
            if (charvalue == 4)
            {
                Character3 player = new Character3 (0, 4, 7, 0,0,"EL GRINGO (7)", true);
                playernum += 1;
                return player;
            }
            if (charvalue == 5)
            {
                Character3 player = new Character3 (0, 5, 9, 0,0,"JESSE JONES (9)", true);
                playernum += 1;
                return player;
            }
            if (charvalue == 6)
            {
                Character3 player = new Character3 (0, 6, 7, 0,0,"JOURDONNAIS (7)", true);
                playernum += 1;
                return player;
            }
            if (charvalue == 7)
            {
                Character3 player = new Character3 (0, 7, 7, 0,0,"KIT CARLSON (7)", true);
                playernum += 1;
                return player;
            }
            if (charvalue == 8)
            {
                Character3 player = new Character3 (0, 8, 8, 0,0,"LUCKY DUKE (8)", true);
                playernum += 1;
                return player;
            }
            if (charvalue == 9)
            {
                Character3 player = new Character3 (0, 9, 9, 0,0,"PAUL REGRET (9)", true);
                playernum += 1;
                return player;
            }
            if (charvalue == 10)
            {
                Character3 player = new Character3 (0, 10, 8, 0,0,"PEDRO RAMIREZ (8)", true);
                playernum += 1;
                return player;
            }
            if (charvalue == 11)
            {
                Character3 player = new Character3 (0, 11, 9, 0,0,"ROSE DOOLAN (9)", true);
                playernum += 1;
                return player;
            }
            if (charvalue == 12)
            {
                Character3 player = new Character3 (0, 12, 8, 0,0,"SID KETCHUM (8)", true);
                playernum += 1;
                return player;
            }
            if (charvalue == 13)
            {
                Character3 player = new Character3 (0, 13, 8, 0,0,"SLAB THE KILLER (8)", true);
                playernum += 1;
                return player;
            }
            if (charvalue == 14)
            {
                Character3 player = new Character3 (0, 14, 8, 0,0,"SUZY LAFAYETTE (8)", true);
                playernum += 1;
                return player;
            }
            if (charvalue == 15)
            {
                Character3 player = new Character3 (0, 15, 9, 0,0,"VULTURE SAM (9)", true);
                playernum += 1;
                return player;
            }
            if (charvalue == 16)
            {
                Character3 player = new Character3 (0, 16, 8, 0,0,"WILLY THE KID (8)", true);
                playernum += 1;
                return player;
            }
        }
        if (playernum == 2)
        {
            if (charvalue == 1)
            {
                Character3 bot1 = new Character3 (0, 1, 8, 0,0,"BART CASSIDY (8)", true);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 2)
            {
                Character3 bot1 = new Character3 (0, 2, 8, 0,0,"BLACK JACK (8)", true);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 3)
            {
                Character3 bot1 = new Character3 (0, 3, 8, 0,0,"CALAMITY JANET (8)", true);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 4)
            {
                Character3 bot1 = new Character3 (0, 4, 7, 0,0,"EL GRINGO (7)", true);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 5)
            {
                Character3 bot1 = new Character3 (0, 5, 9, 0,0,"JESSE JONES (9)", true);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 6)
            {
                Character3 bot1 = new Character3 (0, 6, 7, 0,0,"JOURDONNAIS (7)", true);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 7)
            {
                Character3 bot1 = new Character3 (0, 7, 7, 0,0,"KIT CARLSON (7)", true);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 8)
            {
                Character3 bot1 = new Character3 (0, 8, 8, 0,0,"LUCKY DUKE (8)", true);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 9)
            {
                Character3 bot1 = new Character3 (0, 9, 9, 0,0,"PAUL REGRET (9)", true);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 10)
            {
                Character3 bot1 = new Character3 (0, 10, 8, 0,0,"PEDRO RAMIREZ (8)", true);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 11)
            {
                Character3 bot1 = new Character3 (0, 11, 9, 0,0,"ROSE DOOLAN (9)", true);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 12)
            {
                Character3 bot1 = new Character3 (0, 12, 8, 0,0,"SID KETCHUM (8)", true);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 13)
            {
                Character3 bot1 = new Character3 (0, 13, 8, 0,0,"SLAB THE KILLER (8)", true);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 14)
            {
                Character3 bot1 = new Character3 (0, 14, 8, 0,0,"SUZY LAFAYETTE (8)", true);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 15)
            {
                Character3 bot1 = new Character3 (0, 15, 9, 0,0,"VULTURE SAM (9)", true);
                playernum += 1;
                return bot1;
            }
            if (charvalue == 16)
            {
                Character3 bot1 = new Character3 (0, 16, 8, 0,0,"WILLY THE KID (8)", true);
                playernum += 1;
                return bot1;
            }
        }
        if (playernum == 3)
        {
            if (charvalue == 1)
            {
                Character3 bot2 = new Character3 (0, 1, 8, 0,0,"BART CASSIDY (8)", true);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 2)
            {
                Character3 bot2 = new Character3 (0, 2, 8, 0,0,"BLACK JACK (8)", true);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 3)
            {
                Character3 bot2 = new Character3 (0, 3, 8, 0,0,"CALAMITY JANET (8)", true);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 4)
            {
                Character3 bot2 = new Character3 (0, 4, 7, 0,0,"EL GRINGO (7)", true);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 5)
            {
                Character3 bot2 = new Character3 (0, 5, 9, 0,0,"JESSE JONES (9)", true);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 6)
            {
                Character3 bot2 = new Character3 (0, 6, 7, 0,0,"JOURDONNAIS (7)", true);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 7)
            {
                Character3 bot2 = new Character3 (0, 7, 7, 0,0,"KIT CARLSON (7)", true);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 8)
            {
                Character3 bot2 = new Character3 (0, 8, 8, 0,0,"LUCKY DUKE (8)", true);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 9)
            {
                Character3 bot2 = new Character3 (0, 9, 9, 0,0,"PAUL REGRET (9)", true);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 10)
            {
                Character3 bot2 = new Character3 (0, 10, 8, 0,0,"PEDRO RAMIREZ (8)", true);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 11)
            {
                Character3 bot2 = new Character3 (0, 11, 9, 0,0,"ROSE DOOLAN (9)", true);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 12)
            {
                Character3 bot2 = new Character3 (0, 12, 8, 0,0,"SID KETCHUM (8)", true);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 13)
            {
                Character3 bot2 = new Character3 (0, 13, 8, 0,0,"SLAB THE KILLER (8)", true);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 14)
            {
                Character3 bot2 = new Character3 (0, 14, 8, 0,0,"SUZY LAFAYETTE (8)", true);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 15)
            {
                Character3 bot2 = new Character3 (0, 15, 9, 0,0,"VULTURE SAM (9)", true);
                playernum += 1;
                return bot2;
            }
            if (charvalue == 16)
            {
                Character3 bot2 = new Character3 (0, 16, 8, 0,0,"WILLY THE KID (8)", true);
                playernum += 1;
                return bot2;
            }
        }
        if (playernum == 4)
        {
            if (charvalue == 1)
            {
                Character3 bot3 = new Character3 (0, 1, 8, 0,0,"BART CASSIDY (8)", true);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 2)
            {
                Character3 bot3 = new Character3 (0, 2, 8, 0,0,"BLACK JACK (8)", true);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 3)
            {
                Character3 bot3 = new Character3 (0, 3, 8, 0,0,"CALAMITY JANET (8)", true);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 4)
            {
                Character3 bot3 = new Character3 (0, 4, 7, 0,0,"EL GRINGO (7)", true);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 5)
            {
                Character3 bot3 = new Character3 (0, 5, 9, 0,0,"JESSE JONES (9)", true);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 6)
            {
                Character3 bot3 = new Character3 (0, 6, 7, 0,0,"JOURDONNAIS (7)", true);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 7)
            {
                Character3 bot3 = new Character3 (0, 7, 7, 0,0,"KIT CARLSON (7)", true);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 8)
            {
                Character3 bot3 = new Character3 (0, 8, 8, 0,0,"LUCKY DUKE (8)", true);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 9)
            {
                Character3 bot3 = new Character3 (0, 9, 9, 0,0,"PAUL REGRET (9)", true);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 10)
            {
                Character3 bot3 = new Character3 (0, 10, 8, 0,0,"PEDRO RAMIREZ (8)", true);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 11)
            {
                Character3 bot3 = new Character3 (0, 11, 9, 0,0,"ROSE DOOLAN (9)", true);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 12)
            {
                Character3 bot3 = new Character3 (0, 12, 8, 0,0,"SID KETCHUM (8)", true);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 13)
            {
                Character3 bot3 = new Character3 (0, 13, 8, 0,0,"SLAB THE KILLER (8)", true);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 14)
            {
                Character3 bot3 = new Character3 (0, 14, 8, 0,0,"SUZY LAFAYETTE (8)", true);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 15)
            {
                Character3 bot3 = new Character3 (0, 15, 9, 0,0,"VULTURE SAM (9)", true);
                playernum += 1;
                return bot3;
            }
            if (charvalue == 16)
            {
                Character3 bot3 = new Character3 (0, 16, 8, 0,0,"WILLY THE KID (8)", true);
                playernum += 1;
                return bot3;
            }
        }
        if (playernum == 5)
        {
            if (charvalue == 1)
            {
                Character3 bot4 = new Character3 (0, 1, 8, 0,0,"BART CASSIDY (8)", true);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 2)
            {
                Character3 bot4 = new Character3 (0, 2, 8, 0,0,"BLACK JACK (8)", true);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 3)
            {
                Character3 bot4 = new Character3 (0, 3, 8, 0,0,"CALAMITY JANET (8)", true);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 4)
            {
                Character3 bot4 = new Character3 (0, 4, 7, 0,0,"EL GRINGO (7)", true);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 5)
            {
                Character3 bot4 = new Character3 (0, 5, 9, 0,0,"JESSE JONES (9)", true);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 6)
            {
                Character3 bot4 = new Character3 (0, 6, 7, 0,0,"JOURDONNAIS (7)", true);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 7)
            {
                Character3 bot4 = new Character3 (0, 7, 7, 0,0,"KIT CARLSON (7)", true);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 8)
            {
                Character3 bot4 = new Character3 (0, 8, 8, 0,0,"LUCKY DUKE (8)", true);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 9)
            {
                Character3 bot4 = new Character3 (0, 9, 9, 0,0,"PAUL REGRET (9)", true);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 10)
            {
                Character3 bot4 = new Character3 (0, 10, 8, 0,0,"PEDRO RAMIREZ (8)", true);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 11)
            {
                Character3 bot4 = new Character3 (0, 11, 9, 0,0,"ROSE DOOLAN (9)", true);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 12)
            {
                Character3 bot4 = new Character3 (0, 12, 8, 0,0,"SID KETCHUM (8)", true);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 13)
            {
                Character3 bot4 = new Character3 (0, 13, 8, 0,0,"SLAB THE KILLER (8)", true);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 14)
            {
                Character3 bot4 = new Character3 (0, 14, 8, 0,0,"SUZY LAFAYETTE (8)", true);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 15)
            {
                Character3 bot4 = new Character3 (0, 15, 9, 0,0,"VULTURE SAM (9)", true);
                playernum += 1;
                return bot4;
            }
            if (charvalue == 16)
            {
                Character3 bot4 = new Character3 (0, 16, 8, 0,0,"WILLY THE KID (8)", true);
                playernum += 1;
                return bot4;
            }
        }
        if (playernum == 6)
        {
            if (charvalue == 1)
            {
                Character3 bot5 = new Character3 (0, 1, 8, 0,0,"BART CASSIDY (8)", true);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 2)
            {
                Character3 bot5 = new Character3 (0, 2, 8, 0,0,"BLACK JACK (8)", true);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 3)
            {
                Character3 bot5 = new Character3 (0, 3, 8, 0,0,"CALAMITY JANET (8)", true);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 4)
            {
                Character3 bot5 = new Character3 (0, 4, 7, 0,0,"EL GRINGO (7)", true);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 5)
            {
                Character3 bot5 = new Character3 (0, 5, 9, 0,0,"JESSE JONES (9)", true);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 6)
            {
                Character3 bot5 = new Character3 (0, 6, 7, 0,0,"JOURDONNAIS (7)", true);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 7)
            {
                Character3 bot5 = new Character3 (0, 7, 7, 0,0,"KIT CARLSON (7)", true);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 8)
            {
                Character3 bot5 = new Character3 (0, 8, 8, 0,0,"LUCKY DUKE (8)", true);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 9)
            {
                Character3 bot5 = new Character3 (0, 9, 9, 0,0,"PAUL REGRET (9)", true);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 10)
            {
                Character3 bot5 = new Character3 (0, 10, 8, 0,0,"PEDRO RAMIREZ (8)", true);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 11)
            {
                Character3 bot5 = new Character3 (0, 11, 9, 0,0,"ROSE DOOLAN (9)", true);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 12)
            {
                Character3 bot5 = new Character3 (0, 12, 8, 0,0,"SID KETCHUM (8)", true);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 13)
            {
                Character3 bot5 = new Character3 (0, 13, 8, 0,0,"SLAB THE KILLER (8)", true);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 14)
            {
                Character3 bot5 = new Character3 (0, 14, 8, 0,0,"SUZY LAFAYETTE (8)", true);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 15)
            {
                Character3 bot5 = new Character3 (0, 15, 9, 0,0,"VULTURE SAM (9)", true);
                playernum += 1;
                return bot5;
            }
            if (charvalue == 16)
            {
                Character3 bot5 = new Character3 (0, 16, 8, 0,0,"WILLY THE KID (8)", true);
                playernum += 1;
                return bot5;
            }
        }
        if (playernum == 7)
        {
            if (charvalue == 1)
            {
                Character3 bot6 = new Character3 (0, 1, 8, 0,0,"BART CASSIDY (8)", true);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 2)
            {
                Character3 bot6 = new Character3 (0, 2, 8, 0,0,"BLACK JACK (8)", true);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 3)
            {
                Character3 bot6 = new Character3 (0, 3, 8, 0,0,"CALAMITY JANET (8)", true);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 4)
            {
                Character3 bot6 = new Character3 (0, 4, 7, 0,0,"EL GRINGO (7)", true);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 5)
            {
                Character3 bot6 = new Character3 (0, 5, 9, 0,0,"JESSE JONES (9)", true);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 6)
            {
                Character3 bot6 = new Character3 (0, 6, 7, 0,0,"JOURDONNAIS (7)", true);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 7)
            {
                Character3 bot6 = new Character3 (0, 7, 7, 0,0,"KIT CARLSON (7)", true);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 8)
            {
                Character3 bot6 = new Character3 (0, 8, 8, 0,0,"LUCKY DUKE (8)", true);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 9)
            {
                Character3 bot6 = new Character3 (0, 9, 9, 0,0,"PAUL REGRET (9)", true);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 10)
            {
                Character3 bot6 = new Character3 (0, 10, 8, 0,0,"PEDRO RAMIREZ (8)", true);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 11)
            {
                Character3 bot6 = new Character3 (0, 11, 9, 0,0,"ROSE DOOLAN (9)", true);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 12)
            {
                Character3 bot6 = new Character3 (0, 12, 8, 0,0,"SID KETCHUM (8)", true);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 13)
            {
                Character3 bot6 = new Character3 (0, 13, 8, 0,0,"SLAB THE KILLER (8)", true);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 14)
            {
                Character3 bot6 = new Character3 (0, 14, 8, 0,0,"SUZY LAFAYETTE (8)", true);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 15)
            {
                Character3 bot6 = new Character3 (0, 15, 9, 0,0,"VULTURE SAM (9)", true);
                playernum += 1;
                return bot6;
            }
            if (charvalue == 16)
            {
                Character3 bot6 = new Character3 (0, 16, 8, 0,0,"WILLY THE KID (8)", true);
                playernum += 1;
                return bot6;
            }
        }
        if (playernum == 8)
        {
            if (charvalue == 1)
            {
                Character3 bot7 = new Character3 (0, 1, 8, 0,0,"BART CASSIDY (8)", true);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 2)
            {
                Character3 bot7 = new Character3 (0, 2, 8, 0,0,"BLACK JACK (8)", true);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 3)
            {
                Character3 bot7 = new Character3 (0, 3, 8, 0,0,"CALAMITY JANET (8)", true);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 4)
            {
                Character3 bot7 = new Character3 (0, 4, 7, 0,0,"EL GRINGO (7)", true);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 5)
            {
                Character3 bot7 = new Character3 (0, 5, 9, 0,0,"JESSE JONES (9)", true);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 6)
            {
                Character3 bot7 = new Character3 (0, 6, 7, 0,0,"JOURDONNAIS (7)", true);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 7)
            {
                Character3 bot7 = new Character3 (0, 7, 7, 0,0,"KIT CARLSON (7)", true);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 8)
            {
                Character3 bot7 = new Character3 (0, 8, 8, 0,0,"LUCKY DUKE (8)", true);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 9)
            {
                Character3 bot7 = new Character3 (0, 9, 9, 0,0,"PAUL REGRET (9)", true);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 10)
            {
                Character3 bot7 = new Character3 (0, 10, 8, 0,0,"PEDRO RAMIREZ (8)", true);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 11)
            {
                Character3 bot7 = new Character3 (0, 11, 9, 0,0,"ROSE DOOLAN (9)", true);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 12)
            {
                Character3 bot7 = new Character3 (0, 12, 8, 0,0,"SID KETCHUM (8)", true);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 13)
            {
                Character3 bot7 = new Character3 (0, 13, 8, 0,0,"SLAB THE KILLER (8)", true);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 14)
            {
                Character3 bot7 = new Character3 (0, 14, 8, 0,0,"SUZY LAFAYETTE (8)", true);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 15)
            {
                Character3 bot7 = new Character3 (0, 15, 9, 0,0,"VULTURE SAM (9)", true);
                playernum += 1;
                return bot7;
            }
            if (charvalue == 16)
            {
                Character3 bot7 = new Character3 (0, 16, 8, 0,0,"WILLY THE KID (8)", true);
                playernum += 1;
                return bot7;
            }
        }
        return null;
    } 
}