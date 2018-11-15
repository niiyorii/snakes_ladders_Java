/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SnakesAndLadders;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author K00232267 - Neal B
 * @contributor K00231156 - Caolan G
 */
public class GridMap {
    
        int grid[][];
     
       
        //Accessor Methods for class GridMap.
    public int[][] getGrid() {
        return grid;
    }

    private class Node {
        private String squareType;
        private int squareNumber;

        //Default Constructor for class Node.
        public Node() {
            squareType = "Plain";
            squareNumber = 0;
        }

        //Parameterised Constructor for class Node.
        public Node(String squareType, int squareNumber) {
            this.squareType = squareType;
            this.squareNumber = squareNumber;
        }

        //Accessor Methods for class Node.
        public String getSquareType() {
            return squareType;
        }

        public int getSquareNumber() {
            return squareNumber;
        }

        //Mutator Methods for class Node.
        public void setSquareType(String squareType) {
            this.squareType = squareType;
        }

        public void setSquareNumber(int squareNumber) {
            this.squareNumber = squareNumber;
        }
    }
    //Roll Dice Method refactored due to repetitive use
    public static int getDieRoll(){
      int dieCount = 6; //for variety die approach
        Random r = new Random();
        int dieResult = r.nextInt(dieCount)+1;
        return dieResult;  
    }
   
    public static void main (String [] args){ 
        int size = 10;
        //example code
        //player position
        int player = 50;
        int loc = 100;
        int count = 0;
        //int x,y;
        //int rowCounter;
        // Declaring a Hashmap, Goal and placing map objects....
        final int GOAL = 100;

        // 2 layered hashmaps for snakes and ladders (refactored as Map for .Entry
       
        Map < Integer , Integer > snake = new HashMap <>();
         Map < Integer , Integer > ladder = new HashMap<>();
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
        //for each Y
        for (int i = 0; i < size; i++){
            //System.out.println();
            // if Y is divisible by 2
            if (i % 2 == 0){
                count = 0;
                for (int j = loc; count < 10; j--){
                   System.out.print("\t " + j);
                   loc--;
                   count++;
                }
            }
            else
             count = 0;
            for (int j = loc-9; count < 10 ; ++j){

                   System.out.print("\t " + j);
                    loc--;
                    count++;
             }
            System.out.println("\n");
         }
        //Roll a dice
        int roll= getDieRoll();
        System.out.println("Player 1's Square (roll): " + player);
        System.out.println("Rolling Dice..");
        System.out.println("Rolled a " +roll);
        //if this rolls a 2.. it's guaranteed to drop to the base of the snake 
        // after moving forward 2 and then landing the head of the snake
        player += roll;
        if(null!=snake.get(player))
        {
            System.out.println("swallowed by snake");
            player= snake.get(player);
            System.out.println("Player 1's Square (snake): " + player);
        }

        if(null!=ladder.get(player))
        {
            System.out.println("climb up the ladder");
            player= ladder.get(player);
            System.out.println("Player 1's Square (ladder): " + player);
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