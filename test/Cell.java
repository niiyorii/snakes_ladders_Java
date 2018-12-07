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
class Cell extends Tile {

    Cell type;

    boolean isLadder() {
        return this instanceof Ladder;
    }

    boolean isSnake() {
        return this instanceof Snake;
    }

    Cell() {
    }// for future changes

    Cell(int position, int top, int bottom) {
        super.setPosition(position);
        super.setTop(top);
        super.setBottom(bottom);
        type = null;
    }

    Cell(int position, int top, int bottom, Cell type) {
        super.setPosition(position);
        super.setTop(top);
        super.setBottom(bottom);
        this.type = type;
    }

    @Override
    public void setId(int i) {
        super.setId(i); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getTilePosition() {
        return super.getTilePosition(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPosition(int position) {
        super.setPosition(position); //To change body of generated methods, choose Tools | Templates.
    }

    public void setType(Cell type) {
        this.type = type;
    }

    @Override
    public Cell getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Cell{" + "type=" + type + '}';
    }

    public static void main(String[] args) {
        Cell player = new Cell(); // empty cell that inherits Tile
        Cell snake = new Snake();
        Cell ladder = new Ladder();
        System.out.println(player.isLadder());
        System.out.println(ladder.isLadder());
        System.out.println(snake.isLadder());

        if (player instanceof Ladder) {
            System.out.println("Player landed on a Ladder");
            if (player instanceof Snake) {
            }

        }

    }
}
