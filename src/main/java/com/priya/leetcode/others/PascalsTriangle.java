package main.java.com.priya.leetcode.others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/601/
public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        result.add(Arrays.asList(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);

            List<Integer> previousRows = result.get(i - 1);

            for (int j = 1; j < i; j++) {
                currentRow.add(previousRows.get(j - 1) + previousRows.get(j));
            }

            currentRow.add(1);
            result.add(currentRow);
        }

        return result;
    }

    public static void main(String[] args) {
        PascalsTriangle obj = new PascalsTriangle();
        System.out.println(obj.generate(5));
    }
}
