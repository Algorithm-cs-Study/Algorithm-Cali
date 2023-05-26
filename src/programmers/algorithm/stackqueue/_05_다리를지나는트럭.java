package programmers.algorithm.stackqueue;

import java.util.LinkedList;
import java.util.Queue;

public class _05_다리를지나는트럭 {

    public static void main(String[] args) {
        new _05_다리를지나는트럭().grading();
    }

    private void grading() {
        int[] lengths = new int[]{2, 100, 100, 5};
        int[] weights = new int[]{10, 100, 100, 10};
        int[][] trucks = new int[][]{{7, 4, 5, 6}, {10}, {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
            {7, 1, 1, 1, 8, 2, 1}};
        int length = lengths.length;
        for (int i = 0; i < length; i++) {
            System.out.println(solution(lengths[i], weights[i], trucks[i]));
        }
    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum = 0;
        Queue<Integer> bridge = new LinkedList<>();

        for (int truckWeight : truck_weights) {
            while (true) {
                // 다리가 비었을 때
                if (bridge.isEmpty()) {
                    bridge.add(truckWeight);
                    answer++;
                    sum += truckWeight;
                    break;
                }

                // 다리가 가득 찼을 때 (더미 데이터인 0 포함한 사이즈)
                if (bridge.size() == bridge_length) {
                    sum -= bridge.poll();
                }

                // 다리 위에 새 트럭이 올라갈 수 있는 경우
                if (sum + truckWeight <= weight) {
                    bridge.add(truckWeight);
                    sum += truckWeight;
                    answer++;
                    break;
                }

                // 무게 제한으로 트럭이 올라갈 수 없는 경우
                bridge.add(0);
                answer++;
            }
        }

        return answer + bridge_length;
    }
}
