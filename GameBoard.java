import java.util.ArrayList;
import java.util.Arrays;

public class GameBoard {
    public static class Tile {

        private Player[] playerList;

        private int position;
        private int bottom;
        private int top;

        private boolean ladder;
        private boolean snake;
        private boolean trap;

        //Mutator Methods
        public void setPlayerList(Player[] playerList) {
            this.playerList = playerList;
        }

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

        public int getPosition() {
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

        //toString
        @Override
        public String toString() {
            return "Tile{" +
                    "playerList=" + Arrays.toString(playerList) +
                    ", position=" + position +
                    ", bottom=" + bottom +
                    ", top=" + top +
                    ", ladder=" + ladder +
                    ", snake=" + snake +
                    ", trap=" + trap +
                    '}';
        }
    }
}
