package main.java.com.priya.leetcode.Arrays;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/
public class RotateArraySolutionTwo {

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverseArray(nums, 0, nums.length - 1);
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, nums.length - 1);
    }

    public int[] reverseArray(int[] nums, int startIndex, int endIndex) {
        int temp;

        while (endIndex > startIndex) {
            temp = nums[startIndex];
            nums[startIndex] = nums[endIndex];
            nums[endIndex] = temp;

            startIndex++;
            endIndex--;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        //7 1 2 3 4 5 6
        //6 7 1 2 3 4 5
        //5 6 7 1 2 3 4

        //7 6 5 4 3 2 1
        int k = 3;

        RotateArraySolutionTwo obj = new RotateArraySolutionTwo();
        obj.rotate(nums, k);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
