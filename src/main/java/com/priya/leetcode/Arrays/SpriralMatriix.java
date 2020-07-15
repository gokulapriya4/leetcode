package main.java.com.priya.leetcode.Arrays;

import java.util.List;

//https://leetcode.com/problems/spiral-matrix/
public class SpriralMatriix {

    public static List<Integer> spiralOrder(int[][] matrix) {
        int index = 0, colLength = matrix[0].length, iteration = 0, bottomUpIndex = matrix.length - 1;

        while (iteration < (matrix.length - matrix.length / 2)) {
            for (int i = index; i < colLength; i++) {
                System.out.println(matrix[index][i]);
            }

            for (int j = index + 1; j < bottomUpIndex; j++) {
                System.out.println(matrix[j][colLength - 1]);
            }

            for (int k = colLength - 2; k >= index; k--) {
                System.out.println(matrix[colLength - 1][k]);
            }

            for (int l = bottomUpIndex - 1; l > 0 && bottomUpIndex != index + 1; l--) {
                System.out.println(matrix[l][index]);
            }

            index++;
            colLength--;
            iteration++;
            bottomUpIndex--;
            System.out.println("next spiral");
        }
        return null;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 17},
                {5, 6, 7, 8, 18},
                {9, 10, 11, 12, 19}
        };

        /*int[][] matrix =
                {
                        {1, 2, 3, 4, 5, 6, 7, 8, 9},
                        {10, 11, 12, 13, 14, 15, 16, 17, 18},
                        {19, 20, 21, 22, 23, 24, 5, 26, 27},
                        {28, 29, 30, 31, 32, 33, 34, 35},
                        {3, 37, 38, 39, 40, 41, 42, 43, 44}
                };*/

        spiralOrder(matrix);
    }
}
