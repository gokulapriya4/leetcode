package main.java.com.priya.leetcode;

import java.util.Arrays;
import java.util.List;

public class ReductorArray {

    public static int comparatorValue(List<Integer> a, List<Integer> b, int d) {
        return (int) a.stream().filter(eleA -> b.stream().allMatch(eleB -> Math.abs(eleA - eleB) > d)).count();
    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(3, 1, 5);
        List<Integer> b = Arrays.asList(5, 6, 7);
        int d = 2;
        System.out.println(comparatorValue(a, b, d));
    }
}
