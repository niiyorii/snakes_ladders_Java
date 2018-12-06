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
package SnakesAndLadders;

/**
 *
 * @author K00232267 - Neal B
 */
public class GameBoard_test {

    private static class Node {

        private int position;
        private int type;

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

    }

    /* Test  Client */
    public static void main(String[] args) {
        Node player = new Node();
        {
            player.setPosition(10);
        }
        Node snake = new Node();

        {
            snake.setPosition(24);
            snake.setPosition(45);
            snake.setPosition(64);
            snake.setPosition(82);
            snake.setPosition(98);
        }
    }

}
