package arreglos.practice;

import java.util.stream.IntStream;

/**
 * LeetCode 1572 - Matrix Diagonal Sum
 *
 * Given a square matrix mat, return the sum of the matrix diagonals.
 *
 * Only include the sum of all the elements on the primary diagonal
 * and all the elements on the secondary diagonal that are not part of the primary diagonal.
 *
 * Input: mat = [[1,2,3],
 *               [4,5,6],
 *               [7,8,9]]
 * Output: 25
 * Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
 * Notice that element mat[1][1] = 5 is counted only once.
 *
 * Example 2:
 *
 * Input: mat = [[1,1,1,1],
 *               [1,1,1,1],
 *               [1,1,1,1],
 *               [1,1,1,1]]
 * Output: 8
 *
 * Example 3:
 * Input: mat = [[5]]
 * Output: 5
 * */
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {{1,1,1,1},
                        {1,1,1,1},
                        {1,1,1,1},
                        {1,1,1,1}};

        int[][] mat2 = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        System.out.println(solution(mat2));
    }

    private static int solution(int[][] mat){

        int len = mat.length;
        int sum = 0;

        for(int i=0; i<len; i++){
            sum += mat[i][i] + mat[i][len - 1 -i];
        }

        return len % 2 == 0 ? sum : sum-mat[len / 2][len / 2];
    }
}
