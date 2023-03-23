package programmers.level01.day09;

import java.util.Stack;
import java.util.stream.IntStream;

public class _002_햄버거만들기 {

    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i : ingredient) {
            stack.push(i);
            if (canMakeBurger(stack)) {
                makeBurger(stack);
                answer++;
            }
        }
        return answer;
    }

    private void makeBurger(Stack<Integer> stack) {
        IntStream.range(0, 4).forEach((i) -> stack.pop());
    }

    private boolean canMakeBurger(Stack<Integer> stack) {
        int size = stack.size();
        return size > 3 && ((stack.get(size - 4)) == 1 && (stack.get(size - 3)) == 2
            && (stack.get(size - 2)) == 3 && (stack.get(size - 1)) == 1);
    }
}
