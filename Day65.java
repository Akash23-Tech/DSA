// Minimum number of bracket reversals needed to make an expression balanced.

import java.util.Stack;

class Solution {
    static int minReversals(String s) {
        int n = s.length();

        // If odd length, cannot be balanced
        if (n % 2 != 0) return -1;

        Stack<Character> stack = new Stack<>();

        // Remove balanced pairs
        for (char ch : s.toCharArray()) {
            if (ch == '{') {
                stack.push(ch);
            } else {
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop(); // balanced pair
                } else {
                    stack.push(ch);
                }
            }
        }

        // Count remaining unbalanced brackets
        int open = 0, close = 0;

        while (!stack.isEmpty()) {
            if (stack.pop() == '{') open++;
            else close++;
        }

        // Calculate reversals
        return (open + 1) / 2 + (close + 1) / 2;
    }

    public static void main(String[] args) {
        String s = "}{{}}{{{";
        System.out.println(minReversals(s));
    }
}
