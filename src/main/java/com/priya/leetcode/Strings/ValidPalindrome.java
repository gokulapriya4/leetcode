package main.java.com.priya.leetcode.Strings;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/883/
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reverse = new StringBuilder(s1).reverse().toString().toLowerCase();
        return s1.equals(reverse);
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        ValidPalindrome obj = new ValidPalindrome();
        System.out.println(obj.isPalindrome(s));
    }
}
