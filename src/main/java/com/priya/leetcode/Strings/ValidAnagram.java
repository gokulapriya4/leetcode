package main.java.com.priya.leetcode.Strings;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/882/
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] source = new int[256];
        int[] target = new int[256];

        for (int i = 0; i < s.length(); i++) {
            source[s.charAt(i)]++;
            target[t.charAt(i)]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if(source[s.charAt(i)] != target[s.charAt(i)]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "aagaram";

        ValidAnagram obj = new ValidAnagram();
        System.out.println(obj.isAnagram(s, t));
    }
}
