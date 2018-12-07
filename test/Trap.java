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
class Trap extends Tile{
    Trap[] trapList;
    Trap type;

    public Trap getType() {
        return type;
    }

    public void setType(Trap type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Trap{" + "type=" + type + '}';
    }
    public static void main (String [] args){
        Trap snake  =  new Trap();
    }
    

}