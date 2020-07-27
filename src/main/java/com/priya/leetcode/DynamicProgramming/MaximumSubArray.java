package main.java.com.priya.leetcode.DynamicProgramming;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/566/
public class MaximumSubArray {

    public int maxSubArray(int[] nums) {
        int maxSum = nums[0], sumSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > sumSoFar + nums[i]) {
                sumSoFar = nums[i];
            } else {
                sumSoFar = sumSoFar + nums[i];
            }
            if(sumSoFar > maxSum) {
                maxSum =  sumSoFar;
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
