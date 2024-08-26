package arreglos.practice;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *  Remember how to solve a sudoku 9x9
 *     1.- No repeat number in row
 *     2.- No repeat number in col
 *     3.- No repeat number in a square 3x3
 * */

public class SudokuSolver {
    private static final int SIZE = 9;
    public static void main(String[] args) {
        int[][] sudoku = {
                {0,0,0,  9,3,8,  0,0,0},
                {0,0,4,  0,0,0,  6,0,0},
                {8,0,0,  0,0,0,  0,0,1},

                {0,3,1,  0,0,0,  2,5,0},
                {0,2,0,  4,9,5,  0,3,0},
                {0,5,7,  0,0,0,  8,4,0},

                {5,0,0,  0,0,0,  0,0,2},
                {0,0,9,  0,0,0,  4,0,0},
                {0,0,0,  6,7,1,  0,0,0}
        };
        long start = System.currentTimeMillis();
        solved(sudoku);
        long end = System.currentTimeMillis();
        printSudoku(sudoku);
        System.out.println("Time: " +(end-start) );
    }

    public static boolean solved(int[][] sudoku){
        // Step 1 - Find the next space to put a guess, in this case our blank space will be a 0
        for (int row = 0; row < SIZE; row++){
            for (int col = 0; col < SIZE; col++){
                if(sudoku[row][col] == 0){
                    for(int guess = 1; guess <= SIZE; guess++){
                        if (isValidNumber(sudoku, row, col, guess)){
                            sudoku[row][col] = guess;
                            if(solved(sudoku))
                                return true;
                            sudoku[row][col] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    // Step 2 - we need a function to know if my guess is a valid number
    private static boolean isValidNumber(int[][] sudoku, int row, int col, int guess){
        return isValidRow(sudoku, row, guess) &&
                isValidColumn(sudoku, col, guess) &&
                isValidSubSquare(sudoku,row, col, guess);
    }

    // Helper functions base cases to solve a sudoku
    /**
     * Case 1:
     * My parameter will be my board(sudoku) my row and my guess,
     * we will check if exist a number in my row, then return false,
     * return true otherwise
     * */
    private static boolean isValidRow(int[][] sudoku, int row, int guess){
        for(int col=0; col<SIZE; col++)
            if (sudoku[row][col] == guess)
                return false;

        return true;
    }

    /**
     * Case 2
     * My parameter will be my board(sudoku) my row and my guess,
     * we will check if exist a number in my column, then return false,
     * return true otherwise
     * */
    private static boolean isValidColumn(int[][] sudoku, int col, int guess){
        for(int row = 0; row<SIZE; row++)
            if(sudoku[row][col] == guess)
                return false;
        return true;
    }
    /**
     * Case 3
     * My parameter will be my board(sudoku) my row and my guess,
     * we will check if exist a number in my square 3x3, then return false,
     * return true otherwise
     * */
    private static boolean isValidSubSquare(int[][] sudoku, int row, int col, int guess){
        final int boxRow = row - (row % 3);
        final int boxCol = col - (col % 3);

        for(int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if(sudoku[boxRow + i][boxCol + j] == guess)
                    return false;
        return true;
    }

    private static void printSudoku(int[][] sudoku){
        for(int row = 0; row < SIZE; row++){
            for(int col = 0; col < SIZE; col++){
                System.out.printf("%s ", sudoku[row][col]);
            }
            System.out.println(" ");
        }
    }
}
