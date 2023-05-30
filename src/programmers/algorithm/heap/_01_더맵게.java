package programmers.algorithm.heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class _01_더맵게 {

    public static void main(String[] args) {
        int solution = new _01_더맵게().solution(new int[]{1, 3, 4, 2, 9, 10, 12}, 7);
        System.out.println("solution = " + solution);
    }

    public int solution(int[] scoville, int K) {
        Queue<Integer> heap = createHeap(scoville);
        int answer = 0;
        int first;
        while ((first = heap.poll()) < K) {
            if (heap.isEmpty()) {
                return -1;
            }

            answer++;
            int second = heap.poll();
            int mixScoville = mixScoville(first, second);
            heap.add(mixScoville);
            printHeap(heap);
        }

        return answer;
    }

    private Queue<Integer> createHeap(int[] scoville) {
        Queue<Integer> heap = new PriorityQueue<>();
        for (int sc : scoville) {
            heap.add(sc);
        }

        return heap;
    }

    private int mixScoville(int first, int second) {
        return first + second * 2;
    }

    private void printHeap(Queue<Integer> heap) {
        StringBuilder sb = new StringBuilder();
        for (Integer integer : heap) {
            sb.append(integer).append(", ");
        }
        int length = sb.length();
        sb.delete(length - 2, length);
        System.out.println(sb);
    }
}
