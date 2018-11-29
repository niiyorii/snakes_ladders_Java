import java.util.ArrayList;
import java.util.Scanner;

public class Game extends GameBoard {

    GameBoard snakesAndLadders = new GameBoard();


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInput = 0;

        for (int i = 0; i < 100; i++) {
            board.add(new Node());
        }

        System.out.println("Please enter the number of players playing below. - (Minimum 2, Maximum 4)");
        userInput = scan.nextInt();
        for(int i = 0; i < userInput; i++){
            board.get(i).addPlayer(new Player());
        }

        for (int i = 0; i < 100; i++) {
            board.get(i).setPosition(i + 1);
        }
    }
}




