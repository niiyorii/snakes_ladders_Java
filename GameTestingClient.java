import java.util.ArrayList;

public class GameTestingClient extends GameBoard {
    public static void main(String[] args) {
        GameBoard main = new GameBoard();
        Player p = new Player();

        Trap trap1 = new Trap(0,10);

        Tile t1 = new Tile();
        Tile t2 = new Tile();

        Dice d1 = new Dice(6, 2);

        System.out.println("\nGameboard");
        System.out.println(main);

        System.out.println("\nTrap");
        System.out.println(trap1);

        System.out.println("Player");
        System.out.println(p);

        System.out.println("\nTile 1");
        System.out.println(t1);

        System.out.println("\nTile 2");
        System.out.println(t1);

        System.out.println("\nDice 2");
        System.out.println(d1);

        int x = d1.rollDie();
        ArrayList<Tile> board = new ArrayList();
        board.add(t1);
        board.add(t2);

//        board.get(0).setPlayerList();





    }
}
