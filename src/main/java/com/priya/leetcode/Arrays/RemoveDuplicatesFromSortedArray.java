package main.java.com.priya.leetcode.Arrays;


//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        int currentIndexToPlace = 1;
        for (int i = 1; i < nums.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if(nums[j] == nums[i]) {
                    isDuplicate = true;
                }
            }

            if(!isDuplicate) {
                nums[currentIndexToPlace] = nums[i];
                currentIndexToPlace++;
            }
        }

        for (int i = 0; i < currentIndexToPlace; i++) {
            System.out.println(nums[i]);
        }
        return currentIndexToPlace;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();
        int[] nums = {1, 1, 2};
        System.out.println("Fianl Result: " + obj.removeDuplicates(nums));
    }

}