/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SnakesAndLadders;
import SnakesAndLadders.Player.*;
import java.util.Scanner;

/**
 *
 * @author K00232267 - Neal B
 */
public class test_Game {
        private static Player[] playerList;
        public static void main (String [] args){

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
        GameBoardMap < Integer , Integer > players = new GameBoardMap<>();
        GameBoardMap < Integer , Integer > snake = new GameBoardMap<>();
        GameBoardMap < Integer , Integer > ladder = new GameBoardMap<>();
      
    {
        snake.put(99,54);
        snake.put(70,55);
        snake.put(52,42);
        snake.put(25,2);
        snake.put(95,72);

        ladder.put(6,25);
        ladder.put(11,40);
        ladder.put(60,85);
        ladder.put(46,90);
        ladder.put(17,69);
        }
      
       //Set up Player Names
       Scanner sc = new Scanner(System.in);
       int numPlaying = getNumOfPlayers();
       initialisePlayers(numPlaying);

       //For each player specified give a name.
       String name = "";
       for (int i = 0; i < numPlaying; i++){
            System.out.print("Enter a Player Name...");
            name = sc.nextLine();   
            playerList[i].setId(i+1);
            playerList[i].setName(name);
            //System.out.println(playerList[i].getName() + " " + playerList[i].getId() );
       }
    /* Take Turns rolling the highest dice */
    int player = 0; // denotes a player's roll

    //Actual Game Loop
    while(player < GOAL) {

        for (int i = 0; i < numPlaying; i++){

                Scanner in = new Scanner(System.in);
                String keypress = " ";

                System.out.println("Press Enter to Roll a Dice " + getPlayer(i).getName());
                System.out.print(keypress);
                keypress = in.nextLine();
                //Roll a dice
                getPlayer(i).rollDice();
                int roll= getPlayer(i).getDieResult();
                player = getPlayer(i).getPosition();
                int y = getPlayer(i).getPosition() / 10;
                int x = getPlayer(i).getPosition() % 10;
                players.printGrid(x,y);

                System.out.println(getPlayer(i).getName() + " is on Square: " + player);
                System.out.println("Rolling Dice..");
                System.out.println(getPlayer(i).getName() + " Rolled a " +roll);
                System.out.println(getPlayer(i).getName() + " is now on Square: " + (player+roll));
                //if this rolls a 2.. it's guaranteed to drop to the base of the snake 
                // after moving forward 2 and then landing the head of the snake
                player = getPlayer(i).getPosition()+roll;
                getPlayer(i).setPosition(player);
                
                

                if(null!=ladder.get(player))
                {
                    System.out.println("climb up the ladder");
                    player= (int)ladder.get(player);
                    getPlayer(i).setPosition(player);
                    System.out.println(getPlayer(i).getName()+" Square (ladder): " + player);
                }
                if (player > GOAL){
                    player  = GOAL - roll;
                    getPlayer(i).setPosition(player);
                }
                if (player == GOAL){
                    System.out.println("Congrats.. "+getPlayer(i).getName()+" wins");
                  
                }
            }
            if (player > GOAL){
              System.out.println("Game Over");
                break;
            }
        } 
    }
    /*
    *Usage: called to initialise a number of Player Objects in an Array.
    * Status: Green. 100% Complete
    */
     /* Fields */ 
    public static void initialisePlayers (int numberOfPlayers){
        playerList = new Player[numberOfPlayers+1];
        for (int i = 0; i < playerList.length; i++ ){
            playerList[i] = new Player();
            playerList[i].setId(i);
            //listedPlayers[i].setId(i);
        }
    }
    /*
    *Usage: Called to return an index of a Player Object in an Array
    *
    *Status : Green. 100% Complete.
    */
    public static Player getPlayer (int player){
        return playerList[player];
    }
}
/**
 * Dev Notes
 * 
 * 
 * 
 * 
 * 
 * 
 */