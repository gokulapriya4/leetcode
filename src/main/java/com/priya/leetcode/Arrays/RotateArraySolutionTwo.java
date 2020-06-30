package main.java.com.priya.leetcode.Arrays;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/
public class RotateArraySolutionTwo {

    public void rotate(int[] nums, int k) {

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;
        RotateArraySolutionTwo obj = new RotateArraySolutionTwo();
        obj.rotate(nums, k);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
