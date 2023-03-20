package com.company;

import java.util.Scanner;

public class tica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        boolean winner = false;
        int row;
        int colum;
        char symbol;
        char[][] board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '-';
                // 0 1 2
                //
                //
            }
        }
        while (!winner) {
            if (board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][2] == 'O') {
                winner = true;
                break;
            }
            if (board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][2] == 'X') {
                winner = true;
                break;
            }
            if (board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][2] == 'O') {
                winner = true;
                break;
            }
            if (board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][2] == 'X') {
                winner = true;
                break;
            }
            if (board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][2] == '0') {
                winner = true;
                break;
            }
            if (board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][2] == 'X') {
                winner = true;
                break;
            }
            if (board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[2][0] == '0') {
                winner = true;
                break;
            }
            if (board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[2][0] == 'X') {
                winner = true;
                break;
            }
            if (board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[2][1] == '0') {
                winner = true;
                break;
            }
            if (board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[2][1] == 'X') {
                winner = true;
                break;
            }
            if (board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[2][2] == '0') {
                winner = true;
                break;
            }
            if (board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[2][2] == 'X') {
                winner = true;
                break;
            }
            if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[2][2] == '0') {
                winner = true;
                break;
            }
            if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[2][2] == 'X') {
                winner = true;
                break;
            }
            if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[2][0] == '0') {
                winner = true;
                break;
            }
            if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[2][0] == 'X') {
                winner = true;
                break;
            }
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    System.out.print("|" + board[i][j] + "|");
                }
                System.out.println();
            }

            System.out.println("Please enter the row and colum: ");
            row = scanner.nextInt();
            colum = scanner.nextInt();
            if (row < board[2][2] && colum < board[2][2]) {
                System.out.println("Please place your Symbol: ");
                symbol = scanner.next().charAt(0);
                if (counter % 2 == 0 && symbol == '0') {
                    if (board[row][colum] == '-') {
                        board[row][colum] = symbol;
                        counter++;
                    } else System.out.println("This position already has an element.");
                } else if (counter % 2 == 1 && symbol == 'X') {
                    if (board[row][colum] == '-') {
                        board[row][colum] = symbol;
                        counter++;
                    } else System.out.println("This position already has an element.");
                }
            } else System.out.println("This position is out of the border: ");
        }
        if (counter % 2 == 1) {
            System.out.println("Player 1 won the game: ");
        } else {
            System.out.println("Pleyer 2 won the game: ");
        }
    }
}
// player 1 = 0
// player 2 = x