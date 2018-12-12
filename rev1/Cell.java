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
public class Cell {

    String type;
    int position;
    int top;
    int bottom;
    Snake snake;
    Ladder ladder;
    Cell square;

    Cell() {
        this.type="Open";
        this.position=0;
        this.top=0;
        this.bottom=0;
    }
    ;
    Cell(Square sq) {
        this.type = sq.type;
        this.position = sq.position;
        this.top= sq.top;
        this.bottom= sq.bottom;
        this.snake = sq.snake;
        this.ladder = sq.ladder;
        this.square = sq;
    }
    ;
    Cell(Snake s){
        this.snake = s;
    }
    Cell (Ladder l){
        this.ladder = l;
    }
    
    public String getType() {
        return this.type;
    }

    ;
    public void setType(String type) {
        this.type = type;
    }

    ;
    public void setPosition(int pos) {
        this.position = pos;
    }

    ;
    public int getPosition() {
        return this.position;
    }

    ;
    public void setTop(int top) {
        this.top = top;
    }

    ;
    public int getTop() {
        return this.top;
    }

    ;
    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    ;
    public int getBottom() {
        return this.bottom;
    }

    ;

    @Override
    public String toString() {
        return "Cell{" + "type=" + type + ", position=" + position + ", top=" + top + ", bottom=" + bottom + '}';
    }

    public static void main(String[] args) {
        Cell cell = new Cell();
        Cell s1 = new Snake(12, 6);
        Cell cs1 = new Cell(new Snake(12,6));
        Cell csq1 = new Cell(new Square(12));
        Cell cl1 = new Cell(new Ladder(12,16));

        System.out.println((cell.toString())); //empty cell
        System.out.println(s1.toString());      //new snake at 12top 9bottom
        System.out.println(cs1.toString());
        System.out.println(csq1.toString());
        System.out.println(cl1.getBottom());
    }

    
}
