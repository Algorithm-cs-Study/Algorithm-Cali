package programmers.algorithm.stackqueue;

import java.util.Stack;

public class _01_같은숫자는싫어 {

    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i : arr) {
            if (stack.isEmpty()) {
                stack.add(i);
                continue;
            }
            Integer prev = stack.peek();
            if (prev == i) {
                continue;
            }
            stack.add(i);
        }

        return stack.stream().mapToInt(i -> i).toArray();
    }
}
