package SnakesAndLadders;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Game extends GameBoard {

    static ArrayList<Tile> board = new ArrayList();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInput = 0;

        for (int i = 0; i < 100; i++) {
            board.add(new Tile());
        }

        Game main = new Game();
        board.get(0).setPlayerList(main.initialisePlayers());

        for (int i = 0; i < 4; i++) {
            System.out.println(board.get(0).getPlayer(i).getName() + " is on tile number " + board.get(0).getPosition());
        }

        System.out.println("\nLet the game begin!");

        int playerPosition = 0;
        int artificialIntelligence1Position = 0;
        int artificialIntelligence2Position = 0;
        int artificialIntelligence3Position = 0;

        main.playGame(main, playerPosition);
        main.playGame(main, artificialIntelligence1Position);
        main.playGame(main, artificialIntelligence2Position);
        main.playGame(main, artificialIntelligence3Position);
    }

    //Additional Methods
    private Player[] initialisePlayers() {
        Player[] createPlayers = new Player[4];

        for (int i = 0; i < 4; i++) {
            createPlayers[i] = new Player(i + 1, 0);
        }
        createPlayers[0].setName("Red");
        createPlayers[1].setName("Green");
        createPlayers[2].setName("Blue");
        createPlayers[3].setName("Yellow");

        return createPlayers;
    }

    private static Player getPlayer(int a, int b) {
        return board.get(a).getPlayer(b);
    }

    public void turn(int playerPosition, int dieRollResult) {
        for (int i = 0; i < board.get(playerPosition).getPlayerList().length; i++) {

        }
        System.out.println(board.get(playerPosition).getPlayer(0).getName() + " Rolled a " + dieRollResult);
        System.out.println(getPlayer(playerPosition, 0).getName() + " is now in position " + board.get(playerPosition).getPlayer(0).getPosition());
    }

    public void movePlayerOnGameBoard(int positionFromPositionTo, int dieRollResult) {
        Player[] p = new Player[1];
        p[positionFromPositionTo] = board.get(positionFromPositionTo).getPlayer(positionFromPositionTo);
        Tile t = new Tile();
        t.setPlayerList(p);
        board.set(dieRollResult, t);

        System.out.println(board.get(dieRollResult).getPlayer(0).getPosition());
    }

    public void playGame(Game main, int playerPosition) {
        Scanner scan = new Scanner(System.in);
        Dice twoDiceSix = new Dice();
        boolean isPlaying = true;
        int dieRollResult;
        int userInput;

        while (isPlaying) {
            for (int i = 0; i < 4; i++) {
                System.out.println(board.get(playerPosition).getPlayer(i).getName() + " press '1' to roll a die.");
                userInput = scan.nextInt();

                try {
                    if (userInput == 1) {
                        dieRollResult = twoDiceSix.rollDie();
                        System.out.println(board.get(playerPosition).getPlayer(i).getName() + " rolled a " + dieRollResult);

                        board.get(playerPosition).getPlayer(i).setPosition(board.get(playerPosition).getPlayer(i).getPosition() + dieRollResult);
                        System.out.println(getPlayer(playerPosition, i).getName() + " is now in position " + board.get(playerPosition).getPlayer(i).getPosition());

                        main.movePlayerOnGameBoard(playerPosition, dieRollResult);
                        System.out.println(board.get(dieRollResult).getPlayer(i).getName() + " is on tile number " + board.get(1).getPosition());

                    } else {
                        System.out.println("\nError: Invalid entry!");
                        System.out.println("Please enter '1' to roll a die.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("\nError: Invalid entry!");
                    System.out.println("Error: Please enter '1' to roll a die.");
                }
            }
        }
    }
}
