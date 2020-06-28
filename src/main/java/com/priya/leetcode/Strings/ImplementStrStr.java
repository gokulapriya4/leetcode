package main.java.com.priya.leetcode.Strings;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/885/
public class ImplementStrStr {

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0 || needle.equals(" ")) {
            return 0;
        }
        if (needle.length() > haystack.length()) {
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0) && haystack.length() >= i + needle.length() && needle.equals(haystack.substring(i, i + needle.length()))) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ImplementStrStr obj = new ImplementStrStr();
        String haystack = "aaaaa";
        String needle = "bba";

        System.out.println(obj.strStr(haystack, needle));
    }
}
