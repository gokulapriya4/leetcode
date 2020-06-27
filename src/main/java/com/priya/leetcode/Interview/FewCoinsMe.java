package main.java.com.priya.leetcode.Interview;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class FewCoinsMe {

    public static int fewestCoins(String coins) {
        Set<String> distinctChars = getDistinctChars(coins);
        int minLength = coins.length();

        for (int i = 0; i < coins.length() - distinctChars.size(); i++) {
            boolean matchFound = false;
            for (int j = i + distinctChars.size(); j <= coins.length() && !matchFound; j++) {

                String substring = coins.substring(i, j);
                if (substring.length() < minLength && hasAllChars(substring, distinctChars)) {
                    minLength = substring.length();
                    matchFound = true;
                }
            }
        }
        return minLength;
    }

    public static boolean hasAllChars(String s, Set<String> targetChars) {
        return getDistinctChars(s).containsAll(targetChars);
    }

    public static Set<String> getDistinctChars(String s) {
        return Arrays.stream(s.split("")).collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        System.out.println(fewestCoins("aabcce"));
    }
}
