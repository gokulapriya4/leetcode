package main.java.com.priya.leetcode.DynamicProgramming;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/566/
public class MaximumSubArray {

    public int maxSubArray(int[] nums) {
        int maxSum = 0, sumSoFar = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] + sumSoFar > maxSum) {
                maxSum = nums[i]+ sumSoFar;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        MaximumSubArray obj = new MaximumSubArray();
        System.out.println(obj.maxSubArray(arr));
    }

}
