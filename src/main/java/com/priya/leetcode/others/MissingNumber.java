package main.java.com.priya.leetcode.others;

import java.util.Arrays;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/722/
public class MissingNumber {

    public int missingNumber(int[] nums) {
        int i;
        Arrays.sort(nums);

        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        MissingNumber obj = new MissingNumber();
        System.out.println(obj.missingNumber(nums));
    }
}
