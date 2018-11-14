/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SnakesAndLadders;

/**
 *
 * @author K00232267 - Neal B
 */
public class NearestNeighbor {
    
    
    public static void main (String [] args){
        
        int height = 10;
        int width = 10;
        int array[][] =  new int[height+1][width+1];
        for (int a = 1; a < array.length-1; a++){
                    System.out.print(" "+a+" ");
                }
        for (int i = 1; i <= array.length-1; i++)
        {
            for(int j = 1;  j <= array.length-1; j++)
            {
            
                System.out.print(" O ");   
            }
           
              System.out.println();
        } 
    }
}
