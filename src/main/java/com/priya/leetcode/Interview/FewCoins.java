package main.java.com.priya.leetcode.Interview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FewCoins {

    public static int fewestCoins(String coins) {
        String targetString = Arrays.stream(coins.split("")).distinct().collect(Collectors.joining());

        int[] target = new int[256];
        int[] source = new int[256];

        for (int i = 0; i < targetString.length(); i++)
            target[targetString.charAt(i)]++;

        int start = 0, minimumLength = coins.length();

        int matchedCharCount = 0;
        for (int j = 0; j < coins.length(); j++) {
            source[coins.charAt(j)]++;

            if (target[coins.charAt(j)] != 0 && source[coins.charAt(j)] <= target[coins.charAt(j)])
                matchedCharCount++;
            if (matchedCharCount == targetString.length()) {
                while (source[coins.charAt(start)] > target[coins.charAt(start)] || target[coins.charAt(start)] == 0) {

                    if (source[coins.charAt(start)] > target[coins.charAt(start)])
                        source[coins.charAt(start)]--;
                    start++;
                }
                int windowLength = j - start + 1;
                if (minimumLength > windowLength) {
                    minimumLength = windowLength;
                }
            }
        }
        return minimumLength;
    }


    public static void main(String[] args) {
        System.out.println(fewestCoins("aabcce"));
    }
}
