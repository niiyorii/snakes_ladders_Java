/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SnakesAndLadders;
import SnakesAndLadders.Player.*;
import java.util.Scanner;

/**
 *
 * @author K00232267 - Neal B
 */
public class test_Game {
        private static Player[] playerList;
        public static void main (String [] args){
            
        
        // Simple solution first..
        //Track player position (Can be stored later in Player Object)
        // as in Player.pos where .pos is an integer 
        //and getPlayerPosition can be used to fetch p1, p2 and p3 positions independently
            
        /* Set up Game Block      */
        
        
        //Create a Player List (Comparable to Player p for each Player)
        
        
        
        
        //int player = 1;
        //int x,y; [no need]
        //int rowCounter; [no need]
        // Declaring a Hashmap, Goal and placing map objects.... [ done ]
        
    
    /* Menu Loop - Start Game, Give Player Name, Quit. etc */ 
        System.out.println("################\n"
                + "Make a Choice\n"
                + "1. Play a Game\n"
                + "2. Quit.\n"
                + "################\n");
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        switch(in){ 
            case 1: gameLogic();
                break;
            case 2: System.out.println("Exiting");
                       System.exit(0);
                break;
            default: System.out.println("Unsupported input");
               break;
        }
    }
    /* Game Logic */
    public static void gameLogic(){
        //Define End Goal
        final int GOAL = 100;  // specify a final value to check if the player is greater than or less

        // 2 layered gridmaps for snakes and ladders (implemented as GameBoard ext. HashMap for Map and Map.Entry)
        GameBoard < Integer , Integer > players = new GameBoard<>();
        GameBoard < Integer , Integer > snake = new GameBoard<>();
        GameBoard < Integer , Integer > ladder = new GameBoard<>();
    
    {
        snake.put(99,54);
        snake.put(70,55);
        snake.put(52,42);
        snake.put(25,2);
        snake.put(95,72);

        ladder.put(6,25);
        ladder.put(11,40);
        ladder.put(60,85);
        ladder.put(46,90);
        ladder.put(17,69);
        }
        //Create Player Objects
        Player p;

      //Set up Player Names
        int numPlaying;
       
        do{
            System.out.println("Enter the number of players playing. (1-4)");
            Scanner sc =  new Scanner(System.in);
            //count = sc.nextInt();
            numPlaying = sc.nextInt();
            switch(numPlaying){
                case 1: System.out.println("Not enough Players");
                        //Debug
                     // Do something for case 1.
                    break;
                case 2: System.out.println("2 Players...");
                      

                    break;
                case 3: System.out.println("3 Players..");
                       

                    break;
                case 4: System.out.println("4 Players..");
                       

                    break;
                default: System.out.println("invalid input");
                    break;
                
            }
        }while(numPlaying < 1 && numPlaying >= 4);
        
       Scanner sc = new Scanner(System.in);
       int count = numPlaying;
       playerList = initialisePlayers(numPlaying);
      // p.playerList
        //System.out.println(count);
            //For each player specified give a name.
        String name = "";
        for (int i = 0; i < numPlaying; i++){
            System.out.print("Enter a Player Name...");
            name = sc.nextLine();

            //playerList[i].setId(i+1);
            playerList[i].setId(i+1);
            //playerList[i].setName(name);
            playerList[i].setName(name);
            System.out.println(playerList[i].getName() + " " + playerList[i].getId() );
        }

       
        
    /* Take Turns rolling the highest dice */
    //Player p; // short code for playerList[i]
        
    int player = 0; // denotes a player's roll
    //int highest = 0;
    //int playerFirst =0;
    int turn = 0;
    while(player != 100) {
        for (int i = 0; i < numPlaying; i++){
            
            System.out.println("\ni :" + i);
            System.out.println(" Length : "+ player);
            System.out.println("List i name: "+ playerList[i].getName());
            System.out.println("List id: "+ playerList[i].getId());
            //System.out.println("\ni :" + i);
            //System.out.println("List Length : "+playerList.length);
            System.out.println("List i name: "+ playerList[i].getName());
            System.out.println("List id: "+ playerList[i].getId()); 
            //System.out.println("\ni :" + i);
            //System.out.println("List Length : "+playerList.length);
            System.out.println("List i name: "+ playerList[i].getName());
            System.out.println("List id: "+ playerList[i].getId()); 
                   
                //p = playerList[i];
                //System.out.println(playerList[i].getId());

                Scanner in = new Scanner(System.in);
                String keypress = " ";
                //System.out.print(keypress);
                //keypress = in.nextLine();
                System.out.println("Press Enter to Roll a Dice " + playerList[i].getName());
                System.out.print(keypress);
                keypress = in.nextLine();
                //while(p.getPosition() < 100){
                //Roll a dice
                playerList[i].rollDice();
                int roll= playerList[i].getDieResult();
                int lastRoll = roll;
                playerList[i].setPosition(roll);
                //needs refactoring
                int y = playerList[i].getPosition() / 10;
                int x = playerList[i].getPosition() % 10;
                players.printGrid(x,y);

                System.out.println(playerList[i].getName() +" is on Square: " + player);
                System.out.println("Rolling Dice..");
                System.out.println(playerList[i].getName() +" Rolled a " +lastRoll);
                //if this rolls a 2.. it's guaranteed to drop to the base of the snake 
                // after moving forward 2 and then landing the head of the snake
                player += lastRoll;
                if(null!=snake.get(player))
                {
                    System.out.println("swallowed by snake");
                    player= (int)snake.get(player);
                    System.out.println(playerList[i].getName() +" Square (snake): " + player);
                }

                if(null!=ladder.get(player))
                {
                    System.out.println("climb up the ladder");
                    player= (int)ladder.get(player);
                    System.out.println(playerList[i].getName()+" Square (ladder): " + player);
                }
                if (player > GOAL){
                    player  = GOAL - lastRoll;
                }
                if (player == GOAL){
                    System.out.println("Congrats.. "+playerList[i].getName()+" wins");
                }
                turn++;
               if (turn % 2 == 0){
                   i++;
               }
               //turn taking..
               //broken
               else if(turn % playerList.length == 1){
                   i=0;
               }

            }
        } 
    }
     /* Fields */ 
    public static Player[] initialisePlayers (int numberOfPlayers){
        Player[] newPlayers = new Player[numberOfPlayers];
        for (int i = 0; i < newPlayers.length; ++i ){
            newPlayers[i] = new Player();
            newPlayers[i].setPosition(i);
            //listedPlayers[i].setId(i);
            
        }
        
         return newPlayers;//static reference
        //return newPlayers; //non static return
    }
    public Player getPlayer (int player){
        
        return playerList[player];
    }
}
/**
 * Dev Notes
 * 
 * 
 * 
 * 
 * 
 * 
 */
