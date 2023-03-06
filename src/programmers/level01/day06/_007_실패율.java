package programmers.level01.day06;

import java.util.Arrays;

public class _007_실패율 {

    public int[] solution(int N, int[] stages) {
        int[] failCounts = new int[N + 2];

        for (int stage : stages) {
            failCounts[stage]++;
        }

        double[] failPercents = new double[N + 1];
        int numberOfPeople = stages.length;
        for (int i = 1; i < failCounts.length - 1; i++) {
            int failCount = failCounts[i];
            failPercents[i] = (double) failCount / numberOfPeople;
            numberOfPeople = numberOfPeople - failCount < 1 ? 1 : numberOfPeople - failCount;
        }

        Integer[] indexes = new Integer[N];
        for (int i = 0; i < N; i++) {
            indexes[i] = i + 1;
        }

        Arrays.sort(indexes, (i, j) -> {
            if (failPercents[i] != failPercents[j]) {
                return -Double.compare(failPercents[i], failPercents[j]);
            }
            return i - j;
        });

        return Arrays.stream(indexes).mapToInt(i -> i).toArray();
    }
}
