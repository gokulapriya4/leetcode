package main.java.com.priya.leetcode.Arrays;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/769/
public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        List<Integer> rowList = new ArrayList<>();
        List<Integer> columnList = new ArrayList<>();

        List<Integer> first3D = new ArrayList<>();
        List<Integer> second3D = new ArrayList<>();
        List<Integer> third3D = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            if (i % 3 == 0) {
                first3D.clear();
                second3D.clear();
                third3D.clear();
            }

            for (int j = 0; j < board[i].length; j++) {
                int element = board[i][j];
                if (rowList.contains(element) || columnList.contains((int) board[j][i])) {
                    return false;
                }

                if (element != '.') {
                    rowList.add(element);
                }

                if (board[j][i] != '.') {
                    columnList.add((int) board[j][i]);
                }

                if (element == '.')
                    continue;

                if (j < 3) {
                    if (first3D.contains(element))
                        return false;
                    first3D.add(element);
                } else if (j < 6) {
                    if (second3D.contains(element))
                        return false;
                    second3D.add(element);
                } else {
                    if (third3D.contains(element))
                        return false;
                    third3D.add(element);
                }

            }
            rowList.clear();
            columnList.clear();
        }

        return true;
    }

    public static void main(String[] args) {

        char[][] board =
                {
                        {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                        {'3', '.', '.', '.', '4', '6', '5', '.', '.'},
                        {'.', '.', '5', '.', '2', '.', '.', '.', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '3', '.', '.', '.', '.', '.', '.', '1'},
                        {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', '.', '.', '.', '6', '.', '.'},
                        {'.', '.', '.', '.', '.', '5', '.', '6', '.'},
                        {'.', '.', '.', '9', '.', '.', '.', '.', '.'}
                };
        ValidSudoku obj = new ValidSudoku();
        System.out.println(obj.isValidSudoku(board));
    }
}
