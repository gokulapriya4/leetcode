package main.java.com.priya.leetcode.Arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        int distinctElementsSize = Arrays.stream(nums).boxed().distinct().collect(Collectors.toList()).size();
        return nums.length != distinctElementsSize;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        System.out.println(containsDuplicate.containsDuplicate(nums));
    }
}
