package main.java.com.priya.leetcode.Strings;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/880/
public class ReverseInteger {

    public int reverse(int x) {
        String reversedString = new StringBuilder(String.valueOf(Math.abs(x))).reverse().toString();
        try {
            return Integer.valueOf(reversedString) * (x < 0 ? -1 : 1);
        } catch (NumberFormatException ex) {
            return 0;
        }
    }

    public static void main(String[] args) {
        int i = 1534236469;
        ReverseInteger obj = new ReverseInteger();
        System.out.println(obj.reverse(i));
    }
}
