package main.java.com.priya.leetcode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/
public class IntersectionOfTwoArrays {

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> intersection = new ArrayList<>();
        Map<Integer, Long> numberCountMap = Arrays.stream(nums1).boxed().collect(Collectors.groupingBy(num -> num, Collectors.counting()));
        for (int i : nums2) {
            if (numberCountMap.containsKey(i) && numberCountMap.get(i) > 0) {
                intersection.add(i);
                numberCountMap.put(i, numberCountMap.get(i) - 1);
            }
        }
        return intersection.stream().mapToInt(i-> i).toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {2, 2};

        IntersectionOfTwoArrays obj = new IntersectionOfTwoArrays();
        int[] intersect = obj.intersect(nums1, nums2);
        for (int i : intersect) {
            System.out.println(i);
        }
    }
}
