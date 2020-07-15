package main.java.com.priya.leetcode.Arrays;

//https://leetcode.com/problems/minimum-size-subarray-sum/
public class MinimumSizeSubArraySumBetterSolution {
    //Got help from Leetcode
    public int minSubArrayLen(int s, int[] nums) {
        int sum = 0, k = 0, result = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum >= s) {
                while (true) {
                    if (sum - nums[k] >= s) {
                        sum = sum - nums[k];
                        k++;
                    } else {
                        result = Math.min(result, i - k + 1);
                        break;
                    }
                }
            }
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    public static void main(String[] args) {
        int s = 7;
        int nums[] = {2, 3, 1, 2, 4, 3, 6, 8};
        MinimumSizeSubArraySumBetterSolution obj = new MinimumSizeSubArraySumBetterSolution();
        System.out.println(obj.minSubArrayLen(s, nums));
    }
}
