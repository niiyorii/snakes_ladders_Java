/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SnakesAndLadders;

import java.util.Random;

/**
 *
 * @author K00232267 - Neal B
 */

public class Player implements Comparable <Player> {

    
   private static int id;
   private static String name;
   private static int position;
   private static int diceRoll;
   private static Player[] playerList;

   
   public Player(){
       id =  1;
       name = "AI Player";
       position = 1;
       diceRoll = 0;
   }

   public int getId() {
        return id;
    }
   
    public  void setId(int aId) {
        id = aId;
    }
    public String getPlayerName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int aPosition) {
        position += aPosition;
    }

    public int getDieResult() {
        return diceRoll;
    }
    
    public void rollDice() {
        int dieCount = 6; //for variety die approach
        Random r = new Random();
        int dieResult = r.nextInt(dieCount)+1;
        diceRoll =  dieResult;
    }
     //Just for comparable subclass modification.
    @Override
    public int compareTo(Player o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    /* Fields */ 
    public static Player[] initialisePlayers (int numberOfPlayers){
        Player[] listedPlayers = new Player[numberOfPlayers];
        for (int i = 0; i < listedPlayers.length; ++i ){
            listedPlayers[i] = new Player();
            listedPlayers[i].setPosition(1);
            //listedPlayers[i].setId(i);
            
        }
        return listedPlayers;
    }
    public Player getPlayer (int player){
        
        return playerList[player];
    }
   
    /*      Test Client      */
    public static void main (String [] args){
        
        //getPlayer(2).setName("AI"); // Set player name
        
        //System.out.println(getPlayer(0).getPlayerName());
        //getPlayer(1).setName("Me"); // Set another player name
        
       // System.out.println(getPlayer(1).getPlayerName());
        //getPlayer(3).setName("You"); // Set the last Player name
        
        // System.out.println(getPlayer(2).getPlayerName());
        //playerList = new Player[]{p1,p2};
         // System.out.println("\n\n\nBreak \n\n\n");
        //initialisePlayers(2);
        //getPlayer(1).setId(1);
        //  String str = getPlayer(2).getPlayerName();
        //System.out.println(str);
        //System.out.println(getPlayer(2).getPlayerName());
        //System.out.println(getPlayer(2).getPlayerName());
        
        
    }
}