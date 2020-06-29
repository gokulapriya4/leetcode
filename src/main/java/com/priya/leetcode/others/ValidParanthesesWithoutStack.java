package main.java.com.priya.leetcode.others;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/721/
public class ValidParanthesesWithoutStack {

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        StringBuilder sb = new StringBuilder(s);

        while (sb.length() > 0) {
            int index = 0;
            while (index < sb.length() && !(sb.charAt(index) == '}' || sb.charAt(index) == ')' || sb.charAt(index) == ']')) {
                index++;
            }
            if (index > 0 && index < sb.length()) {
                if ((sb.charAt(index) == ']' && sb.charAt(index - 1) == '[') || (sb.charAt(index) == '}' && sb.charAt(index - 1) == '{')
                        || (sb.charAt(index) == ')' && sb.charAt(index - 1) == '(')) {
                    sb.replace(index - 1, index + 1, "");
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "(({}[]))";
        ValidParanthesesWithoutStack obj = new ValidParanthesesWithoutStack();
        System.out.println(obj.isValid(s));
    }
}
