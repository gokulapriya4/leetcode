package main.java.com.priya.leetcode.Interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BridgeCrossing {

    public static int minimalTime(List<Integer> list) {
        int totalTime = 0;
        if (list.size() < 3) {
            return Math.max(list.get(0), list.get(1));
        }
        Collections.sort(list, Comparator.reverseOrder());

        Integer secondMinTime = list.get(list.size() - 2);
        Integer firstMinTime = list.get(list.size() - 1);

        totalTime = firstMinTime + secondMinTime;

        boolean isFirstMinCrosseed = false, isSecondMinCrossed = true;
        for (int i = 0; i < list.size() - 2; i += 2) {

            totalTime += list.get(i);
            if (i == list.size() - 3) {
                return totalTime;
            }

            if (isFirstMinCrosseed && !isSecondMinCrossed) {
                totalTime += firstMinTime;
                isFirstMinCrosseed = false;
            } else if (isSecondMinCrossed && !isFirstMinCrosseed) {
                totalTime += secondMinTime;
                isSecondMinCrossed = false;
            } else {
                totalTime += secondMinTime + firstMinTime;
                isFirstMinCrosseed = false;
                isSecondMinCrossed = true;
            }

            if (!isFirstMinCrosseed && !isSecondMinCrossed) {
                if (i + 2 < list.size() - 2) {
                    totalTime += firstMinTime + secondMinTime;
                } else {
                    totalTime += secondMinTime;
                }

                isFirstMinCrosseed = true;
                isSecondMinCrossed = true;
            }
        }
        if (!isFirstMinCrosseed && !isSecondMinCrossed) {
            totalTime += secondMinTime;
        }

        return totalTime;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 50, 75, 100, 150, 200);
        System.out.println(minimalTime(list));
    }
}
