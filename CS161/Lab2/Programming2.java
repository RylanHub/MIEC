package Lab2;

import java.util.Scanner;

public class Programming2 {
    static int[][] x = new int[3][3];
    static int[][] o = new int[3][3];
    static int row;
    static int col;

    public static void main(String[] args) {
        //Setting up the game
        //1. What are the conditions to end the game? 
        /*when the board is full or one player wins*/
        //-> How many moves?-> Who Wins?
        //  2. Who gets 'X' and who gets 'O'?

        //Player Moves
        //1. Whos turn is it?  
        //2. How do they select their position?  
        /*input two digits between 0,1,2 as their coordinates of position*/
        //3. Is the input valid?  
        //4. Have they won?
        setupBoard();
        displayBoard();

    }

    public static void setupBoard() {
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                if (x[i][j] == 1) {
                    System.out.print("X|");
                } else if (o[i][j] == 1) {
                    System.out.print("O|");
                } else {
                    System.out.print(" |");
                }
            }
            System.out.println();
        }
    }

    public static void displayBoard() {
        // 1. How would you display the board?
        /*print the array*/
        // 2. what is the current state of the board?
        // 3. What input parameters if any do you need?
        // 4. What if anything should you return?
        String playerX = "X";
        String playerO = "O";
        boolean flag = false;
        do {
            checkValidPosition(x,playerX);
            flag = checkForWin(x,row,col,playerX);
            if(flag) {
                System.out.println(playerX+" win!");
                return;
            }
            checkValidPosition(o,playerO);
            flag = checkForWin(o,row,col,playerO);
            if (flag) {
                System.out.println(playerO+" win!");
                return;
            }
        } while (true);
    }

    public static void checkValidPosition(int[][] xo, String player) {
        //1. Is the selected position taken on the board?
        //2. What input parameters if any do you need?
        //3. What if anything should you return?
        Scanner ttt = new Scanner(System.in);
        boolean flag = false;
        do {
            System.out.println(player+" player choose the position£º");
            row = ttt.nextInt();
            col = ttt.nextInt();
            if (x[row][col] != 0 || o[row][col] != 0) {
                System.out.println("This position is full!");
            } else {
                xo[row][col] = 1;
                flag = true;
            }
            setupBoard();
        } while (!flag);
    }



    public static boolean checkForWin(int[][] xo, int row, int col, String player) {
        // 1. How do you win at TicTacToe?
        /*make three in one row, column, or diagonal*/
        // 2. How to check for this winning conditions?
        // 3. What is the default character on the board?
        // 4. What input parameters if any do you need?
        // 5. What if anything should you return?
        int a = 0; //rows
        int b = 0; //columns
        int c = 0; //diagonal
        int d = 0; //back-diagonal
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                if(row == i) {
                    a+=xo[row][j];
                }
                if(col == j) {
                    b+=xo[i][col];
                }
                if(row==col && i==j) {
                    c+=xo[i][j];
                }
                if(row==(2-col) && i==(2-j)) {
                    d+=xo[i][j];
                }
            }
        }
        return a == 3 || b == 3 || c == 3 || d == 3;
    }
}
