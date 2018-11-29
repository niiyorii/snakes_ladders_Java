import java.util.ArrayList;

public class GameBoard {

    //Logic to size board here.
    static ArrayList<Node> board = new ArrayList();

    public static class Node{

        //Logic to initialize a 10 * 10 grid.

        //Small issue with holding multiple player in one location on board.
        //private Player p1;
        //private Player AI1;
        //private Player AI2;
        //private Player AI3;

        private static Player[] playerList;

        private int position;
        private int bottom;
        private int top;

        private boolean ladder;
        private boolean snake;
        private boolean trap;

        public void setPosition(int position){
            this.position = position;
        }

        public void addPlayer(Player p1){
            int length = playerList.length;
            playerList[length + 1] = p1;
        }

    }
}
