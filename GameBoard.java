import SnakesAndLadders.Player;
import java.util.ArrayList;

public class GameBoard {
    

    public static class Tile extends Player {


        private Player[] playerList;

        private int position;
        private int bottom;
        private int top;

        private boolean ladder;
        private boolean snake;
        private boolean trap;


        //Mutator Methods
        public void initialisePlayers (int numberOfPlayers){
             playerList = new Tile[numberOfPlayers+1];
            for (int i = 0; i < playerList.length; i++ ){
                   playerList[i] = new Tile();
                   playerList[i].setId(i);
                //listedPlayers[i].setId(i);
             }
        }
        @Override
        public void setPosition(int position) {
            this.position = position;
        }

        public void setBottom(int bottom) {
            this.bottom = bottom;
        }

        public void setTop(int top) {
            this.top = top;
        }

        public void setLadder(boolean ladder) {
            this.ladder = ladder;
        }

        public void setSnake(boolean snake) {
            this.snake = snake;
        }

        public void setTrap(boolean trap) {
            this.trap = trap;
        }

        //Accessor Methods
        public Player getPlayer(int position) {
            return playerList[position];
        }

        public Player[] getPlayerList() {
            return playerList;
        }

        public int getTilePosition() {
            return position;
        }

        public int getBottom() {
            return bottom;
        }

        public int getTop() {
            return top;
        }

        public boolean getLadder() {
            return ladder;
        }

        public boolean getSnake() {
            return snake;
        }

        public boolean getTrap() {
            return trap;
        }

        //Additional Methods
        //Extra methods here if needed... I don't think any will be needed.
    }
    public static void main (String [] args) {
        ArrayList<Tile> board = new ArrayList<>(); // an arraylist of tiles..

        Player [] playersList;
        Player t = new Tile();
        
        int numberOfPlayers = 4;
        
        t.initialisePlayers(numberOfPlayers);
        
        
        // Specifications
        // Needs to be able to Create a Player[]
        // Initialse a Tile as a Player
        // Fetch a Player Object from a Tile [Player extends Tile]
        
        playersList = t.getPlayerList();
        board.add(t.getPlayer(0));
        board.get(t.setPlayer(new Tile()));
        
    }
}
