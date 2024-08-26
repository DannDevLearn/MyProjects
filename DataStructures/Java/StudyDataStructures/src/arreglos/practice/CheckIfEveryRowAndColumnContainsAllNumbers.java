package arreglos.practice;

import java.util.HashSet;
import java.util.Set;

/**
 * An n x n matrix is valid if every row and every column contains all the integers from 1 to n (inclusive).
 *
 * Given an n x n integer matrix matrix, return true if the matrix is valid. Otherwise, return false.
 *
 * Input: matrix = {{1,2,3],{3,1,2],{2,3,1]]
 * Output: true
 * Explanation: In this case, n = 3, and every row and column contains the numbers 1, 2, and 3.
 * Hence, we return true.
 *
 *
 * Input: matrix = {{1,1,1],{1,2,3],{1,2,3]]
 * Output: false
 * Explanation: In this case, n = 3, but the first row and the first column do not contain the numbers 2 or 3.
 * Hence, we return false.
 * */
public class CheckIfEveryRowAndColumnContainsAllNumbers {
    public static void main(String[] args) {
        int[][] board = {{1,2,3},{3,1,2},{2,3,1}};
        long start = System.currentTimeMillis();
        System.out.println(xorSolution(board));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static boolean solution(int[][] matrix){
        // Time Complexity O(n^2)
        // Space Complexity O(n)
        Set<String> set = new HashSet<>();
        int GRID_SIZE = matrix.length;

        for(int row = 0; row < GRID_SIZE; row++){
            for(int column = 0; column < GRID_SIZE; column++){
                int number = matrix[row][column];
                if(!set.add(number +"row" +row) || !set.add(number +"column" +column))
                    return false;
            }
        }
        return true;
    }

    private static boolean xorSolution(int[][] matrix){
        // Time Complexity O(n^2)
        // Space Complexity O(1)
        int len = matrix.length;

        for(int i=0; i <len; i++){
            int rowXor = 0;
            int colXor = 0;

            for(int j=0; j<len; j++){
                rowXor ^= matrix[i][j] ^ (j + 1);
                colXor ^= matrix[j][i] ^ (j + 1);
            }
            if(rowXor != 0 || colXor != 0)
                return false;
        }
        return true;
    }
}
