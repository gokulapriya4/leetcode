package main.java.com.priya.leetcode.Arrays;

//https://leetcode.com/problems/minimum-size-subarray-sum/
public class MinimumSizeSubArraySumBetterSolution {

    public int minSubArrayLen(int s, int[] nums) {
        return 1;
    }

    public static void main(String[] args) {
        int s = 7;
        int nums[] = {2, 3, 1, 2, 4, 3, 6, 8};
        MinimumSizeSubArraySumBetterSolution obj = new MinimumSizeSubArraySumBetterSolution();
        System.out.println(obj.minSubArrayLen(s, nums));
    }
}
