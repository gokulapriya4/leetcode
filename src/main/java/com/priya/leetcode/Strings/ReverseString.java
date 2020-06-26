package main.java.com.priya.leetcode.Strings;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/879/
public class ReverseString {

    public void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            char tempChar = s[i];
            s[i] = s[j];
            s[j] = tempChar;
        }
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        char[] s = {'p', 'r', 'i', 'y', 'a'};
        reverseString.reverseString(s);
    }
}
