package main.java.com.priya.leetcode;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/
public class PlusOne {

    public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + carry == 10) {
                digits[i] = 0;
                carry = 1;
            } else {
                digits[i] = digits[i] + 1;
                return digits;
            }
        }

        if (carry == 1) {
            int[] digitCopy = new int[digits.length + 1];
            digitCopy[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                digitCopy[i + 1] = digits[i];
            }
            return digitCopy;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {9};
        PlusOne plusOne = new PlusOne();
        int[] ints = plusOne.plusOne(digits);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
