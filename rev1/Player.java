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

public class Player{

    private int id;
    private int position;
    private String name;
    private Player[] playerList;

    //Default Constructor
    private Player() {
        id = 1;
        name = "AI Player";
    }

    //Parameterised Constructor
    public Player(int position) {
         this.position = position;
       
    }
    //Factory method
    public static Player newPlayer(){
        return new Player();
    }
   

    //Accessor Methods
  
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public int getPosition(){
        return position;
    }
     public Player[] getPlayerList() {
        return playerList;
    }
     public Player getPlayer(int pos) {
        return playerList[pos];
    }
   

    //Mutator Methods

    public void setId(int aId) {
        id = aId;
    }

    public void setName(String aName) {
        name = aName;
    }
    public void setPosition(int position){
        this.position = position;
    }
    public void setPlayerList(Player[] playerList) {
        this.playerList = playerList;
    }
    // Not Recommended
    public void setPlayer(int i,Player player) {
        this.playerList[i] = player;
    }

    
   
    /* Field */
     public static Player[] initialisePlayers (int numberOfPlayers){
          Player[] playerList =  new Player[numberOfPlayers+1];
            
            for (int i = 0; i < playerList.length; i++ ){
                  playerList[i] =  new Player();
                   playerList[i].setId(i);
                //listedPlayers[i].setId(i);
             }
            return playerList;
        }
     
    
}