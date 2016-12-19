package com.tiy.assignment;

import java.util.ArrayList;
import java.util.Scanner;


public class GameRunner {
    TicTacToe game;
    Scanner scanner;
    Player playerX;
    Player playerO;
    TicTacToe gameBoard;
    int games = 1;
    ArrayList<String> gamesWon;
    String round;

    public static void main(String[] args) throws Exception {

        new GameRunner().playGame();

    }

    private void playGame() throws Exception {
        gamesWon = new ArrayList<>();

        scanner = new Scanner(System.in);
        System.out.println("Player 1 enter your name?");
        String nameOfPlayerOne = scanner.nextLine();
        playerX = new Player(nameOfPlayerOne, "x");


        scanner = new Scanner(System.in);
        System.out.println("Player 2 enter your name?");
        String nameOfPlayerTwo = scanner.nextLine();
        playerO = new Player(nameOfPlayerTwo, "o");
        game = new TicTacToe(" ");
        gameBoard = new TicTacToe();
        game.printBoard(game.getMyList());

        label:
        while (true) {

            System.out.println(playerX.getName() + " Your turn");
            System.out.println("Enter a number between 0 to 8");
            String gameTurnOne = scanner.nextLine();
            int gameTurnNumber = Integer.parseInt(gameTurnOne);

            while (game.getSpaces()[gameTurnNumber].equals("x") || game.getSpaces()[gameTurnNumber].equals("o")) {
                System.out.println("You have to enter the right number");
                String gameTurnAgain = scanner.nextLine();
                gameTurnNumber = Integer.parseInt(gameTurnAgain);
            }
            game.move(gameTurnNumber, playerX.getLetter());
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

            String winner = game.findWinner();
            switch (winner) {
                case "playerX wins":
                    System.out.println(playerX.getName() + " Wins");
                    if (games <= 3) {
                        game = new TicTacToe(" ");
                        gamesWon.add(playerX.getName());
                        games++;
                        game.printBoard(game.getMyList());
                        continue label;
                    }

                    break label;
                case "playerO wins":
                    System.out.println(playerO.getName() + " Wins");
                    if (games <= 3) {
                        game = new TicTacToe(" ");
                        gamesWon.add(playerO.getName());
                        games++;
                        game.printBoard(game.getMyList());
                        continue label;
                    }
                    break label;

                case "The game is a tie":
                    System.out.println(winner);

                    if (games <= 3) {
                        game = new TicTacToe(" ");
                        gamesWon.add("game is tied");
                        games++;
                        game.printBoard(game.getMyList());
                        continue label;
                    }
                    break label;
                default:
                    break;
            }

            System.out.println(playerO.getName() + " Your turn");
            System.out.println("Enter a number between 0 to 8");
            String gameTurnTwo = scanner.nextLine();
            int gameTurnNumber2 = Integer.parseInt(gameTurnTwo);


            while (game.getSpaces()[gameTurnNumber2].equals("x") || game.getSpaces()[gameTurnNumber2].equals("o")) {
                System.out.println("You have to enter the right number");
                String gameTurnAgain = scanner.nextLine();
                gameTurnNumber2 = Integer.parseInt(gameTurnAgain);
            }

            game.move(gameTurnNumber2, playerO.getLetter());
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();


            String winner2 = game.findWinner();
            switch (winner2) {
                case "playerX wins":
                    System.out.println(playerX.getName() + " Wins");
                    if (games <= 3) {
                        game = new TicTacToe(" ");
                        gamesWon.add(playerX.getName());
                        games++;
                        game.printBoard(game.getMyList());
                        continue label;
                    }
                    break label;
                case "playerO wins":
                    System.out.println(playerO.getName() + " Wins");

                    if (games <= 3) {
                        game = new TicTacToe(" ");
                        gamesWon.add(playerO.getName());
                        game.printBoard(game.getMyList());
                        games++;
                        continue label;
                    }
                    break label;

                case "The game is a tie":
                    System.out.println(winner);
                    if (games < 3) {
                        game = new TicTacToe(" ");
                        gamesWon.add("game is tied");
                        games++;
                        game.printBoard(game.getMyList());
                        continue label;
                    }
                    break label;
                default:
                    break;
            }

        }
        playAgain();
    }

    public void playAgain() {

        System.out.println("Round one: " + gamesWon.get(0));
        System.out.println("Round two: " + gamesWon.get(1));
        System.out.println("Round three: " + gamesWon.get(2));
    }
}
