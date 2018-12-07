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
public interface ITile {

    int position=0;
    String type="";
   
    int getPosition();
    void setPosition(int aPosition);
    String getType();
    void setType(String aType);
    boolean isLastTile();
    boolean isOccupied();
 
}

    class Tile {
    private Tile[] tileList;
    private int position;
    private int id;
    private Trap type;

    public Trap getType() {
        return type;
    }

    public void setType(Trap type) {
        this.type = type;
    }
    

    //Default
    public Tile() {
        this.position += 1;
        this.id = 0;
    }

    public Tile(int id, int position, Trap trap) {
        this.position = position;
        this.id = id;
        trap = new Trap();
    }

    public Tile(int id, int position, Trap trap) {
        this.position = position;
        this.id = id;
        trap = new Trap();
    }

    //Mutator Methods
     
    public void initialiseTiles(int numberOfTiles) {
        tileList = new Tile[numberOfTiles + 1];
        for (int i = 0; i < tileList.length; i++) {
            tileList[i] = new Tile();
            tileList[i].setId(i);
        }
    }

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


    public int getTilePosition() {
        return position;
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
       for (int i = 0; i < 100; i++){
           if (i = 12){
               board.set(i,new Tile(1,12,Ladder(1,12,21)));
           }
           board.set(i, new Tile());
           
       }
       
        

    }

}
