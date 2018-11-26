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
   public Player(){
       id = 0;
       name = "AI Player";
       position = 0;
       diceRoll = 0;
   }
   public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Player.id = id;
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
        position = aPosition;
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
}