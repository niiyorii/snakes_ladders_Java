/*
 * Copyright (C) 2018 K00232267 - Neal B
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package SnakesAndLadders.test;

import java.util.Random;

/**
 *
 * @author K00231156 - Caolan G
 */

public class Dice {
    int faces;
    int numOfDie;

    //Default Constructor
    public Dice(){
        faces = 6;
        numOfDie = 1;
    }

    //Parameterised Constructor
    public Dice(int numOfDie,int faces){
        this.faces = faces;
        this.numOfDie = numOfDie;
    }

    //Accessor Methods
    public int getFaces(){
        return faces;
    }

    public int getNumOfDie(){
        return numOfDie;
    }

    //Mutator Methods
    public void setFaces(int faces){
        this.faces = faces;
    }

    public void setNumOfDice(int num){
        this.numOfDie = num;
    }
    // Revised.. this is nice distribution.
    public int rollDice() {
        Random r = new Random();
        return ( r.nextInt(faces^numOfDie-numOfDie)+numOfDie);
       
    }

    //toString
    @Override
    public String toString() {
        return "Dice{" +
                "faces=" + faces +
                ", numOfDie=" + numOfDie +
                '}';
    }
    /* Test Client */
    public static void main (String [] args){
        
        Dice dice1d6 = new Dice(1,6);
        int roll = dice1d6.rollDice();
        System.out.println("1D6: "+ roll);
        roll = dice1d6.rollDice();
        System.out.println("1D6: "+ roll);
        roll = dice1d6.rollDice();
        System.out.println("1D6: "+ roll);
        
        Dice dice2d12 = new Dice(2,12);
        roll = dice2d12.rollDice();
        System.out.println("2D12: "+ roll);
        roll = dice2d12.rollDice();
        System.out.println("2D12: "+ roll);
        roll = dice2d12.rollDice();
        System.out.println("2D12: "+ roll);
        
        Dice dice1d20 = new Dice(1,20);
        roll = dice1d20.rollDice();
        System.out.println("1D20: "+ roll);
        roll = dice1d20.rollDice();
        System.out.println("1D20: "+ roll);
        roll = dice1d20.rollDice();
        System.out.println("1D20: "+ roll);  
        
    }
}
