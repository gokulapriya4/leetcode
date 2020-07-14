package main.java.com.priya.leetcode.Math;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountPrimes {

    public int countPrimes(int n) {
        List<Integer> collect = IntStream.range(1, n + 1).boxed().filter(num -> num % 2 != 0).collect(Collectors.toList());
        return 1;

    }

    public static void main(String[] args) {
        int n = 10;
        CountPrimes obj = new CountPrimes();
        System.out.println(obj.countPrimes(n));
    }
}
