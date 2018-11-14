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
 * @contributor K00231156 -Caolan G
 */
public class GripMap {
    
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
    //Roll Dice Method
    public static int getDieRoll(){
        int dieCount = 6; //for variety die approach
        Random r = new Random();
        int dieResult = r.nextInt(dieCount)+1;
        return dieResult;
    }
     ////////////////////////main loop///////////////////////
    public static void main (String [] args){
        int size = 10;
        //example code
        int player = 31;
        //Front end Grid Display.
        int loc = 100;
        int count = 0;
        //int x,y;
        //int rowCounter;
        // Declaring a Hashmap..
        HashMap<Integer, Integer> snakeMap = new HashMap<>();
         //HashMap<Integer, Integer> ladderMap = new HashMap<>();
  
        //Adding elements to HashMap
        snakeMap.put(75,99);
        snakeMap.put(8,14);
        snakeMap.put(24,35);
        snakeMap.put(44,66);
        snakeMap.put(45,86);

        // Display content using Iterator
        Set set = snakeMap.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()) {
           Map.Entry mentry = (Map.Entry)it.next();
           //This is fine..
           System.out.print("key is: "+ mentry.getKey() + " & Value is: "+mentry.getValue() +"\n");

        }

        //get key/value pair
        int pos= snakeMap.get(99);
        System.out.println("There's a snake at grid index 99 it's base is : "+pos);


        snakeMap.remove(14);
        //Check set again after removal
        System.out.println("Removed key 14:");
        Set s2 = snakeMap.entrySet();
        Iterator it2 = s2.iterator();
        while(it2.hasNext()) {
            Map.Entry mentry2 = (Map.Entry)it2.next();
            //the Key and Pairs are reversed for snake and base.. needed to reverse the put figures on line 85-89
            System.out.print("Top of snake is : "+mentry2.getValue() + " Bottom of Snake is : "+mentry2.getKey()+"\n");
         }

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
            //Roll a dice
            player += getDieRoll();
            //if the player lands on a snake... 
            if (snakeMap.containsValue(player)){
                
                /// player goes to the base of the snake
                System.out.println("Player landed on a snake");
                //move the player
                player = snakeMap.get(player);
                System.out.println("Player is now on "+ player);
            }

        }
    }
}

/**
 * TODO:
 * Populate Snakes properly...
 * Populate Ladders...
 * 
 * Re-evaluate grid formation
 * 
 * Movement rule, along a path of 10 left-left-only -right-right only..
 */