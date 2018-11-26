/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SnakesAndLadders;

import java.util.Scanner;

/**
 *
 * @author K00232267 - Neal B
 */
public class test_Game {
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
                + "################");
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        switch(in){ 
            case 1: gameLogic();
                break;
            case 2: System.out.println("Exitting");
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
        Player p1,p2,p3,p4; // 1-4 players
        //Default Inits (Start at position 1)
        p1 =  new Player();
        p1.setPosition(1);
        p2 =  new Player();
        p2.setPosition(1);
        p3 =  new Player();
        p3.setPosition(1);
        p4 =  new Player();
        p4.setPosition(1);
        // For iteration
        Player[] playerList = {p1,p2,p3,p4};

      //Set up Player Names
        int numPlaying = 0;
        int count = 0;
        do{
            System.out.println("Enter the number of players playing. (1-4)");
            Scanner sc =  new Scanner(System.in);
            //count = sc.nextInt();
            numPlaying = sc.nextInt();
            if (numPlaying > 4 || numPlaying < 1){
                System.out.println("Not enough players");
            }
            else{
                count = numPlaying;
                System.out.println(count);
                    //For each player specified give a name.
                    //bug here - if < 0 enter name.
                
                for (Player p : playerList){
                    System.out.println(p.getPlayerName());
                    System.out.println("Enter player name");
                   
                        
                        String name = sc.nextLine();
                        p.setName(name);
                       
                    }
                }
            }while(numPlaying < 1 || numPlaying > 4);
        
    /* Take Turns rolling the highest dice */
    int player = 0; // track which player has highest.
    //int highest = 0;
    //int playerFirst =0;
    for (Player p : playerList)
    {
            player = p.getPosition();
            System.out.println("Press Space to Roll a Dice " + p.getPlayerName());
            //while(p.getPosition() < 100){
            //Roll a dice
            p.rollDice();
            int roll= p.getDieResult();
            int lastRoll = roll;
            //needs refactoring
            int y = p.getPosition() / 10;
            int x = p.getPosition() % 10;
            players.printGrid(x,y);

            System.out.println(p.getPlayerName() +" get Square (roll): " + player);
            System.out.println("Rolling Dice..");
            System.out.println(p.getPlayerName() +"Rolled a " +roll);
            //if this rolls a 2.. it's guaranteed to drop to the base of the snake 
            // after moving forward 2 and then landing the head of the snake
            player += roll;
            if(null!=snake.get(player))
            {
                System.out.println("swallowed by snake");
                player= (int)snake.get(player);
                System.out.println(p.getPlayerName() +" Square (snake): " + player);
            }

            if(null!=ladder.get(player))
            {
                System.out.println("climb up the ladder");
                player= (int)ladder.get(player);
                System.out.println(p.getPlayerName()+" Square (ladder): " + player);
            }
            if (player > GOAL){
                player  = GOAL - lastRoll;
            }
            if (player == GOAL){
                System.out.println("Congrats.. "+p.getPlayerName()+" wins");
            }
        }
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
