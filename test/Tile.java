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

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author K00232267 - Neal B
 */
public class Tile {

//    private Tile[] tileList;
    private int position;
    private int bottom;
    private int top;
    private int id;

    //Default
    public Tile() {
        this.position += 1;
        this.id = 0;
    }

    public Tile(int position, int id) {
        this.position = position;
        this.id = id;
    }

    public Tile(int position, int bottom, int top, int id) {
        this.position = position;
        this.bottom = bottom;
        this.top = top;
        this.id = id;
    }

    //Mutator Methods
    // Game Manager field...
//    public void initialiseTiles(int numberOfTiles) {
//        tileList = new Tile[numberOfTiles + 1];
//        for (int i = 0; i < tileList.length; i++) {
//            tileList[i] = new Tile();
//            tileList[i].setId(i);
//        }
//    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public void setTop(int top) {
        this.top = top;
    }

    //Accessor Methods
// Game Manager fields...
//    public Tile getTile(int position) {
//        return tileList[position];
//    }
//
//    public Tile[] getTileList() {
//        return tileList;
//    }

    public int getTilePosition() {
        return position;
    }

    public int getBottom() {
        return bottom;
    }

    public int getTop() {
        return top;
    }
    public void setId(int i) {
        this.id = i;
    }

    @Override
    public String toString() {
        return "Tile{" + " position=" + position + ", bottom=" + bottom + ", top=" + top + ", id=" + id + '}';
    }

        //Additional Methods
    //Extra methods here if needed... I don't think any will be needed.
    public static void main(String[] args) {
        ArrayList <Tile> board = new ArrayList<>();
        //empty Tile
        Tile t = new Player();
       for (int i = 0; i < 100; i++){
           Random r = new Random();
             
            
           board.add(new Player());
           System.out.println(board.get(i).toString());
       }
       
        

    }

}
