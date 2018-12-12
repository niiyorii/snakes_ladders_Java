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
public class Board extends Tile {

    Tile[] board;
    Player[] players;
    Cell[] traps;

    public Tile[] getBoard() {
        return board;
    }

    public void setBoard(Tile[] board) {
        this.board = board;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player player) {
        this.players = players;
    }

    @Override
    public int getTilePosition() {
        return super.getTilePosition(); //To change body of generated methods, choose Tools | Templates.
    }

    public void initialiseTiles(int numberOfTiles) {
        super.initialiseTiles(numberOfTiles); //To change body of generated methods, choose Tools | Templates.
    }

    public void setTrap(Tile tile, Cell type) throws InstantiationException, IllegalAccessException {
        tile.setType(type); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cell getType() {
        return getType(); //To change body of generated methods, choose Tools | Templates.
    }

    public void initialisePlayers(int numberOfPlayers) {
        players = new Player[numberOfPlayers + 1];
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player();
            players[i].setId(i);
            //listedPlayers[i].setId(i);
        }
    }

    Board() {
    } // for future changes

}
