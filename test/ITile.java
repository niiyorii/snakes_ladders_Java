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

/**
 *
 * @author K00232267 - Neal B
 */
public interface ITile {

    int position = 0;
    String type = "";

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
    private Cell type;
    private int top;
    private int bottom;

    /* Accessors */
    public Tile[] getTileList() {
        return tileList;
    }

    public int getPosition() {
        return position;
    }

    public int getId() {
        return id;
    }

    public int getTop() {
        return top;
    }

    public int getBottom() {
        return bottom;
    }

    public Tile getType() {
        return type;
    }

    public int getTilePosition() {
        return position;
    }

    //Default
    public Tile() {
        this.position = 1;
        this.id = 0;
    }

    public Tile(int id, int position, Cell trap) {
        this.position = position;
        this.id = id;
        trap = new Cell();
    }

    /* Mutator Methods */
    public void setType(Cell type) {
        this.type = type;
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

    public void setId(int i) {
        this.id = i;
    }

    @Override
    public String toString() {
        return "Tile{" + "tileList=" + tileList + ", position=" + position + ", id=" + id + ", top=" + top + ", bottom=" + bottom + '}' + ", type=" + type;
    }

    //Additional Methods
    //Extra methods here if needed... I don't think any will be needed.
    /* Test Client */
    public static void main(String[] args) {
        ArrayList<Tile> board = new ArrayList<>();
        Tile aTile = new Tile();
        Tile trap = new Tile(0, 10, new Cell());
        // we don't really need to define player in terms of type sooooo,
        //give it a position and let's do it.
        Cell player = new Cell();
        player.setPosition(2);

        // for this to correlate fully to the Player class.
        // Player should extend Cell, therefore Player inherits cell
        // has a position
        // an unspecified type (we could coin this "teams")
        // 
        System.out.println("Created 2 Tiles");
        System.out.println(aTile.toString());
        System.out.println(trap.toString());

        System.out.println("Modified Second one as a Cell");
        trap.type = new Cell();

        System.out.println(trap.toString());

        trap.setPosition(0);
        trap.setTop(10);
        trap.setBottom(0);
        trap.setType(new Snake());

        System.out.println("Modified Second one as a Trap");
        System.out.println(trap.toString());

        board.add(trap);

        board.add(aTile);

        Tile cell;
        //Create 100 tiles
        for (int i = 0; i < 100; i++) {
            cell = new Tile(i, i, new Cell());
            board.add(cell);
        }
        /* We can leave these unassigned until we do analytics */
        {
            //add snakes to the board
            board.set(25, new Snake(25, 2));
            board.set(52, new Snake(52, 42));
            board.set(70, new Snake(70, 55));
            board.set(95, new Snake(95, 72));
            board.set(99, new Snake(99, 54));

            //add ladders to the board
          board.set(6, new Ladder(6, 25));
           board.set(11, new Ladder(11, 40));
            board.set(17, new Ladder(17, 69));
           board.set(46, new Ladder(46, 90));
           board.set(60, new Ladder(60, 85));
        }

        //test instanceof
        // actual code: Tile t = board.get(i);
        Tile t = board.get(2);
        Ladder l[] = {(Ladder)board.get(6), (Ladder)board.get(11), (Ladder)board.get(17), (Ladder)board.get(46),(Ladder)board.get(60)};
        if (player instanceof Ladder){
            System.out.println("Player hit a Ladder");
        }
        if (player instanceof Snake){
             System.out.println("Player hit a Snake");    
        }
        else
            System.out.println("Player moved.");
            
        
    }

}
}
