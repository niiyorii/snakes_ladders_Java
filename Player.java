/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SnakesAndLadders;

/**
 *
 * @author K00232267 - Neal B
 */
public class Player {
    
   private static String playerName;
   private static int playerPosition;
   private static int playerRoll;

    public static String getPlayerName() {
        return playerName;
    }

    public static void setPlayerName(String aPlayerName) {
        playerName = aPlayerName;
    }

    public static int getPlayerPosition() {
        return playerPosition;
    }

    public static void setPlayerPosition(int aPlayerPosition) {
        playerPosition = aPlayerPosition;
    }

    public static int getPlayerRoll() {
        return playerRoll;
    }

    public static void setPlayerRoll(int aPlayerRoll) {
        playerRoll = aPlayerRoll;
    }
}
