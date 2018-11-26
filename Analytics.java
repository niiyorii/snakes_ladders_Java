import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author K00232267 - Caolan G
 *
 * Anylitics
 */



public class Analytics {
    //Where these will be the project level path to each of these components.
    //One txt file for the separate analytics of both the player and the three AI's.
    private final String playerStatsFileLocation = "";
    private final String AIOneStatsFileLocation = "";
    private final String AITwoStatsFileLocation = "";
    private final String AIThreeStatsFileLocation = "";

    // - NOTE! - txt file will be overwrote after each game using the below method saveStats();

    private Player playerOne;
    private Player artificialIntelligenceOne;
    private Player artificialIntelligenceTwo;
    private Player artificialIntelligenceThree;

    //Basic stats...
    private int numberOfWins;
    private int numberOfLosses;

    //intermediate stats
    private int numberOfSnakesSlidDownLastGame;
    private int numberOfLaddersClimbedUpLastGame;

    //Advanced stats...
    private boolean didPlayerWinLastGame;


    //Open to suggestions of more analytics to track...

    //This is the logic we can use to save analytics to the txt files for the player and each of the AI
    public void saveStats(String AIOrPlayerStatLocation) {
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            //Set a String with the correct analytics to be save d to a file which has its path saved to a location specified by one of the above strings - playerStatsFileLocation, AIOneStatsFileLocation, AITwoStatsFileLocation, AIThreeStatsFileLocation.
            String content = "";

            fw = new FileWriter(AIOrPlayerStatLocation);
            bw = new BufferedWriter(fw);
            bw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

}
