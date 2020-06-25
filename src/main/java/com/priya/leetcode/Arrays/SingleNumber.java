package main.java.com.priya.leetcode.Arrays;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/
public class SingleNumber {

    //Chsen this approach since they asked not to use extra memory
    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                return nums[i];
            }
        }
        return nums[0];
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        SingleNumber singleNumber = new SingleNumber();
        System.out.println(singleNumber.singleNumber(nums));
    }

}
