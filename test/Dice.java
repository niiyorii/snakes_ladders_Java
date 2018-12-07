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
    public Dice(int faces, int numOfSide){
        this.faces = faces;
        this.numOfDie = numOfSide;
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

    public void setNumOfDie(int num){
        this.numOfDie = num;
    }

    public int rollDie() {
        return (int) (Math.random() * faces + numOfDie);
    }

    //toString
    @Override
    public String toString() {
        return "Dice{" +
                "faces=" + faces +
                ", numOfDie=" + numOfDie +
                '}';
    }
}
