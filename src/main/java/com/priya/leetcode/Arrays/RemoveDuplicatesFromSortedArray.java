package main.java.com.priya.leetcode.Arrays;


//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        int currentIndexToPlace = 1;
        for (int i = 1; i < nums.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (nums[j] == nums[i]) {
                    isDuplicate = true;
                }
            }

            if (!isDuplicate) {
                nums[currentIndexToPlace] = nums[i];
                currentIndexToPlace++;
            }
        }

        return currentIndexToPlace;
    }

    public int removeDuplicatesRevisitOne(int[] nums) {
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index]) {
                index++;
                nums[index] = nums[i];
            }
        }
        return index + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        //System.out.println("Fianl Result: " + obj.removeDuplicates(nums));
        System.out.println("Fianl Result: " + obj.removeDuplicatesRevisitOne(nums));
    }

}