package programmers.level01.day11;

import java.util.Stack;

public class _004_올바른괄호 {

    boolean solution(String s) {
        int length = s.length();

        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        stack.push(chars[0]);

        for (int i = 1; i < length; i++) {
            char now = chars[i];
            if (stack.isEmpty() && now == '(') {
                stack.push(now);
                continue;
            }

            char prev = stack.peek();
            if (prev == '(' && now == ')') {
                stack.pop();
                continue;
            }

            stack.push(now);
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        boolean solution = new _004_올바른괄호().solution("");
        System.out.println("solution = " + solution);
    }
}
