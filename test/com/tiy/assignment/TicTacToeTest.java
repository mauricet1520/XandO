package com.tiy.assignment;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by crci1 on 12/18/2016.
 */
public class TicTacToeTest {
    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void MoveTest() throws Exception {
        TicTacToe toe = new TicTacToe(" ");
        toe.move(6, "x");


    }

    @Test
    public void checkBoardTest() {
        TicTacToe toe = new TicTacToe(" ");
        for (int index = 0; index < 9; index++) {
            toe.getSpaces()[index] = " ";
            assertEquals(toe.getSpaces()[index], " ");
        }

    }


    @Test
    public void testFindWinner() {
        TicTacToe toe = new TicTacToe();
        for (int index = 0; index < 9; index++) {
            toe.getSpaces()[index] = " ";
            assertEquals(toe.getSpaces()[index], " ");
        }

        String winner = toe.findWinner();
        assertEquals("The game is a tie", winner);

    }


    @Test
    public void testXWinner() {
        TicTacToe toe = new TicTacToe();
        for (int index = 0; index < 9; index++) {
            if (index == 2) {
                toe.getSpaces()[index] = "x";
            } else if (index == 5) {
                toe.getSpaces()[index] = "x";

            } else if (index == 8) {
                toe.getSpaces()[index] = "x";
            } else {
                toe.getSpaces()[index] = " ";
            }
        }

        String winner = toe.findWinner();
        assertEquals("playerX wins", winner);
    }

    @Test
    public void testOWinner() {
        TicTacToe toe = new TicTacToe();
        for (int index = 0; index < 9; index++) {
            if (index == 2) {
                toe.getSpaces()[index] = "o";
            } else if (index == 5) {
                toe.getSpaces()[index] = "o";

            } else if (index == 8) {
                toe.getSpaces()[index] = "o";
            } else {
                toe.getSpaces()[index] = " ";
            }
        }

        String winner = toe.findWinner();
        assertEquals("playerO wins", winner);
    }

    @Test
    public void testPrintBoard() throws Exception {
        TicTacToe toe = new TicTacToe(" ");
        TheDrawing drawing = new TheDrawing();
        StringBuilder[] myString = new StringBuilder[]{drawing.num1, drawing.line1, drawing.line2, drawing.line3, drawing.line4,
                drawing.line5, drawing.line6, drawing.line7, drawing.line8, drawing.line9, drawing.line10, drawing.numSet};


        toe.move(1, "o");
        myString[8].replace(18, 18, drawing.o1).delete(20, 21);
        myString[9].replace(18, 19, drawing.o2).delete(20, 21);

        toe.printBoard(myString);


    }
}

