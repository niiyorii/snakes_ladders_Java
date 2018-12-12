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

import java.util.Scanner;

/**
 *
 * @author K00232267 - Neal B
 */
public class Game {
    
    public static void gameMenu (){
        /* Menu Loop - Start Game, Give Player Name, Quit. etc */ 
        System.out.println("################\n"
                + "Make a Choice\n"
                + "1. Play a Game\n"
                + "2. Quit.\n"
                + "################\n");
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        switch(in){ 
            case 1: gameLogic();
                break;
            case 2: System.out.println("Exiting");
                       System.exit(0);
                break;
            default: System.out.println("Unsupported input");
               break;
        }
    }
    
     public static int getNumOfPlayers(){
            int numPlaying;
        do{
            System.out.println("Enter the number of players playing. (1-4)");
            Scanner sc =  new Scanner(System.in);
            //count = sc.nextInt();
            numPlaying = sc.nextInt();
            switch(numPlaying){
                case 1: System.out.println("Not enough Players");
                        //Debug
                     // Do something for case 1.
                        getNumOfPlayers();
                    break;
                case 2: System.out.println("2 Players...");
                      

                    break;
                case 3: System.out.println("3 Players..");
                       

                    break;
                case 4: System.out.println("4 Players..");
                       

                    break;
                default: System.out.println("invalid input");
                    break;
                
            }
        }while(numPlaying < 1 && numPlaying >= 4);
        return numPlaying;
     }
       /* Game Logic 
    *
    *Usage: Called to Create the GameBoard objects and run/ Initialise
    *   Game based componenents. Prompts the user to enter a number of players
    *   enter in the name for each Player and then takes turns rolling the dice
    *   to progress the game.
    *
    *   Status: Green-Tint-Sapphire. 85% Completion
    *   TODO: Add CPU Menu Prompt, Specify Number of AI Players, Looping..
    *
    */
        
    public static void gameLogic(){
        //Define End Goal
        final int GOAL = 100;
           // specify a final value to check if the player is greater than or less
// 2 layered gridmaps for snakes and ladders (implemented as GameBoard ext. HashMap for Map and Map.Entry)
       
        Gameboard gameboard = new Gameboard();
        gameboard.initialiseCells(GOAL);
        
        
                //snakes
        {
      
        gameboard.setCell(99,new Snake(99,54));
        String c1Str = gameboard.getCell(99).toString();
        System.out.println(c1Str);
        gameboard.setCell(70,new Snake(70,55));
        System.out.println(gameboard.getCell(70).toString());
        gameboard.setCell(52,new Snake(52,42));
        System.out.println(gameboard.getCell(52).toString());
        gameboard.setCell(25,new Snake(25,2));
        System.out.println(gameboard.getCell(25).toString());
        gameboard.setCell(95,new Snake(95,72));
        System.out.println(gameboard.getCell(95).toString());
        
        //ladders
        gameboard.setCell(6,new Ladder(6,25));
        System.out.println(gameboard.getCell(6).toString());
        gameboard.setCell(11,new Ladder(11,40));
        System.out.println(gameboard.getCell(11).toString());
        gameboard.setCell(60,new Ladder(60,85));
        System.out.println(gameboard.getCell(60).toString());
        gameboard.setCell(46,new Ladder(46,90));
        System.out.println(gameboard.getCell(46).toString());
        gameboard.setCell(17,new Ladder(17,69));
        System.out.println(gameboard.getCell(17).toString());
        }
               
        //gameboard.setCell(1, new Snake(10,2));
       // System.out.print(gameboard.getCell(10).getType());
    
        
       //Set up Player Names
       Scanner sc = new Scanner(System.in);
       int numPlaying = getNumOfPlayers();
       gameboard.initialisePlayers(numPlaying);

       //For each player specified give a name.
       String name = "";
       for (int i = 0; i < numPlaying; i++){
            System.out.print("Enter a Player Name...");
            name = sc.nextLine();   
            gameboard.getPlayer(i).setId(i+1);
            gameboard.getPlayer(i).setName(name);
            //System.out.println(playerList[i].getName() + " " + playerList[i].getId() );
       }
    /* Take Turns rolling the highest dice */
    int playerSquare = 0; // denotes a player's position
    String playerName ="";
    //Actual Game Loop
    while(playerSquare < GOAL) {

        for (int i = 0; i < numPlaying; i++){

                Scanner in = new Scanner(System.in);
                String keypress = " ";
                playerName = gameboard.getPlayer(i).getName();
                playerSquare = gameboard.getPlayer(i).getPosition();
                int playerNum = i;
                System.out.println();
                System.out.println("Press Enter to Roll a Dice " + playerName);
                
                System.out.print(keypress);
                keypress = in.nextLine();
                
                Dice d1 = new Dice();
                //Roll a dice
                
                int roll = d1.rollDice();
                int move = playerSquare+roll;
               // int y = getPlayer(i).getPosition() / 10;
                //int x = getPlayer(i).getPosition() % 10;
                gameboard.printGrid();
                
                System.out.println("Player " +playerNum + " is on Square: " + playerSquare);
                //playerSquare = playerSquare+move;
                
                System.out.println("Rolling Dice..");
                System.out.println(playerName + " Rolled a " +roll);
                System.out.println(playerName + " is now on Square: " + move);
                //if this rolls a 2.. it's guaranteed to drop to the base of the snake 
                // after moving forward 2 and then landing the head of the snake
                
                gameboard.getPlayer(i).setPosition(move);
                
                

                if(gameboard.getCell(move) instanceof Ladder)
                {
                    System.out.println("climb up the ladder");
                    playerSquare= gameboard.getCell(move).getTop();
                    gameboard.getPlayer(i).setPosition(move);
                    System.out.println(playerName+" Square (ladder): " + playerSquare);
                }
                
                if(gameboard.getCell(move) instanceof Snake)
                {
                    System.out.println("drop down the snake");
                    playerSquare= gameboard.getCell(move).getBottom();
                    gameboard.getPlayer(i).setPosition(move);
                    System.out.println(playerName+" Square (Snake): " + playerSquare);
                }
                if (playerSquare > GOAL){
                    playerSquare  = GOAL - roll;
                    gameboard.getPlayer(i).setPosition(playerSquare);
                }
                if (playerSquare == GOAL){
                    System.out.println("Congrats.. "+ playerName+" wins");
                  
                }
            }
        } 
    }
       public static void main(String[] args) {
       gameMenu();
       gameLogic();
    }
 
}