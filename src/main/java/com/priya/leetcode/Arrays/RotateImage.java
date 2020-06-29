package main.java.com.priya.leetcode.Arrays;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/770/
public class RotateImage {

    public void rotate(int[][] matrix) {
        for (int i = matrix.length - 1; i > 0; i--) {
            for (int j = matrix[i].length; j > 0; j--) {

            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };
        RotateImage obj = new RotateImage();
        obj.rotate(matrix);
    }
}
