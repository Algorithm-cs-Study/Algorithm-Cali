package programmers.algorithm.stackqueue;

import java.util.Stack;

public class _03_올바른괄호 {

    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        char[] brackets = s.toCharArray();
        for (char currBracket : brackets) {
            if (stack.isEmpty()) {
                if (currBracket == ')') {
                    return false;
                }
                stack.add(currBracket);
                continue;
            }

            char prevBracket = stack.peek();
            if (prevBracket == '(' && currBracket == ')') {
                stack.pop();
                continue;
            }

            stack.add(currBracket);
        }

        return stack.isEmpty();
    }
}
