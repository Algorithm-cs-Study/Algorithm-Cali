package programmers.level02.day12;

import java.util.Stack;

public class _003_짝지어제거하기 {

    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        char[] words = s.toCharArray();

        for (char nowWord : words) {
            if (stack.isEmpty()) {
                stack.push(nowWord);
                continue;
            }

            Character prevWord = stack.peek();
            if (prevWord == nowWord) {
                stack.pop();
            } else {
                stack.push(nowWord);
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
