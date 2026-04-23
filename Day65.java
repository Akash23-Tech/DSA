// Minimum number of bracket reversals needed to make an expression balanced.

import java.util.Stack;

class Solution {
    static int minReversals(String s) {
        int n = s.length();

        if (n % 2 != 0) return -1;

        Stack<Character> stack = new Stack<>();

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
        int open = 0, close = 0;

        while (!stack.isEmpty()) {
            if (stack.pop() == '{') open++;
            else close++;
        }
        return (open + 1) / 2 + (close + 1) / 2;
    }

    public static void main(String[] args) {
        String s = "}{{}}{{{";
        System.out.println(minReversals(s));
        System.out.println("Day65 Dsa problem solved");
    }
}
