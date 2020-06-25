package main.java.com.priya.leetcode;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/567/
public class MoveZeros {

    public void moveZeroes(int[] nums) {
        int nextIndexToFill = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nextIndexToFill] = nums[i];
                nextIndexToFill++;
            }
        }

        for (int i = nextIndexToFill; i < nums.length; i++) {
            nums[i] = 0;
        }

    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        MoveZeros moveZeros = new MoveZeros();
        moveZeros.moveZeroes(nums);
    }

}
