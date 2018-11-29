/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SnakesAndLadders;

import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author K00232267 - Neal B
 */

public class Player implements Iterable <Player> {

    
   private  int id;
   private  String name;
   private  int position;
   private  int diceRoll;
   private Player[] playerList; // refactor this..

   
   public Player(){
       this.id =  1;
       this.name = "AI Player";
       this.position = 0;
       this.diceRoll = 0;
   }

   public  int getId() {
        return id;
    }
   
    public  void setId(int aId) {
        this.id = aId;
    }
    public  String getName() {
        return name;
    }

    public  void setName(String aName) {
        this.name = aName;
    }

    public  int getPosition() {
        return position;
    }

    public  void setPosition(int aPosition) {
        this.position = aPosition;
    }

    public  int getDieResult() {
        return diceRoll;
    }
    
    public  void rollDice() {
        int dieCount = 6; //for variety die approach
        Random r = new Random();
        int dieResult = r.nextInt(dieCount)+1;
        diceRoll =  dieResult;
    }
     //Just for comparable subclass modification.
    @Override
    public Iterator<Player> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
    /*      Test Client      */
    public static void main (String [] args){
        int numPlaying = 3;
         
        Player p1= new Player(); Player p2 = new Player(); Player p3 = new Player(); // (collectively p for each Player object in Player [])
        
        //Needs to be changed from void to Player[] for external classes.
        
        Player [] playerList = {p1,p2,p3};
        
        
        playerList[0].setName("AI"); // Set player name
        System.out.println(playerList[0].getName());
        playerList[1].setName("Me"); // Set another player name
        
       System.out.println(playerList[1].getName());
        playerList[2].setName("You"); // Set the last Player name
        
        System.out.println(playerList[2].getName());
        //playerList = new Player[]{p1,p2};
         System.out.println("\n\nBreak \n\n");
        //initialisePlayers(2);
        //Player.setId(1);
        //String str = getPlayer(2).getPlayerName();
        
         
         //Issue iterating through players..
         
         //Example code for referencing static context
         //Issue - Reprints last created Object
         // Issue - object not referencing values
        //Recreate the code breaking issue...
        //Issue 1..
        
        System.out.println("Issue 1:");
         System.out.println(playerList[1].getName());
        for(int i = 0 ; i < numPlaying; i++){
            System.out.println(playerList[i].getName());
        }
        
                //Issue 2
        System.out.println("Issue 2:");
       for (Player p : playerList) {
           System.out.println(p.getName());
           
          
       }
       //

    }
}