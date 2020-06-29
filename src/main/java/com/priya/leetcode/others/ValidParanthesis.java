package main.java.com.priya.leetcode.others;

import java.util.Stack;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/721/
public class ValidParanthesis {

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.size() > 0 && (
                    (s.charAt(i) == ']' && stack.peek() == '[') ||
                            (s.charAt(i) == '}' && stack.peek() == '{') ||
                            (s.charAt(i) == ')' && stack.peek() == '(')
            )) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.size() == 0;
    }

    public static void main(String[] args) {
        String s = "[(])]";
        ValidParanthesis obj = new ValidParanthesis();
        System.out.println(obj.isValid(s));
    }
}
