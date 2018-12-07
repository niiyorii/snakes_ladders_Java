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
public class Snake extends Cell {

    Snake() {
        super.setTop(0);
        super.setBottom(0);
        super.getType();
    }

    Snake(int position,int bottom) {
        super.setPosition(position);
        super.setBottom(bottom);
        super.getType();
    }

    @Override
    public String toString() {
        return "Snake{" + " [inherited] position: " + super.getTilePosition() + " [inherited] top: " +super.getTop() +  '}' + "";
    }

// Do Something.
    public static void main(String[] args) {
        Snake s = new Snake(34, 12);
        Cell player = new Cell();
        player.setPosition(32);
        System.out.println(s.isSnake());
        System.out.println(player.isLadder());
    }
}
