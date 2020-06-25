package main.java.com.priya.leetcode.Arrays;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/546/
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new RuntimeException("Exectations failed");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(nums, target);
        System.out.println(result[0] + " :: " + result[1]);
    }
}
