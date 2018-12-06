import java.util.ArrayList;
import java.util.Scanner;

public class Game extends GameBoard {
    GameBoard snakesAndLadders = new GameBoard();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInput = 0;

        for (int i = 0; i < 100; i++) {
            board.add(new Tile());
        }

        /*
            Was thinking that it would be a smarter idea to implement only 1 human player and 3 AI's until we have the majority of the project working.
            Then, if there is still time we can add the feature for extra human players.

            If we added 3 AI's and 1 human player instead of multiple human players it would save some extra logic that would be needed to calculate every humans player deciding to roll a dice and more.
            If that makes sense.
        */
        Game main = new Game();
        board.get(0).setPlayerList(main.initialisePlayers());

        for (int i = 0; i < 4; i++) {
            System.out.println(board.get(0).getPlayerFromPlayerList(i).getName() + " is on tile number " + board.get(0).getPosition());
        }

        System.out.println("\nLet the game begin!");

        int dieRollResult = 0;
        int playerPosition = 0;
        int artificialIntelligence1Position = 0;
        int artificialIntelligence2Position = 0;
        int artificialIntelligence3Position = 0;

        boolean playing = true;
        while(playing){

            dieRollResult = main.rollDie();


            for(int i = 0; i < board.get(playerPosition).getPlayerList().length; i++){
                board.get(playerPosition).getPlayerFromPlayerList(i).setPosition(board.get(playerPosition).getPlayerFromPlayerList(i).getPosition() + dieRollResult);
            }
            playing = false;
            //board.get(artificialIntelligence1Position).getPlayerList(0).setPosition(board.get(0).getPlayerList(0).getPosition() + dieRollResult);
            //board.get(artificialIntelligence2Position).getPlayerList(0).setPosition(board.get(0).getPlayerList(0).getPosition() + dieRollResult);
            //board.get(artificialIntelligence3Position).getPlayerList(0).setPosition(board.get(0).getPlayerList(0).getPosition() + dieRollResult);
        }
        System.out.println("Red Rolled a " + dieRollResult);
        System.out.println(board.get(playerPosition).getPlayerFromPlayerList(0).getName() + " is now in position " + board.get(playerPosition).getPlayerFromPlayerList(0).getPosition());

    }

    //Additional Methods
    public Player[] initialisePlayers() {
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

    public int rollDie() {
        return (int) (Math.random() * (6 + 1));
    }
}




