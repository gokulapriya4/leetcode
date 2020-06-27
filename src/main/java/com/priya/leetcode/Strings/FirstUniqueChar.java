package main.java.com.priya.leetcode.Strings;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/881/
public class FirstUniqueChar {

    public int firstUniqChar(String s) {
        int requiredIndex = -1;
        int[] chars = new int[246];
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (chars[s.charAt(i)] == 1) {
                return i;
            }
        }
        return requiredIndex;
    }

    public static void main(String[] args) {
        String s = "leetoode";
        FirstUniqueChar obj = new FirstUniqueChar();
        System.out.println(obj.firstUniqChar(s));
    }
}
