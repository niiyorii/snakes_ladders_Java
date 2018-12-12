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
 * @author K00232267 - Neal B
 */
public class Gameboard extends Cell{
    
    
    Player[] players;
    Cell[] cells;
    Gameboard() {
    } // for future changes
    
    /* Player fields */ 
    public Player getPlayer(int i) {
        return players[i];
    }

    public void setPlayer(int i, Player p) {
        this.players[i] = p;
    }

    
    /* Cell and Trap Fields */
    
    public Cell getCell(int i) {
        return cells[i];
    }
    public void setCell(int i, Cell tile) {
       cells[i] = tile
       
    }

    public Cell[] getCells() {
        return cells;
    }
     
    public void setType(String type, int i) {
       cells[i].type = type;
    }

   
    // Repeated code. Recommended use.
    /* Fields */
    public void initialisePlayers(int numberOfPlayers) {
        this.players = new Player[numberOfPlayers + 1];

        for (int i = 0; i < players.length; i++) {
            players[i] = Player.newPlayer();
            players[i].setId(i);

        }
    }

    /**
     * Creates an array of Cells specified by @param numberOfCells + 1, then
     * assigns an id to each individual cell
     *
     * @param numberOfCells
     * @return
     */
    public void initialiseCells(int numberOfCells) {
        this.cells = new Cell[numberOfCells + 1];

        for (int i = 0; i < cells.length; i++) {
            cells[i] = new Cell();

        }

    }

    //Print the Board
    public void printGrid() {
        int size = 10;
        int count = 0;
        int loc = 100; //variable for alternating rows
        //for each Y
        for (int i = 0; i < size; i++) {
            //System.out.println();
            // if Y is divisible by 2
            if (i % 2 == 0) {
                count = 0;
                for (int j = loc; count < 10; j--) {
                    System.out.print("\t " + j);
                    loc--;
                    count++;
                }
            } else {
                count = 0;
            }

            for (int j = loc - 9; count < 10; ++j) {
                System.out.print("\t " + j);
                loc--;
                count++;
            }
            System.out.println("\n");
        }
    }

    @Override
    public String toString() {
        String playerstr = "";
        String cellstr = "";
        for (Player player : players) {
            playerstr += player.toString();
        }
        for (Cell cell : cells) {
            cellstr += cell.toString();
        }
        return "Gameboard{" + "players=" + playerstr + ", cells=" + cellstr + '}';
    }
public static void main(String[] args) {
       //Define End Goal
        final int GOAL = 100;
           // specify a final value to check if the player is greater than or less
// 2 layered gridmaps for snakes and ladders (implemented as GameBoard ext. HashMap for Map and Map.Entry)
       
        Gameboard gameboard = new Gameboard();
        gameboard.initialiseCells(GOAL);
        
        
                //snakes
        {
      
        gameboard.setCell(99,new Snake(99,54));
        String c1Str = gameboard.getCell(99).toString();
        System.out.println(c1Str);
        gameboard.setCell(70,new Snake(70,55));
        System.out.println(gameboard.getCell(70).toString());
        gameboard.setCell(52,new Snake(52,42));
        System.out.println(gameboard.getCell(52).toString());
        gameboard.setCell(25,new Snake(25,2));
        System.out.println(gameboard.getCell(25).toString());
        gameboard.setCell(95,new Snake(95,72));
        System.out.println(gameboard.getCell(95).toString());
        
        //ladders
        gameboard.setCell(6,new Ladder(6,25));
        System.out.println(gameboard.getCell(6).toString());
        gameboard.setCell(11,new Ladder(11,40));
        System.out.println(gameboard.getCell(11).toString());
        gameboard.setCell(60,new Ladder(60,85));
        System.out.println(gameboard.getCell(60).toString());
        gameboard.setCell(46,new Ladder(46,90));
        System.out.println(gameboard.getCell(46).toString());
        gameboard.setCell(17,new Ladder(17,69));
        System.out.println(gameboard.getCell(17).toString());
        }
               
        //gameboard.setCell(1, new Snake(10,2));
       // System.out.print(gameboard.getCell(10).getType());
    }

  
}
