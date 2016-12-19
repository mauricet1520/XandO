package com.tiy.assignment;

/**
 * Created by crci1 on 12/18/2016.
 */
public class TicTacToe {
    private TheDrawing drawing;
    private String[] spaces = new String[9];
    private StringBuilder[] myList;
    public int round = 1;

    TicTacToe(String emptySpace) {

        drawing = new TheDrawing();
        myList = new StringBuilder[]{drawing.num1, drawing.line1, drawing.line2, drawing.line3, drawing.line4, drawing.line5,
                drawing.line6, drawing.line7, drawing.line8, drawing.line9, drawing.line10, drawing.numSet};
        for (int index = 0; index < 9; index++) {
            spaces[index] = emptySpace;

        }
    }

    TicTacToe() {

    }

    public StringBuilder[] getMyList() {
        return myList;
    }

    String[] getSpaces() {
        return spaces;
    }

    void move(int index, String playerMove) throws Exception {
        try {
            spaces[index] = playerMove;


            if (index == 0 && playerMove.equals("x")) {
                myList[2] = drawing.line2.replace(5, 6, drawing.x1).delete(7, 8);
                myList[3] = drawing.line3.replace(5, 6, drawing.x2).delete(7, 8);
                System.out.println();
                System.out.println();
                System.out.println();
                printBoard(myList);
            } else if (index == 0 && playerMove.equals("o")) {
                myList[2] = drawing.line2.replace(5, 6, drawing.o1).delete(7, 8);
                myList[3] = drawing.line3.replace(5, 6, drawing.o2).delete(7, 8);
                System.out.println();
                System.out.println();
                System.out.println();
                printBoard(myList);

            } else if (index == 1 && playerMove.equals("x")) {
                myList[2] = drawing.line2.replace(12, 13, drawing.x1).delete(14, 15);
                myList[3] = drawing.line3.replace(12, 13, drawing.x2).delete(14, 15);
                System.out.println();
                System.out.println();
                System.out.println();
                printBoard(myList);

            } else if (index == 1 && playerMove.equals("o")) {
                myList[2] = drawing.line2.replace(12, 13, drawing.o1).delete(14, 15);
                myList[3] = drawing.line3.replace(12, 13, drawing.o2).delete(14, 15);
                System.out.println();
                System.out.println();
                System.out.println();
                printBoard(myList);

            } else if (index == 2 && playerMove.equals("x")) {
                myList[2] = drawing.line2.replace(18, 19, drawing.x1).delete(20, 21);
                myList[3] = drawing.line3.replace(18, 19, drawing.x2).delete(20, 21);
                System.out.println();
                System.out.println();
                System.out.println();
                printBoard(myList);

            } else if (index == 2 && playerMove.equals("o")) {
                myList[2] = drawing.line2.replace(18, 19, drawing.o1).delete(20, 21);
                myList[3] = drawing.line3.replace(18, 19, drawing.o2).delete(20, 21);
                System.out.println();
                System.out.println();
                System.out.println();
                printBoard(myList);

            } else if (index == 3 && playerMove.equals("x")) {
                myList[5] = drawing.line5.replace(5, 6, drawing.x1).delete(7, 8);
                myList[6] = drawing.line6.replace(5, 6, drawing.x2).delete(7, 8);
                System.out.println();
                System.out.println();
                System.out.println();
                printBoard(myList);

            } else if (index == 3 && playerMove.equals("o")) {
                myList[5] = drawing.line5.replace(5, 6, drawing.o1).delete(7, 8);
                myList[6] = drawing.line6.replace(5, 6, drawing.o2).delete(7, 8);
                System.out.println();
                System.out.println();
                System.out.println();
                printBoard(myList);

            } else if (index == 4 && playerMove.equals("x")) {
                myList[5] = drawing.line5.replace(12, 13, drawing.x1).delete(14, 15);
                myList[6] = drawing.line6.replace(12, 13, drawing.x2).delete(14, 15);
                System.out.println();
                System.out.println();
                System.out.println();
                printBoard(myList);

            } else if (index == 4 && playerMove.equals("o")) {
                myList[5] = drawing.line5.replace(12, 13, drawing.o1).delete(14, 15);
                myList[6] = drawing.line6.replace(12, 13, drawing.o2).delete(14, 15);
                System.out.println();
                System.out.println();
                System.out.println();
                printBoard(myList);

            } else if (index == 5 && playerMove.equals("x")) {
                myList[5] = drawing.line5.replace(18, 19, drawing.x1).delete(20, 21);
                myList[6] = drawing.line6.replace(18, 19, drawing.x2).delete(20, 21);
                System.out.println();
                System.out.println();
                System.out.println();
                printBoard(myList);

            } else if (index == 5 && playerMove.equals("o")) {
                myList[5] = drawing.line5.replace(18, 19, drawing.o1).delete(20, 21);
                myList[6] = drawing.line6.replace(18, 19, drawing.o2).delete(20, 21);
                System.out.println();
                System.out.println();
                System.out.println();
                printBoard(myList);

            } else if (index == 6 && playerMove.equals("x")) {
                myList[8] = drawing.line8.replace(5, 6, drawing.x1).delete(7, 8);
                myList[9] = drawing.line9.replace(5, 6, drawing.x2).delete(7, 8);
                System.out.println();
                System.out.println();
                System.out.println();
                printBoard(myList);

            } else if (index == 6 && playerMove.equals("o")) {
                myList[8] = drawing.line8.replace(5, 6, drawing.o1).delete(7, 8);
                myList[9] = drawing.line9.replace(5, 6, drawing.o2).delete(7, 8);
                System.out.println();
                System.out.println();
                System.out.println();
                printBoard(myList);

            } else if (index == 7 && playerMove.equals("x")) {
                myList[8] = drawing.line8.replace(12, 13, drawing.x1).delete(14, 15);
                myList[9] = drawing.line9.replace(12, 13, drawing.x2).delete(14, 15);
                System.out.println();
                System.out.println();
                System.out.println();
                printBoard(myList);

            } else if (index == 7 && playerMove.equals("o")) {
                myList[8] = drawing.line8.replace(12, 13, drawing.o1).delete(14, 15);
                myList[9] = drawing.line9.replace(12, 13, drawing.o2).delete(14, 15);
                System.out.println();
                System.out.println();
                System.out.println();
                printBoard(myList);

            } else if (index == 8 && playerMove.equals("x")) {
                myList[8] = drawing.line8.replace(18, 19, drawing.x1).delete(20, 21);
                myList[9] = drawing.line9.replace(18, 19, drawing.x2).delete(20, 21);
                System.out.println();
                System.out.println();
                System.out.println();
                printBoard(myList);

            } else if (index == 8 && playerMove.equals("o")) {
                myList[8] = drawing.line8.replace(18, 19, drawing.o1).delete(20, 21);
                myList[9] = drawing.line9.replace(18, 19, drawing.o2).delete(20, 21);
                System.out.println();
                System.out.println();
                System.out.println();
                printBoard(myList);

            } else {
                System.out.println("please select the right number");
            }

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

        } catch (Exception e) {
            e.getMessage();
        }


    }

