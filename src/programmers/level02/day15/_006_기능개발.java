package programmers.level02.day15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _006_기능개발 {

    public static void main(String[] args) {
//        int[] solution = new _006_기능개발().solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
        int[] solution = new _006_기능개발().solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }

    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        int length = progresses.length;

        Queue queue = new LinkedList();
        for (int i = 0; i < length; i++) {
            int speed = speeds[i];
            int remaining = 100 - progresses[i];

            int period = calculatePeriod(speed, remaining);


        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

    private int calculatePeriod(int speed, int remaining) {
        return remaining % speed == 0 ? remaining / speed : remaining / speed + 1;
    }
}
