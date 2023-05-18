package programmers.algorithm.stackqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _02_기능개발 {

    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        int length = progresses.length;
        int number = 1;
        for (int i = 0; i < length; i++) {
            int progress = progresses[i];
            int speed = speeds[i];
            int remainTime = getRemainTime(progress, speed);

            if (i == 0) {
                stack.add(remainTime);
                continue;
            }

            int prevRemainTime = stack.peek();
            if (prevRemainTime >= remainTime) {
                number++;
                continue;
            }

            stack.add(remainTime);
            answer.add(number);
            number = 1;
        }
        answer.add(number);

        return answer.stream().mapToInt(i -> i).toArray();
    }

    private int getRemainTime(int progress, int speed) {
        double remainPer = 100 - progress;
        return (int) Math.ceil(remainPer / speed);
    }
}
