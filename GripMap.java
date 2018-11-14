/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SnakesAndLadders;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author K00232267 - Neal B
 * @contributor K00231156 -Caolan G
 */
public class GripMap {
    
        int grid[][];
        // Declaring a Hashmap..
      HashMap<Integer, Integer> snakeMap = new HashMap<>();
      //HashMap<Integer, Integer> ladderMap = new HashMap<>();
     
       
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
     ////////////////////////main loop///////////////////////
    public static void main (String [] args){
        int size = 10;
        //Front end Grid Display.
        int loc = 100;
        int count = 0;
        //int x,y;
        //int rowCounter;
        // Declaring a Hashmap..
        HashMap<Integer, Integer> snakeMap = new HashMap<>();
         //HashMap<Integer, Integer> ladderMap = new HashMap<>();
  
        //Adding elements to HashMap
        snakeMap.put(99,75);
        snakeMap.put(14,8);
        snakeMap.put(35, 24);
        snakeMap.put(66, 44);
        snakeMap.put(86, 45);

        // Display content using Iterator
        Set set = snakeMap.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()) {
           Map.Entry mentry = (Map.Entry)it.next();
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
            System.out.print("Top of snake is : "+mentry2.getKey() + " Bottom of Snake is : "+mentry2.getValue()+"\n");
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




        }
    }
}
