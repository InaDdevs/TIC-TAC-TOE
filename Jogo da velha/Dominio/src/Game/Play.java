package Game;

import java.util.Objects;
import java.util.Scanner;

public class Play {
    Scanner scanner = new Scanner(System.in);
    String[][] board = new String[3][3];
    private int player; // 0 representa circulo e X o x mesmo KKKKK

    public Play() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = "";
            }
        }
    }

    public void execute() {
        do {
            display();
            checkPlayer();
            mood();

        }while (true);
    }

    public void display() {
        System.out.println("   0   1   2 "); //Colunas
        System.out.println("0: " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]); //Linhas 1
        System.out.println("1: " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]); //Linhas 2
        System.out.println("2: " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]); //Linhas 3
    }

    public int checkPlayer() {
        if (player == 0) {
            player = 1;
        }else {
            player = 0;
        }
        return player;
    }

    public void mood (){

        int line,column;

    do {
        System.out.println("Digite uma linha: ");
        line = scanner.nextInt();
        System.out.println("Digite uma coluna: ");
        column = scanner.nextInt();

        if (line >= 0 && line < board.length && column >= 0 && column < board.length && board [line][column].equals("")) {
            fillInBoard(line, column);
            break;
            } else {
            System.out.println("Jogada invalida, tente novamente");
            }
        }while(true);


    }

    public String fillInBoard(int line, int column) {
        if (player == 0) {
            board[line][column] = "O";
        }else{
            board[line][column] = "X";
        }



        return board[line][column];
    }

}
