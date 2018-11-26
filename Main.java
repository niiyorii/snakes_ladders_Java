/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SnakesAndLadders;

import java.util.Random;

/**
 *
 * @author K00232267 - Neal B
 * @contributor K00231156 - Caolan G
 */

public class Main {
    
    //Example Usage
    // Default Capacity for snakes and ladders is 16^n
    static GameBoard board = new GameBoard();
    
 
     //Roll Dice Method
    public static int getDieRoll(){
        int dieCount = 6; //for variety die approach
        Random r = new Random();
        int dieResult = r.nextInt(dieCount)+1;
        return dieResult;
    }
    
    //// Game loop /////
    public static void main (String [] args){
        
        // Simple solution first..
        //Track player position (Can be stored later in Player Object)
        // as in Player.pos where .pos is an integer 
        //and getPlayerPosition can be used to fetch p1, p2 and p3 positions independently
        int player = 1;
        //int x,y; [no need]
        //int rowCounter; [no need]
        // Declaring a Hashmap, Goal and placing map objects.... [ done ]
        final int GOAL = 100;  // specify a final value to check if the player is greater than or less

        // 2 layered gridmaps for snakes and ladders (re-implemented for Map and Map.Entry)
       
    GameBoard < Integer , Integer > snake = new GameBoard<>();
    GameBoard < Integer , Integer > ladder = new GameBoard<>();
    GameBoard < Integer , Integer > players = new GameBoard<>();
    //Refactored into board class
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
        // Display content using Iterator
        //omitted sample Map/Set example.. see previous commits
        while(player < 100){
        //Roll a dice
        int roll= getDieRoll();
        int lastRoll = roll;
        players.printGrid(roll, x);
        System.out.println("Player 1's Square (roll): " + player);
        System.out.println("Rolling Dice..");
        System.out.println("Rolled a " +roll);
        //if this rolls a 2.. it's guaranteed to drop to the base of the snake 
        // after moving forward 2 and then landing the head of the snake
        player += roll;
        if(null!=snake.get(player))
        {
            System.out.println("swallowed by snake");
            player= (int)snake.get(player);
            System.out.println("Player 1's Square (snake): " + player);
        }

        if(null!=ladder.get(player))
        {
            System.out.println("climb up the ladder");
            player= (int)ladder.get(player);
            System.out.println("Player 1's Square (ladder): " + player);
        }
        if (player > GOAL){
            player  = GOAL - lastRoll;
        }
        if (player == GOAL){
            System.out.println("Congrats.. player wins");
        }
    }
        
}

/**
 * TODO:
 * Populate Snakes properly... [x]
 * Populate Ladders... [x]
 * 
 * Re-evaluate grid formation ... open for comment
 * 
 * Movement rule, along a path of 10 left-left-only -right-right only..
 */
}
