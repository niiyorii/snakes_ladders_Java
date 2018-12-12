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
public class Ladder extends Cell {

   public boolean isLadder(){return this instanceof Ladder;};
    public Ladder() {
        super();
        super.setType("Ladder");
        super.setPosition(0);
        super.setTop(0);
    }

    public Ladder(int position,int top) {
        super();
        super.setType("Ladder");
        super.setPosition(position);
        this.setTop(top);
    }

    @Override
    public String toString() {
        return "Ladder{" + " [inherited] position: " + super.getPosition() + " [inherited] top: " +this.getTop() +  '}' + "";
    }
    
// Do Something.
    public static void main(String[] args) {
        Cell s = new Ladder(34, 12);
        Cell player = new Ladder();
        player.setPosition(34);
        System.out.println(player.toString());
        System.out.println(player.equals(s));
    }
}