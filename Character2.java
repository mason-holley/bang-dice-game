/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bang._dice_game;
import java.util.Random; 
import bang._dice_game.setup;
/**
 *
 * @author Nicholas
 */
public class Character2 {
    public static int userchoice=1,char_num, hp, arrows,role,numplayers = 7,bot1,bot2,bot3,bot4,bot5,bot6,bot7,bot1_choice,bot2_choice,bot3_choice,bot4_choice,bot5_choice,bot6_choice,bot7_choice,character_ub_rand = 16, character_rand;
    String name, ability;
    boolean alive, use;
    public Character2 (int role, int char_num, int hp, int arrows,String name, String ability, boolean alive, boolean use) 
    {
        this.role = role;
        this.char_num = char_num;
        this.hp = hp;
        this.arrows = arrows;
        this.alive = true;
        this.use = true;
        
    }
    public static void user_character(int userchoice)
    {
        
        if (userchoice == 1)
        {
            Character2 player = new Character2 (0, 1, 8, 0,"BART CASSIDY (8)","You may take an arrow instead of losing a life/n" +
"point (except to Indians or Dynamite)./n" +
"You cannot use this ability if you lose a life point/n" +
"to Indian or Dynamite, only for Bull’s Eye “1”,Bull’s Eye “2”, or Gatling/n" +
"Guns. You may not use this ability to take the last/n" +
"arrow remaining in the pile.", true, true);
        }
        if (userchoice == 2)
        {
            Character2 player = new Character2 (0, 2, 8, 0,"BLACK JACK (8)","You may re-roll Dynamite (not if you roll three or more!)./n" +
" If you roll three or more Dynamite at once (or in/n" +
"total if you didn’t re-roll them), follow the usual/n" +
"rules (your turn ends, etc.)", true, true);
        }
        if (userchoice == 3)
        {
            Character2 player = new Character2 (0, 3, 8, 0,"CALAMITY JANET (8)","You can use Bull’s Eye “1” as Bull’s Eye “2” and vice-versa.", true, true);
        }
        if (userchoice == 4)
        {
            Character2 player = new Character2 (0, 4, 7, 0,"EL GRINGO (7)","When a player makes you lose one or more life/n" +
"points, he must take an arrow./n" +
"Life points lost to Indians or Dynamite are not affected.", true, true);
        }
        if (userchoice == 5)
        {
            Character2 player = new Character2 (0, 5, 9, 0,"JESSE JONES (9)","If you have four life points or less, you gain two if you/n" +
"use Beer for yourself./n" +
"For example, if you have four life points and use/n" +
"two beers, you get four life points.", true, true);
        }
        if (userchoice == 6)
        {
            Character2 player = new Character2 (0, 6, 7, 0,"JOURDONNAIS (7)","You never lose more than one life point to Indians.", true, true);
        }
        if (userchoice == 7)
        {
            Character2 player = new Character2 (0, 7, 7, 0,"KIT CARLSON (7)","For each Gatling you may discard one arrow from/n" +
"any player./n" +
"You may choose to discard your own arrows. If you/n" +
"roll three Gatling, you discard all your own arrows,/n" +
"plus three from any player(s) (of course, you still/n" +
"deal one damage to each other player).", true, true);
        }
        if (userchoice == 8)
        {
            Character2 player = new Character2 (0, 8, 8, 0,"LUCKY DUKE (8)","You may make one extra re-roll./n" +
"You may roll the dice a total of four times on your turn.", true, true);
        }
        if (userchoice == 9)
        {
            Character2 player = new Character2 (0, 9, 9, 0,"PAUL REGRET (9)","You never lose life points to the Gatling Gun.", true, true);
        }
        if (userchoice == 10)
        {
            Character2 player = new Character2 (0, 10, 8, 0,"PEDRO RAMIREZ (8)","Each time you lose a life point, you may discard/n" +
"one of your arrows./n" +
"You still lose the life point when you use this ability", true, true);
        }
        if (userchoice == 11)
        {
            Character2 player = new Character2 (0, 11, 9, 0,"ROSE DOOLAN (9)","You may use Bull’s Eye “1” or Bull’s Eye “2” for players sitting one place/n" +
"further./n" +
"With Bull’s Eye “1” you may hit a player sitting up to two/n" +
"places away, and with Bull’s Eye “2” you may hit a player/n" +
"sitting two or three places away", true, true);
        }
        if (userchoice == 12)
        {
            Character2 player = new Character2 (0, 12, 8, 0,"SID KETCHUM (8)","At the beginning of your turn, any player of your/n" +
"choice gains one life point./n" +
"You may also choose yourself.", true, true);
        }
        if (userchoice == 13)
        {
            Character2 player = new Character2 (0, 13, 8, 0,"SLAB THE KILLER (8)","Once per turn, you can use a Beer to double a Bull’s Eye “1” or Bull’s Eye “2” ./n" +
"The dice you double takes two life points away from/n" +
"the same player (you can’t choose two different/n" +
"players). The Beer in this case does not provide any/n" +
"life points.", true, true);
        }
        if (userchoice == 14)
        {
            Character2 player = new Character2 (0, 14, 8, 0,"SUZY LAFAYETTE (8)","If you didn’t roll any Bull’s Eye “1” or Bull’s Eye “2” , you gain two life points./n" +
"This only applies at the end of your turn, not during/n" +
"your re-rolls.", true, true);
        }
        if (userchoice == 15)
        {
            Character2 player = new Character2 (0, 15, 9, 0,"VULTURE SAM (9)","Each time another player is eliminated, you gain/n" +
"two life points.", true, true);
        }
        if (userchoice == 16)
        {
            Character2 player = new Character2 (0, 16, 8, 0,"WILLY THE KID (8)","You only need two Gatling to use the Gatling Gun./n" +
"You can activate the Gatling Gun only once per turn,/n" +
"even if you roll more than two Gatling results.", true, true);
        }
    }
    public static void bot_characters(int numplayers, int userchoice)
    {
        Random rand = new Random();
        if (numplayers >= 1)
        {
            if (numplayers >= 2)
            {
                if (numplayers >= 3)
                {
                    if (numplayers >= 4)
                    {
                        if (numplayers >= 5)
                        {
                            if (numplayers >= 6)
                            { 
                                if (numplayers >= 7)
                                    {
                                        character_rand = rand.nextInt (character_ub_rand) + 1;
                                        if (character_rand == userchoice)
                                            {
                                                character_rand = character_rand + 1;
                                                if (character_rand >= 16 && character_rand == userchoice)
                                                {
                                                    character_rand = 1;
                                                }
                                            }   
                                        if (character_rand == 1)
                                        {
                                        Character2 bot7 = new Character2 (0, 1, 8, 0,"BART CASSIDY (8)","You may take an arrow instead of losing a life/n" +
                                        "point (except to Indians or Dynamite)./n" +
                                        "You cannot use this ability if you lose a life point/n" +
                                        "to Indian or Dynamite, only for Bull’s Eye “1”,Bull’s Eye “2”, or Gatling/n" +
                                        "Guns. You may not use this ability to take the last/n" +
                                        "arrow remaining in the pile.", true, true);
                                        }
                                        if (character_rand == 2)
                                        {
                                        Character2 bot7 = new Character2 (0, 2, 8, 0,"BLACK JACK (8)","You may re-roll Dynamite (not if you roll three or more!)./n" +
                                        " If you roll three or more Dynamite at once (or in/n" +
                                        "total if you didn’t re-roll them), follow the usual/n" +
                                        "rules (your turn ends, etc.)", true, true);
                                        }
                                        if (character_rand == 3)
                                        {
                                        Character2 bot7 = new Character2 (0, 3, 8, 0,"CALAMITY JANET (8)","You can use Bull’s Eye “1” as Bull’s Eye “2” and vice-versa.", true, true);
                                        }
                                        if (character_rand == 4)
                                        {
                                        Character2 bot7 = new Character2 (0, 4, 7, 0,"EL GRINGO (7)","When a player makes you lose one or more life/n" +
                                        "points, he must take an arrow./n" +
                                        "Life points lost to Indians or Dynamite are not affected.", true, true);
                                        }
                                        if (character_rand == 5)
                                        {
                                        Character2 bot7 = new Character2 (0, 5, 9, 0,"JESSE JONES (9)","If you have four life points or less, you gain two if you/n" +
                                        "use Beer for yourself./n" +
                                        "For example, if you have four life points and use/n" +
                                        "two beers, you get four life points.", true, true);
                                        }
                                        if (character_rand == 6)
                                        {
                                        Character2 bot7 = new Character2 (0, 6, 7, 0,"JOURDONNAIS (7)","You never lose more than one life point to Indians.", true, true);
                                        }
                                        if (character_rand == 7)
                                        {
                                        Character2 bot7 = new Character2 (0, 7, 7, 0,"KIT CARLSON (7)","For each Gatling you may discard one arrow from/n" +
                                        "any player./n" +
                                        "You may choose to discard your own arrows. If you/n" +
                                        "roll three Gatling, you discard all your own arrows,/n" +
                                        "plus three from any player(s) (of course, you still/n" +
                                        "deal one damage to each other player).", true, true);
                                        }
                                        if (character_rand == 8)
                                        {
                                        Character2 bot7 = new Character2 (0, 8, 8, 0,"LUCKY DUKE (8)","You may make one extra re-roll./n" +
                                        "You may roll the dice a total of four times on your turn.", true, true);
                                        }
                                        if (character_rand == 9)
                                        {
                                        Character2 bot7 = new Character2 (0, 9, 9, 0,"PAUL REGRET (9)","You never lose life points to the Gatling Gun.", true, true);
                                        }
                                        if (character_rand == 10)
                                        {
                                        Character2 bot7 = new Character2 (0, 10, 8, 0,"PEDRO RAMIREZ (8)","Each time you lose a life point, you may discard/n" +
                                        "one of your arrows./n" +
                                        "You still lose the life point when you use this ability", true, true);
                                        }
                                        if (character_rand == 11)
                                        {
                                        Character2 bot7 = new Character2 (0, 11, 9, 0,"ROSE DOOLAN (9)","You may use Bull’s Eye “1” or Bull’s Eye “2” for players sitting one place/n" +
                                        "further./n" +
                                        "With Bull’s Eye “1” you may hit a player sitting up to two/n" +
                                        "places away, and with Bull’s Eye “2” you may hit a player/n" +
                                        "sitting two or three places away", true, true);
                                        }
                                        if (character_rand == 12)
                                        {
                                        Character2 bot7 = new Character2 (0, 12, 8, 0,"SID KETCHUM (8)","At the beginning of your turn, any player of your/n" +
                                        "choice gains one life point./n" +
                                        "You may also choose yourself.", true, true);
                                        }
                                        if (character_rand == 13)
                                        {
                                        Character2 bot7 = new Character2 (0, 13, 8, 0,"SLAB THE KILLER (8)","Once per turn, you can use a Beer to double a Bull’s Eye “1” or Bull’s Eye “2” ./n" +
                                        "The dice you double takes two life points away from/n" +
                                        "the same player (you can’t choose two different/n" +
                                        "players). The Beer in this case does not provide any/n" +
                                        "life points.", true, true);
                                        }
                                        if (character_rand == 14)
                                        {
                                        Character2 bot7 = new Character2 (0, 14, 8, 0,"SUZY LAFAYETTE (8)","If you didn’t roll any Bull’s Eye “1” or Bull’s Eye “2” , you gain two life points./n" +
                                        "This only applies at the end of your turn, not during/n" +
                                        "your re-rolls.", true, true);
                                        }
                                        if (character_rand == 15)
                                        {
                                        Character2 bot7 = new Character2 (0, 15, 9, 0,"VULTURE SAM (9)","Each time another player is eliminated, you gain/n" +
                                        "two life points.", true, true);
                                        }
                                        if (character_rand == 16)
                                        {
                                        Character2 bot7 = new Character2 (0, 16, 8, 0,"WILLY THE KID (8)","You only need two Gatling to use the Gatling Gun./n" +
                                        "You can activate the Gatling Gun only once per turn,/n" +
                                        "even if you roll more than two Gatling results.", true, true);
                                        }
                                        bot7_choice = character_rand;
                                        }
                            int character_rand = rand.nextInt (character_ub_rand) + 1;
                            while (character_rand >= userchoice || character_rand == bot7_choice)
                            {
                                character_rand = character_rand + 1;
                                if (character_rand == 16 && (character_rand == userchoice || character_rand == bot7_choice))
                                {
                                    character_rand = 1;
                                }
                            }
                            if (character_rand == 1)
                            {
                                Character2 bot6 = new Character2 (0, 1, 8, 0,"BART CASSIDY (8)","You may take an arrow instead of losing a life/n" +
                               "point (except to Indians or Dynamite)./n" +
                               "You cannot use this ability if you lose a life point/n" +
                               "to Indian or Dynamite, only for Bull’s Eye “1”,Bull’s Eye “2”, or Gatling/n" +
                               "Guns. You may not use this ability to take the last/n" +
                               "arrow remaining in the pile.", true, true);
                            }
                            if (character_rand == 2)
                            {
                            Character2 bot6 = new Character2 (0, 2, 8, 0,"BLACK JACK (8)","You may re-roll Dynamite (not if you roll three or more!)./n" +
                               " If you roll three or more Dynamite at once (or in/n" +
                               "total if you didn’t re-roll them), follow the usual/n" +
                               "rules (your turn ends, etc.)", true, true);
                            }
                            if (character_rand == 3)
                            {
                            Character2 bot6 = new Character2 (0, 3, 8, 0,"CALAMITY JANET (8)","You can use Bull’s Eye “1” as Bull’s Eye “2” and vice-versa.", true, true);
                            }
                            if (character_rand == 4)
                            {
                            Character2 bot6 = new Character2 (0, 4, 7, 0,"EL GRINGO (7)","When a player makes you lose one or more life/n" +
                               "points, he must take an arrow./n" +
                               "Life points lost to Indians or Dynamite are not affected.", true, true);
                            }
                            if (character_rand == 5)
                            {
                            Character2 bot6 = new Character2 (0, 5, 9, 0,"JESSE JONES (9)","If you have four life points or less, you gain two if you/n" +
                               "use Beer for yourself./n" +
                               "For example, if you have four life points and use/n" +
                               "two beers, you get four life points.", true, true);
                            }
                            if (character_rand == 6)
                            {
                            Character2 bot6 = new Character2 (0, 6, 7, 0,"JOURDONNAIS (7)","You never lose more than one life point to Indians.", true, true);
                            }
                            if (character_rand == 7)
                            {
                            Character2 bot6 = new Character2 (0, 7, 7, 0,"KIT CARLSON (7)","For each Gatling you may discard one arrow from/n" +
                               "any player./n" +
                               "You may choose to discard your own arrows. If you/n" +
                               "roll three Gatling, you discard all your own arrows,/n" +
                               "plus three from any player(s) (of course, you still/n" +
                               "deal one damage to each other player).", true, true);
                            }
                            if (character_rand == 8)
                            {
                            Character2 bot6 = new Character2 (0, 8, 8, 0,"LUCKY DUKE (8)","You may make one extra re-roll./n" +
                               "You may roll the dice a total of four times on your turn.", true, true);
                            }
                            if (character_rand == 9)
                            {
                            Character2 bot6 = new Character2 (0, 9, 9, 0,"PAUL REGRET (9)","You never lose life points to the Gatling Gun.", true, true);
                            }
                            if (character_rand == 10)
                            {
                            Character2 bot6 = new Character2 (0, 10, 8, 0,"PEDRO RAMIREZ (8)","Each time you lose a life point, you may discard/n" +
                            "one of your arrows./n" +
                            "You still lose the life point when you use this ability", true, true);
                            }
                            if (character_rand == 11)
                            {
                            Character2 bot6 = new Character2 (0, 11, 9, 0,"ROSE DOOLAN (9)","You may use Bull’s Eye “1” or Bull’s Eye “2” for players sitting one place/n" +
                            "further./n" +
                            "With Bull’s Eye “1” you may hit a player sitting up to two/n" +
                            "places away, and with Bull’s Eye “2” you may hit a player/n" +
                            "sitting two or three places away", true, true);
                            }
                            if (character_rand == 12)
                            {
                            Character2 bot6 = new Character2 (0, 12, 8, 0,"SID KETCHUM (8)","At the beginning of your turn, any player of your/n" +
                            "choice gains one life point./n" +
                            "You may also choose yourself.", true, true);
                            }
                            if (character_rand == 13)
                            {
                            Character2 bot6 = new Character2 (0, 13, 8, 0,"SLAB THE KILLER (8)","Once per turn, you can use a Beer to double a Bull’s Eye “1” or Bull’s Eye “2” ./n" +
                            "The dice you double takes two life points away from/n" +
                            "the same player (you can’t choose two different/n" +
                            "players). The Beer in this case does not provide any/n" +
                            "life points.", true, true);
                            }
                            if (character_rand == 14)
                            {
                            Character2 bot6 = new Character2 (0, 14, 8, 0,"SUZY LAFAYETTE (8)","If you didn’t roll any Bull’s Eye “1” or Bull’s Eye “2” , you gain two life points./n" +
                            "This only applies at the end of your turn, not during/n" +
                            "your re-rolls.", true, true);
                            }
                            if (character_rand == 15)
                            {
                            Character2 bot6 = new Character2 (0, 15, 9, 0,"VULTURE SAM (9)","Each time another player is eliminated, you gain/n" +
                            "two life points.", true, true);
                            }
                            if (character_rand == 16)
                            {
                            Character2 bot6 = new Character2 (0, 16, 8, 0,"WILLY THE KID (8)","You only need two Gatling to use the Gatling Gun./n" +
                            "You can activate the Gatling Gun only once per turn,/n" +
                            "even if you roll more than two Gatling results.", true, true);
                            }
                            bot6_choice = character_rand;
                            }
                        int character_rand = rand.nextInt (character_ub_rand) + 1;
                        while (character_rand >= userchoice || character_rand == bot7_choice || character_rand == bot6_choice)
                        {
                            character_rand = character_rand + 1;
                            if (character_rand == 16 && (character_rand == userchoice || character_rand == bot7_choice || character_rand == bot6_choice))
                            {
                                character_rand = 1;
                            }
                        }
                        if (character_rand == 1)
                        {
                        Character2 bot5 = new Character2 (0, 1, 8, 0,"BART CASSIDY (8)","You may take an arrow instead of losing a life/n" +
                        "point (except to Indians or Dynamite)./n" +
                        "You cannot use this ability if you lose a life point/n" +
                        "to Indian or Dynamite, only for Bull’s Eye “1”,Bull’s Eye “2”, or Gatling/n" +
                        "Guns. You may not use this ability to take the last/n" +
                        "arrow remaining in the pile.", true, true);
                        }
                        if (character_rand == 2)
                        {
                        Character2 bot5 = new Character2 (0, 2, 8, 0,"BLACK JACK (8)","You may re-roll Dynamite (not if you roll three or more!)./n" +
                        " If you roll three or more Dynamite at once (or in/n" +
                        "total if you didn’t re-roll them), follow the usual/n" +
                        "rules (your turn ends, etc.)", true, true);
                        }
                        if (character_rand == 3)
                        {
                        Character2 bot5 = new Character2 (0, 3, 8, 0,"CALAMITY JANET (8)","You can use Bull’s Eye “1” as Bull’s Eye “2” and vice-versa.", true, true);
                        }
                        if (character_rand == 4)
                        {
                        Character2 bot5 = new Character2 (0, 4, 7, 0,"EL GRINGO (7)","When a player makes you lose one or more life/n" +
                        "points, he must take an arrow./n" +
                        "Life points lost to Indians or Dynamite are not affected.", true, true);
                        }
                        if (character_rand == 5)
                        {
                        Character2 bot5 = new Character2 (0, 5, 9, 0,"JESSE JONES (9)","If you have four life points or less, you gain two if you/n" +
                        "use Beer for yourself./n" +
                        "For example, if you have four life points and use/n" +
                        "two beers, you get four life points.", true, true);
                        }
                        if (character_rand == 6)
                        {
                        Character2 bot5 = new Character2 (0, 6, 7, 0,"JOURDONNAIS (7)","You never lose more than one life point to Indians.", true, true);
                        }
                        if (character_rand == 7)
                        {
                        Character2 bot5 = new Character2 (0, 7, 7, 0,"KIT CARLSON (7)","For each Gatling you may discard one arrow from/n" +
                        "any player./n" +
                        "You may choose to discard your own arrows. If you/n" +
                        "roll three Gatling, you discard all your own arrows,/n" +
                        "plus three from any player(s) (of course, you still/n" +
                        "deal one damage to each other player).", true, true);
                        }
                        if (character_rand == 8)
                        {
                        Character2 bot5 = new Character2 (0, 8, 8, 0,"LUCKY DUKE (8)","You may make one extra re-roll./n" +
                        "You may roll the dice a total of four times on your turn.", true, true);
                         }
                        if (character_rand == 9)
                        {
                        Character2 bot5 = new Character2 (0, 9, 9, 0,"PAUL REGRET (9)","You never lose life points to the Gatling Gun.", true, true);
                        }
                        if (character_rand == 10)
                        {
                        Character2 bot5 = new Character2 (0, 10, 8, 0,"PEDRO RAMIREZ (8)","Each time you lose a life point, you may discard/n" +
                        "one of your arrows./n" +
                        "You still lose the life point when you use this ability", true, true);
                        }
                        if (character_rand == 11)
                        {
                        Character2 bot5 = new Character2 (0, 11, 9, 0,"ROSE DOOLAN (9)","You may use Bull’s Eye “1” or Bull’s Eye “2” for players sitting one place/n" +
                        "further./n" +
                        "With Bull’s Eye “1” you may hit a player sitting up to two/n" +
                        "places away, and with Bull’s Eye “2” you may hit a player/n" +
                        "sitting two or three places away", true, true);
                        }
                        if (character_rand == 12)
                        {
                        Character2 bot5 = new Character2 (0, 12, 8, 0,"SID KETCHUM (8)","At the beginning of your turn, any player of your/n" +
                        "choice gains one life point./n" +
                        "You may also choose yourself.", true, true);
                        }
                        if (character_rand == 13)
                        {
                        Character2 bot5 = new Character2 (0, 13, 8, 0,"SLAB THE KILLER (8)","Once per turn, you can use a Beer to double a Bull’s Eye “1” or Bull’s Eye “2” ./n" +
                        "The dice you double takes two life points away from/n" +
                        "the same player (you can’t choose two different/n" +
                        "players). The Beer in this case does not provide any/n" +
                        "life points.", true, true);
                        }
                        if (character_rand == 14)
                        {
                        Character2 bot5 = new Character2 (0, 14, 8, 0,"SUZY LAFAYETTE (8)","If you didn’t roll any Bull’s Eye “1” or Bull’s Eye “2” , you gain two life points./n" +
                        "This only applies at the end of your turn, not during/n" +
                        "your re-rolls.", true, true);
                        }
                        if (character_rand == 15)
                        {
                        Character2 bot5 = new Character2 (0, 15, 9, 0,"VULTURE SAM (9)","Each time another player is eliminated, you gain/n" +
                        "two life points.", true, true);
                        }
                        if (character_rand == 16)
                        {
                        Character2 bot5 = new Character2 (0, 16, 8, 0,"WILLY THE KID (8)","You only need two Gatling to use the Gatling Gun./n" +
                        "You can activate the Gatling Gun only once per turn,/n" +
                        "even if you roll more than two Gatling results.", true, true);
                        }
                        bot5_choice = character_rand;
            
                        }
                        int character_rand = rand.nextInt (character_ub_rand) + 1;
                        while (character_rand >= userchoice || character_rand == bot7_choice || character_rand == bot6_choice || character_rand == bot5_choice)
                            {
                                character_rand = character_rand + 1;
                                if (character_rand == 16 && (character_rand == userchoice || character_rand == bot7_choice || character_rand == bot6_choice || character_rand == bot5_choice))
                                {
                                    character_rand = 1;
                                }
                            }
                        if (character_rand == 1)
                        {
                        Character2 bot4 = new Character2 (0, 1, 8, 0,"BART CASSIDY (8)","You may take an arrow instead of losing a life/n" +
                        "point (except to Indians or Dynamite)./n" +
                        "You cannot use this ability if you lose a life point/n" +
                        "to Indian or Dynamite, only for Bull’s Eye “1”,Bull’s Eye “2”, or Gatling/n" +
                        "Guns. You may not use this ability to take the last/n" +
                        "arrow remaining in the pile.", true, true);
                        }
                        if (character_rand == 2)
                        {
                        Character2 bot4 = new Character2 (0, 2, 8, 0,"BLACK JACK (8)","You may re-roll Dynamite (not if you roll three or more!)./n" +
                        " If you roll three or more Dynamite at once (or in/n" +
                        "total if you didn’t re-roll them), follow the usual/n" +
                        "rules (your turn ends, etc.)", true, true);
                        }
                        if (character_rand == 3)
                        {
                        Character2 bot4 = new Character2 (0, 3, 8, 0,"CALAMITY JANET (8)","You can use Bull’s Eye “1” as Bull’s Eye “2” and vice-versa.", true, true);
                        }
                        if (character_rand == 4)
                        {
                        Character2 bot4 = new Character2 (0, 4, 7, 0,"EL GRINGO (7)","When a player makes you lose one or more life/n" +
                        "points, he must take an arrow./n" +
                        "Life points lost to Indians or Dynamite are not affected.", true, true);
                        }
                        if (character_rand == 5)
                        {
                        Character2 bot4 = new Character2 (0, 5, 9, 0,"JESSE JONES (9)","If you have four life points or less, you gain two if you/n" +
                        "use Beer for yourself./n" +
                        "For example, if you have four life points and use/n" +
                        "two beers, you get four life points.", true, true);
                        }
                        if (character_rand == 6)
                        {
                        Character2 bot4 = new Character2 (0, 6, 7, 0,"JOURDONNAIS (7)","You never lose more than one life point to Indians.", true, true);
                        }
                        if (character_rand == 7)
                        {
                        Character2 bot4 = new Character2 (0, 7, 7, 0,"KIT CARLSON (7)","For each Gatling you may discard one arrow from/n" +
                        "any player./n" +
                        "You may choose to discard your own arrows. If you/n" +
                         "roll three Gatling, you discard all your own arrows,/n" +
                        "plus three from any player(s) (of course, you still/n" +
                        "deal one damage to each other player).", true, true);
                         }
                        if (character_rand == 8)
                        {
                        Character2 bot4 = new Character2 (0, 8, 8, 0,"LUCKY DUKE (8)","You may make one extra re-roll./n" +
                        "You may roll the dice a total of four times on your turn.", true, true);
                        }
                        if (character_rand == 9)
                        {
                        Character2 bot4 = new Character2 (0, 9, 9, 0,"PAUL REGRET (9)","You never lose life points to the Gatling Gun.", true, true);
                        }
                        if (character_rand == 10)
                        {
                        Character2 bot4 = new Character2 (0, 10, 8, 0,"PEDRO RAMIREZ (8)","Each time you lose a life point, you may discard/n" +
                        "one of your arrows./n" +
                        "You still lose the life point when you use this ability", true, true);
                        }
                        if (character_rand == 11)
                        {
                        Character2 bot4 = new Character2 (0, 11, 9, 0,"ROSE DOOLAN (9)","You may use Bull’s Eye “1” or Bull’s Eye “2” for players sitting one place/n" +
                        "further./n" +
                        "With Bull’s Eye “1” you may hit a player sitting up to two/n" +
                        "places away, and with Bull’s Eye “2” you may hit a player/n" +
                        "sitting two or three places away", true, true);
                        }
                        if (character_rand == 12)
                        {
                        Character2 bot4 = new Character2 (0, 12, 8, 0,"SID KETCHUM (8)","At the beginning of your turn, any player of your/n" +
                        "choice gains one life point./n" +
                        "You may also choose yourself.", true, true);
                         }
                        if (character_rand == 13)
                        {
                        Character2 bot4 = new Character2 (0, 13, 8, 0,"SLAB THE KILLER (8)","Once per turn, you can use a Beer to double a Bull’s Eye “1” or Bull’s Eye “2” ./n" +
                        "The dice you double takes two life points away from/n" +
                        "the same player (you can’t choose two different/n" +
                        "players). The Beer in this case does not provide any/n" +
                        "life points.", true, true);
                        }
                        if (character_rand == 14)
                        {
                        Character2 bot4 = new Character2 (0, 14, 8, 0,"SUZY LAFAYETTE (8)","If you didn’t roll any Bull’s Eye “1” or Bull’s Eye “2” , you gain two life points./n" +
                        "This only applies at the end of your turn, not during/n" +
                        "your re-rolls.", true, true);
                        }
                        if (character_rand == 15)
                        {
                        Character2 bot4 = new Character2 (0, 15, 9, 0,"VULTURE SAM (9)","Each time another player is eliminated, you gain/n" +
                        "two life points.", true, true);
                        }
                        if (character_rand == 16)
                        {
                        Character2 bot4 = new Character2 (0, 16, 8, 0,"WILLY THE KID (8)","You only need two Gatling to use the Gatling Gun./n" +
                        "You can activate the Gatling Gun only once per turn,/n" +
                        "even if you roll more than two Gatling results.", true, true);
                        }
                        bot4_choice = character_rand;
            
                    }
                    int character_rand = rand.nextInt (character_ub_rand) + 1;
                        while (character_rand >= userchoice || character_rand == bot7_choice || character_rand == bot6_choice || character_rand == bot5_choice || character_rand == bot4_choice)
                        {
                        character_rand = character_rand + 1;
                        if (character_rand == 16 && (character_rand == userchoice || character_rand == bot7_choice || character_rand == bot6_choice || character_rand == bot5_choice || character_rand == bot4_choice))
                            {
                                character_rand = 1;
                            }
                        }
                    if (character_rand == 1)
                    {
                    Character2 bot3= new Character2 (0, 1, 8, 0,"BART CASSIDY (8)","You may take an arrow instead of losing a life/n" +
                    "point (except to Indians or Dynamite)./n" +
                    "You cannot use this ability if you lose a life point/n" +
                    "to Indian or Dynamite, only for Bull’s Eye “1”,Bull’s Eye “2”, or Gatling/n" +
                    "Guns. You may not use this ability to take the last/n" +
                    "arrow remaining in the pile.", true, true);
                    }
                    if (character_rand == 2)
                    {
                    Character2 bot3 = new Character2 (0, 2, 8, 0,"BLACK JACK (8)","You may re-roll Dynamite (not if you roll three or more!)./n" +
                    " If you roll three or more Dynamite at once (or in/n" +
                    "total if you didn’t re-roll them), follow the usual/n" +
                    "rules (your turn ends, etc.)", true, true);
                    }
                    if (character_rand == 3)
                    {
                    Character2 bot3 = new Character2 (0, 3, 8, 0,"CALAMITY JANET (8)","You can use Bull’s Eye “1” as Bull’s Eye “2” and vice-versa.", true, true);
                    }
                    if (character_rand == 4)
                    {
                    Character2 bot3 = new Character2 (0, 4, 7, 0,"EL GRINGO (7)","When a player makes you lose one or more life/n" +
                    "points, he must take an arrow./n" +
                    "Life points lost to Indians or Dynamite are not affected.", true, true);
                    }
                    if (character_rand == 5)
                    {
                    Character2 bot3 = new Character2 (0, 5, 9, 0,"JESSE JONES (9)","If you have four life points or less, you gain two if you/n" +
                    "use Beer for yourself./n" +
                    "For example, if you have four life points and use/n" +
                    "two beers, you get four life points.", true, true);
                    }
                    if (character_rand == 6)
                    {
                    Character2 bot3 = new Character2 (0, 6, 7, 0,"JOURDONNAIS (7)","You never lose more than one life point to Indians.", true, true);
                    }
                    if (character_rand == 7)
                    {
                    Character2 bot3 = new Character2 (0, 7, 7, 0,"KIT CARLSON (7)","For each Gatling you may discard one arrow from/n" +
                    "any player./n" +
                    "You may choose to discard your own arrows. If you/n" +
                    "roll three Gatling, you discard all your own arrows,/n" +
                    "plus three from any player(s) (of course, you still/n" +
                    "deal one damage to each other player).", true, true);
                    }
                    if (character_rand == 8)
                    {
                    Character2 bot3 = new Character2 (0, 8, 8, 0,"LUCKY DUKE (8)","You may make one extra re-roll./n" +
                    "You may roll the dice a total of four times on your turn.", true, true);
                    }
                    if (character_rand == 9)
                    {
                    Character2 bot3 = new Character2 (0, 9, 9, 0,"PAUL REGRET (9)","You never lose life points to the Gatling Gun.", true, true);
                    }
                    if (character_rand == 10)
                    {
                    Character2 bot3 = new Character2 (0, 10, 8, 0,"PEDRO RAMIREZ (8)","Each time you lose a life point, you may discard/n" +
                    "one of your arrows./n" +
                    "You still lose the life point when you use this ability", true, true);
                    }
                    if (character_rand == 11)
                    {
                    Character2 bot3 = new Character2 (0, 11, 9, 0,"ROSE DOOLAN (9)","You may use Bull’s Eye “1” or Bull’s Eye “2” for players sitting one place/n" +
                    "further./n" +
                    "With Bull’s Eye “1” you may hit a player sitting up to two/n" +
                    "places away, and with Bull’s Eye “2” you may hit a player/n" +
                    "sitting two or three places away", true, true);
                    }
                    if (character_rand == 12)
                    {
                    Character2 bot3 = new Character2 (0, 12, 8, 0,"SID KETCHUM (8)","At the beginning of your turn, any player of your/n" +
                    "choice gains one life point./n" +
                    "You may also choose yourself.", true, true);
                    }
                    if (character_rand == 13)
                    {
                    Character2 bot3 = new Character2 (0, 13, 8, 0,"SLAB THE KILLER (8)","Once per turn, you can use a Beer to double a Bull’s Eye “1” or Bull’s Eye “2” ./n" +
                    "The dice you double takes two life points away from/n" +
                    "the same player (you can’t choose two different/n" +
                    "players). The Beer in this case does not provide any/n" +
                    "life points.", true, true);
                    }
                    if (character_rand == 14)
                    {
                    Character2 bot3 = new Character2 (0, 14, 8, 0,"SUZY LAFAYETTE (8)","If you didn’t roll any Bull’s Eye “1” or Bull’s Eye “2” , you gain two life points./n" +
                    "This only applies at the end of your turn, not during/n" +
                    "your re-rolls.", true, true);
                    }
                    if (character_rand == 15)
                    {
                    Character2 bot3 = new Character2 (0, 15, 9, 0,"VULTURE SAM (9)","Each time another player is eliminated, you gain/n" +
                    "two life points.", true, true);
                    }
                    if (character_rand == 16)
                    {
                    Character2 bot3 = new Character2 (0, 16, 8, 0,"WILLY THE KID (8)","You only need two Gatling to use the Gatling Gun./n" +
                    "You can activate the Gatling Gun only once per turn,/n" +
                    "even if you roll more than two Gatling results.", true, true);
                    }
                    bot3_choice = character_rand;
                }
                int character_rand = rand.nextInt (character_ub_rand) + 1;
                while (character_rand == userchoice || character_rand == bot7_choice || character_rand == bot6_choice || character_rand == bot5_choice || character_rand == bot4_choice || character_rand == bot3_choice)
                    {
                        character_rand = character_rand + 1;
                        if (character_rand >= 16 && (character_rand == userchoice || character_rand == bot7_choice || character_rand == bot6_choice || character_rand == bot5_choice || character_rand == bot4_choice || character_rand == bot3_choice))
                        {
                            character_rand = 1;
                        }
                    }
                if (character_rand == 1)
                {
                Character2 bot2= new Character2 (0, 1, 8, 0,"BART CASSIDY (8)","You may take an arrow instead of losing a life/n" +
                "point (except to Indians or Dynamite)./n" +
                "You cannot use this ability if you lose a life point/n" +
                "to Indian or Dynamite, only for Bull’s Eye “1”,Bull’s Eye “2”, or Gatling/n" +
                "Guns. You may not use this ability to take the last/n" +
                "arrow remaining in the pile.", true, true);
                }
                if (character_rand == 2)
                {
                Character2 bot2 = new Character2 (0, 2, 8, 0,"BLACK JACK (8)","You may re-roll Dynamite (not if you roll three or more!)./n" +
                " If you roll three or more Dynamite at once (or in/n" +
                "total if you didn’t re-roll them), follow the usual/n" +
                "rules (your turn ends, etc.)", true, true);
                }
                if (character_rand == 3)
                {
                Character2 bot2 = new Character2 (0, 3, 8, 0,"CALAMITY JANET (8)","You can use Bull’s Eye “1” as Bull’s Eye “2” and vice-versa.", true, true);
                }
                if (character_rand == 4)
                {
                Character2 bot2 = new Character2 (0, 4, 7, 0,"EL GRINGO (7)","When a player makes you lose one or more life/n" +
                "points, he must take an arrow./n" +
                "Life points lost to Indians or Dynamite are not affected.", true, true);
                }
                if (character_rand == 5)
                {
                Character2 bot2 = new Character2 (0, 5, 9, 0,"JESSE JONES (9)","If you have four life points or less, you gain two if you/n" +
                "use Beer for yourself./n" +
                "For example, if you have four life points and use/n" +
                "two beers, you get four life points.", true, true);
                }
                if (character_rand == 6)
                {
                Character2 bot2 = new Character2 (0, 6, 7, 0,"JOURDONNAIS (7)","You never lose more than one life point to Indians.", true, true);
                }
                if (character_rand == 7)
                {
                Character2 bot2 = new Character2 (0, 7, 7, 0,"KIT CARLSON (7)","For each Gatling you may discard one arrow from/n" +
                "any player./n" +
                "You may choose to discard your own arrows. If you/n" +
                "roll three Gatling, you discard all your own arrows,/n" +
                "plus three from any player(s) (of course, you still/n" +
                "deal one damage to each other player).", true, true);
                }
                if (character_rand == 8)
                {
                Character2 bot2 = new Character2 (0, 8, 8, 0,"LUCKY DUKE (8)","You may make one extra re-roll./n" +
                "You may roll the dice a total of four times on your turn.", true, true);
                }
                if (character_rand == 9)
                {
                Character2 bot2 = new Character2 (0, 9, 9, 0,"PAUL REGRET (9)","You never lose life points to the Gatling Gun.", true, true);
                }
                if (character_rand == 10)
                {
                Character2 bot2 = new Character2 (0, 10, 8, 0,"PEDRO RAMIREZ (8)","Each time you lose a life point, you may discard/n" +
                "one of your arrows./n" +
                "You still lose the life point when you use this ability", true, true);
                }
                if (character_rand == 11)
                {
                Character2 bot2 = new Character2 (0, 11, 9, 0,"ROSE DOOLAN (9)","You may use Bull’s Eye “1” or Bull’s Eye “2” for players sitting one place/n" +
                "further./n" +
                "With Bull’s Eye “1” you may hit a player sitting up to two/n" +
                "places away, and with Bull’s Eye “2” you may hit a player/n" +
                "sitting two or three places away", true, true);
                }
                if (character_rand == 12)
                {
                Character2 bot2 = new Character2 (0, 12, 8, 0,"SID KETCHUM (8)","At the beginning of your turn, any player of your/n" +
                "choice gains one life point./n" +
                "You may also choose yourself.", true, true);
                }
                if (character_rand == 13)
                {
                Character2 bot2 = new Character2 (0, 13, 8, 0,"SLAB THE KILLER (8)","Once per turn, you can use a Beer to double a Bull’s Eye “1” or Bull’s Eye “2” ./n" +
                "The dice you double takes two life points away from/n" +
                "the same player (you can’t choose two different/n" +
                "players). The Beer in this case does not provide any/n" +
                "life points.", true, true);
                }
                if (character_rand == 14)
                {
                Character2 bot2 = new Character2 (0, 14, 8, 0,"SUZY LAFAYETTE (8)","If you didn’t roll any Bull’s Eye “1” or Bull’s Eye “2” , you gain two life points./n" +
                "This only applies at the end of your turn, not during/n" +
                "your re-rolls.", true, true);
                }
                if (character_rand == 15)
                {
                Character2 bot2 = new Character2 (0, 15, 9, 0,"VULTURE SAM (9)","Each time another player is eliminated, you gain/n" +
                "two life points.", true, true);
                }
                if (character_rand == 16)
                {
                Character2 bot2 = new Character2 (0, 16, 8, 0,"WILLY THE KID (8)","You only need two Gatling to use the Gatling Gun./n" +
                "You can activate the Gatling Gun only once per turn,/n" +
                "even if you roll more than two Gatling results.", true, true);
                }
                bot2_choice = character_rand;
                
            }
            int character_rand = rand.nextInt (character_ub_rand) + 1;
        while (character_rand == userchoice || character_rand == bot7_choice || character_rand == bot6_choice || character_rand == bot5_choice || character_rand == bot4_choice || character_rand == bot3_choice || character_rand == bot2_choice)
        {
                                    character_rand = character_rand + 1;
            if (character_rand >= 16 && (character_rand == userchoice || character_rand == bot7_choice || character_rand == bot6_choice || character_rand == bot5_choice || character_rand == bot4_choice || character_rand == bot3_choice || character_rand == bot2_choice))
            {
                character_rand = 1;
            }
        }
        if (character_rand == 1)
        {
        Character2 bot1 = new Character2 (0, 1, 8, 0,"BART CASSIDY (8)","You may take an arrow instead of losing a life/n" +
        "point (except to Indians or Dynamite)./n" +
        "You cannot use this ability if you lose a life point/n" +
        "to Indian or Dynamite, only for Bull’s Eye “1”,Bull’s Eye “2”, or Gatling/n" +
        "Guns. You may not use this ability to take the last/n" +
        "arrow remaining in the pile.", true, true);
        }
        if (character_rand == 2)
        {
        Character2 bot1 = new Character2 (0, 2, 8, 0,"BLACK JACK (8)","You may re-roll Dynamite (not if you roll three or more!)./n" +
        " If you roll three or more Dynamite at once (or in/n" +
        "total if you didn’t re-roll them), follow the usual/n" +
        "rules (your turn ends, etc.)", true, true);
        }
        if (character_rand == 3)
        {
        Character2 bot1 = new Character2 (0, 3, 8, 0,"CALAMITY JANET (8)","You can use Bull’s Eye “1” as Bull’s Eye “2” and vice-versa.", true, true);
        }
        if (character_rand == 4)
        {
        Character2 bot1 = new Character2 (0, 4, 7, 0,"EL GRINGO (7)","When a player makes you lose one or more life/n" +
        "points, he must take an arrow./n" +
        "Life points lost to Indians or Dynamite are not affected.", true, true);
        }
        if (character_rand == 5)
        {
        Character2 bot1 = new Character2 (0, 5, 9, 0,"JESSE JONES (9)","If you have four life points or less, you gain two if you/n" +
        "use Beer for yourself./n" +
        "For example, if you have four life points and use/n" +
        "two beers, you get four life points.", true, true);
        }
        if (character_rand == 6)
        {
        Character2 bot1 = new Character2 (0, 6, 7, 0,"JOURDONNAIS (7)","You never lose more than one life point to Indians.", true, true);
        }
        if (character_rand == 7)
        {
        Character2 bot1 = new Character2 (0, 7, 7, 0,"KIT CARLSON (7)","For each Gatling you may discard one arrow from/n" +
        "any player./n" +
        "You may choose to discard your own arrows. If you/n" +
        "roll three Gatling, you discard all your own arrows,/n" +
        "plus three from any player(s) (of course, you still/n" +
        "deal one damage to each other player).", true, true);
        }
        if (character_rand == 8)
        {
        Character2 bot1 = new Character2 (0, 8, 8, 0,"LUCKY DUKE (8)","You may make one extra re-roll./n" +
        "You may roll the dice a total of four times on your turn.", true, true);
        }
        if (character_rand == 9)
        {
        Character2 bot21 = new Character2 (0, 9, 9, 0,"PAUL REGRET (9)","You never lose life points to the Gatling Gun.", true, true);
        }
        if (character_rand == 10)
        {
        Character2 bot1 = new Character2 (0, 10, 8, 0,"PEDRO RAMIREZ (8)","Each time you lose a life point, you may discard/n" +
        "one of your arrows./n" +
        "You still lose the life point when you use this ability", true, true);
        }
        if (character_rand == 11)
        {
        Character2 bot1 = new Character2 (0, 11, 9, 0,"ROSE DOOLAN (9)","You may use Bull’s Eye “1” or Bull’s Eye “2” for players sitting one place/n" +
        "further./n" +
        "With Bull’s Eye “1” you may hit a player sitting up to two/n" +
        "places away, and with Bull’s Eye “2” you may hit a player/n" +
        "sitting two or three places away", true, true);
        }
        if (character_rand == 12)
        {
        Character2 bot1 = new Character2 (0, 12, 8, 0,"SID KETCHUM (8)","At the beginning of your turn, any player of your/n" +
        "choice gains one life point./n" +
        "You may also choose yourself.", true, true);
        }
        if (character_rand == 13)
        {
        Character2 bot1 = new Character2 (0, 13, 8, 0,"SLAB THE KILLER (8)","Once per turn, you can use a Beer to double a Bull’s Eye “1” or Bull’s Eye “2” ./n" +
        "The dice you double takes two life points away from/n" +
        "the same player (you can’t choose two different/n" +
        "players). The Beer in this case does not provide any/n" +
        "life points.", true, true);
        }
        if (character_rand == 14)
        {
        Character2 bot1 = new Character2 (0, 14, 8, 0,"SUZY LAFAYETTE (8)","If you didn’t roll any Bull’s Eye “1” or Bull’s Eye “2” , you gain two life points./n" +
        "This only applies at the end of your turn, not during/n" +
        "your re-rolls.", true, true);
        }
        if (character_rand == 15)
        {
        Character2 bot1 = new Character2 (0, 15, 9, 0,"VULTURE SAM (9)","Each time another player is eliminated, you gain/n" +
        "two life points.", true, true);
        }
        if (character_rand == 16)
        {
        Character2 bot1 = new Character2 (0, 16, 8, 0,"WILLY THE KID (8)","You only need two Gatling to use the Gatling Gun./n" +
        "You can activate the Gatling Gun only once per turn,/n" +
        "even if you roll more than two Gatling results.", true, true);
        }
        bot1_choice = character_rand;
            
        }
        
        
        
    }
    public static void main()
}
