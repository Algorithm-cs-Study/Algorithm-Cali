package programmers.level02.day15;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class _005_프로세스 {

    public static void main(String[] args) {
//        int solution = new _005_프로세스().solution(new int[]{2, 1, 3, 2}, 2);
        int solution = new _005_프로세스().solution(new int[]{1, 1, 9, 1, 1, 1}, 0);
        System.out.println("solution = " + solution);
    }

    /**
     * 최초풀이
     * 평균 1.04ms, 75.7MB
     */
    public int solution(int[] priorities, int location) {
        Queue<Node> queue = new LinkedList<>();


        int length = priorities.length;
        for (int i = 0; i < length; i++) {
            Node node = new Node(i, priorities[i]);
            queue.add(node);
        }

        Arrays.sort(priorities);
        int i = length - 1, max = priorities[i], index = 0;

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            if (node.getPriority() == max) {
                if (node.getIndex() == location) {
                    return index + 1;
                }
                index++;
                max = priorities[--i];
                continue;
            }

            queue.add(node);
        }

        return 0;
    }

    public class Node {
        private int index;

        private int priority;

        public Node(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }

        public int getIndex() {
            return index;
        }

        public int getPriority() {
            return priority;
        }
    }

    /**
     * 문제 풀고 다른 사람 풀이 본 다음에 다시 풀어봤습니다.
     * 평균 0.76ms, 75.2MB
     */
    public int solutionRefactoring(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        int length = priorities.length;
        for (int priority : priorities) {
            queue.add(priority);
        }

        Arrays.sort(priorities);

        while (!queue.isEmpty()) {
            int priority = queue.poll();
            int size = queue.size();
            location--;
            if (priority == priorities[size]) {
                if (location < 0) {
                    return length - size;
                }
            } else {
                if (location < 0) {
                    location = size;
                }
                queue.add(priority);
            }
        }

        return answer;
    }
}
