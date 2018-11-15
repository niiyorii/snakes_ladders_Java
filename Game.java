/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SnakesAndLadders;

/**
 *
 * @author K00232267 - Neal B
 * @contributor K00231156 - Caolan G
 */

public class Game {

    static GridMap main = new GridMap(10);
    static int[][] board = main.getGrid();

    public static void main(String[]args){

    }

    public void slideDownSnake(int[][] board, int snakeTailLocationX, int snakeTailLocationY){
        System.out.println("Hard luck, you have slid down a snake to position " + snakeTailLocationX);
    }

    public void climbUpLadder(int[][] board, int ladderTopLocationX, int ladderTopLocationY){
        System.out.println("Nice, you have climbed up a ladder to position " + ladderTopLocationX);
    }

    public void findPlayerPosition(){
        //Have to take a look at this later, but in theory it will return the position the player is currently on, on the board.
    }

    /* -- Note...
        Due to the fact that our board runs like the diagram below the int's snakeTailLocationX, snakeTailLocationY, ladderTopLocationX and ladderTopLocationY will have to be passed into a method for translation.

        100 99 98 97 96 95 94 93 92 91
        81  82 83 84 85 86 87 88 89 90
        80  79 78 77 76 75 74 73 72 71
        etc...

        e.g The grid is not like this

        100 99 98 97 96 95 94 93 92 91
        90  89 88 87 86 85 84 83 82 81
        80  79 78 77 76 75 74 73 72 71
        etc...

        So when passing in the ints x and y I will have to do a little translation work.
        Lets say for example if the player is in position 82 on the below board and that position 82 is also a snakes head.

        100 99 98 97 96 95 94 93 92 91
        81  82 83 84 85 86 87 88 89 90
        80  79 78 77 76 75 74 73 72 71
        etc...

        Now, when I call the method slideDownSnake();
        I cannot then just call getPlayerPosition(); (which will return 82) and pass that into the method slideDownSnake(int[][] board, int snakeTailLocationX, int snakeTailLocationY);
        I need an X and Y coordinate representing the actual array position e.g 82 would actually equal board[1][1]

        I will figure out a solution later, wont be too hard just need a little quiet and thought.
    */
}