    public void checkBoard() {
        for (int index = 0; index < 9; index++) {

            spaces[index] = " ";
        }

    }

    public String findWinner() {

        boolean gameStillOn = true;
        if (spaces[0].equals("x") && spaces[1].equals("x") && spaces[2].equals("x")) {
            return "playerX wins";

        } else if (spaces[3].equals("x") && spaces[4].equals("x") && spaces[5].equals("x")) {
            return "playerX wins";

        } else if (spaces[6].equals("x") && spaces[7].equals("x") && spaces[8].equals("x")) {
            return "playerX wins";

        } else if (spaces[0].equals("x") && spaces[3].equals("x") && spaces[6].equals("x")) {
            return "playerX wins";

        } else if (spaces[1].equals("x") && spaces[4].equals("x") && spaces[7].equals("x")) {
            return "playerX wins";

        } else if (spaces[2].equals("x") && spaces[5].equals("x") && spaces[8].equals("x")) {
            return "playerX wins";

        } else if (spaces[0].equals("x") && spaces[4].equals("x") && spaces[8].equals("x")) {
            return "playerX wins";

        } else if (spaces[2].equals("x") && spaces[4].equals("x") && spaces[6].equals("x")) {
            return "playerX wins";

        } else if (spaces[0].equals("o") && spaces[1].equals("o") && spaces[2].equals("o")) {
            return "playerO wins";

        } else if (spaces[3].equals("o") && spaces[4].equals("o") && spaces[5].equals("o")) {
            return "playerO wins";

        } else if (spaces[6].equals("o") && spaces[7].equals("o") && spaces[8].equals("o")) {
            return "playerO wins";

        } else if (spaces[0].equals("o") && spaces[3].equals("o") && spaces[6].equals("o")) {
            return "playerO wins";

        } else if (spaces[1].equals("o") && spaces[4].equals("o") && spaces[7].equals("o")) {
            return "playerO wins";

        } else if (spaces[2].equals("o") && spaces[5].equals("o") && spaces[8].equals("o")) {
            return "playerO wins";

        } else if (spaces[0].equals("o") && spaces[4].equals("o") && spaces[8].equals("o")) {
            return "playerO wins";

        } else if (spaces[2].equals("o") && spaces[4].equals("o") && spaces[6].equals("o")) {

            return "playerO wins";

        } else {
            round++;
            if (round == 10) {
                return "The game is a tie";

            } else
                return "Round " + round;

        }
    }

    public void printBoard(StringBuilder[] myString) {

        for (StringBuilder printString : myString) {
            System.out.println(printString);

        }


    }
}
