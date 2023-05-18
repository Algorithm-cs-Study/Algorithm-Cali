package programmers.algorithm.stackqueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class _04_프로세스 {

    public int solution(int[] priorities, int location) {
        int length = priorities.length;
        Queue<Integer> queue = getArrayToQueue(priorities);
        Arrays.sort(priorities);

        while (!queue.isEmpty()) {

            int task = queue.poll();
            int size = queue.size();
            int max = priorities[size];

            if (max == task) {
                if (0 == location) {
                    return length - size;
                }
            } else {
                queue.add(task);
            }

            location = location == 0 ? size : location - 1;
        }

        return -1;
    }

    private Queue<Integer> getArrayToQueue(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i : arr) {
            queue.add(i);
        }
        return queue;
    }
}
