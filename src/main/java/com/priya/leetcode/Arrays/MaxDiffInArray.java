package main.java.com.priya.leetcode.Arrays;

public class MaxDiffInArray {

    public static int maxTrailing(int[] input) {
        int result = -1, maxElement = input[input.length - 1];

        for (int i = input.length - 2; i >= 0; i--) {
            if (input[i] > maxElement) {
                maxElement = input[i];
            } else if (maxElement - input[i] > result) {
                result = maxElement - input[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {5, 10, 2, 6, 1};
        //1,2,3,4,5 --4
        //1,2,3,5,4 --4
        //2,3,4,5,1 --3
        //5, 10, 2, 6, 1 -- 5
        System.out.println(maxTrailing(input));
    }

}
