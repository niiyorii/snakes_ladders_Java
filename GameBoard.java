/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SnakesAndLadders;


import java.util.HashMap;



/**
 *
 * @author K00232267 - Neal B
 * @contributor K00231156 - Caolan G
 *
 * Implementing Hashmap as a GameBoard class object with additional
 * methods for  Snakes and Ladders
 * 
 * param notes:
 * @param <K> the type of keys maintained by this map
 * @param <V> the type of mapped values
 */

 public class GameBoard<K,V> extends HashMap{
 
    
    // Called If Player hits a Snake GridMap square Node and moves player N to new grid Square
    public void slideDownSnake(){
       throw new IllegalArgumentException("Not Yet Supported");
    }
    // Called If Player hits a Ladder GridMap square Node and moves player N to new grid Square
    public void climbUpLadder(){
        throw new IllegalArgumentException("Not Yet Supported");
    }
    // R
    public void findPlayerPosition(){
       throw new IllegalArgumentException("Not Yet Supported");
    }
    //Prints the Game Board in the order of Snakes and Ladders   
    public void printGrid( int x, int y){
        int size = 10;
        int count=0;
        int loc = 100; //variable for alternating rows
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
                 //x =i i = 1
                  //y = j j = 100
                    if (i == y && j == x){
                        System.out.print("o");
                        System.out.println("x:"+x);
                        System.out.println("y:"+y);
                    }     
                }
            }
            else
                count = 0;
                for (int j = loc-9; count < 10 ; ++j){
                   System.out.print("\t " + j);
                   loc--;
                   count++;
                   if (i == y && count == x){
                        System.out.print("o");
                        System.out.println(x);
                        System.out.println(y);
                    } 
                }  
            System.out.println("\n");
        }
    }
 }