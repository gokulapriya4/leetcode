package main.java.com.priya.leetcode.Strings;

import java.util.Arrays;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/887/
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";

        int minLength = Arrays.stream(strs).map(String::length).mapToInt(a -> a).min().orElse(0);

        char[] chars = strs[0].toCharArray();
        int c;
        for (c = 0; c < minLength; c++) {
            for (int i = 0; i < strs.length; i++) {
                if (chars[c] != strs[i].charAt(c)) {
                    return strs[0].substring(0, c);
                }
            }
        }
        return strs[0].substring(0, c);
    }

    public static void main(String[] args) {
        String[] strs = {"aa", "a"};
        LongestCommonPrefix obj = new LongestCommonPrefix();
        System.out.println(obj.longestCommonPrefix(strs));
    }
}
