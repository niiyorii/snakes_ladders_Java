import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author K00232267 - Caolan G
 *
 * Anylitics
 */

public class Menu {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        final String instructions;
        int userInput;

        instructions = "To play the game, enter '1'.\n" + "To view the rules, enter '2'.\n" + "To view the stats, enter '3'.\n" + "To exit the game, enter '4'.\n";

        System.out.println("\nHello welcome to snakes and ladders\n\n");
        int i = 0;
        while (i == 0) {
            System.out.println(instructions);
            userInput = scan.nextInt(); 

            try {
                if (userInput == 1) {
                    i++;
                    Main.main(null);
                } else if (userInput == 2) {
                    i++;
                    //To print out the rules wherever they may be.
                    try (BufferedReader gameRulesReader = new BufferedReader(new FileReader("rules.txt"))) {
                        String line;
                        while ((line = gameRulesReader.readLine()) != null) {
                            System.out.println(line);
                        }
                    }catch (IOException e){
                        System.out.println("Error IOException:\n\n" + e);
                    }
                } else if (userInput == 3) {
                    i++;
                    //Here we will have to as for some more user input to see what type of stats they want to view, e.g basic, advanced etc.
                    //Can be completed when Analytics has all entries finalized and will not be changing.
                } else if (userInput == 4) {
                    i++;
                    System.exit(0);
                } else {
                    System.out.println("Invalid entry!");
                    System.out.println(instructions);
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid entry!" + e);
                System.out.println(instructions);
            }
        }
    }
}
