package main.java.com.priya.leetcode.Arrays;

//https://leetcode.com/problems/minimum-size-subarray-sum/
public class MinimumSizeSubArraySum {

    public int minSubArrayLen(int s, int[] nums) {
        int minLength = Integer.MAX_VALUE, sumTillNow;

        for (int i = 0; i < nums.length; i++) {
            sumTillNow = nums[i];
            if (sumTillNow >= s)
                return 1;
            for (int j = i + 1; j < nums.length; j++) {
                sumTillNow += nums[j];
                if (sumTillNow >= s && j - i + 1 < minLength) {
                    minLength = j - i + 1;
                }
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        int s = 7;
        int nums[] = {2, 3, 1, 2, 4, 3, 6, 8};
        MinimumSizeSubArraySum obj = new MinimumSizeSubArraySum();
        System.out.println(obj.minSubArrayLen(s, nums));
    }
}
