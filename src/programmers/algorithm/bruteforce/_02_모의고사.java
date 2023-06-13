package programmers.algorithm.bruteforce;

import java.util.ArrayList;
import java.util.List;

public class _02_모의고사 {

    public static void main(String[] args) {
        int[] solution = new _02_모의고사().solution(new int[]{1, 3, 2, 4, 2});
        for (int i : solution) {
            System.out.println(i);
        }
    }

    private static final int[] FIRST_PATTERN = new int[]{1, 2, 3, 4, 5};
    private static final int[] SECOND_PATTERN = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
    private static final int[] THIRD_PATTERN = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    public int[] solution(int[] answers) {
        int firstManScore = scoring(FIRST_PATTERN, answers);
        int secondManScore = scoring(SECOND_PATTERN, answers);
        int thirdManScore = scoring(THIRD_PATTERN, answers);

        return createWinnerArr(firstManScore, secondManScore, thirdManScore);
    }

    private int scoring(int[] pattern, int[] answers) {
        int score = 0, index = 0;
        int length = pattern.length;

        for (int answer : answers) {
            if (answer == pattern[index++ % length]) {
                score++;
            }
        }

        return score;
    }

    private int[] createWinnerArr(int fst, int snd, int trd) {
        List<Integer> winnerList = new ArrayList<>();

        int max = Math.max(fst, Math.max(snd, trd));
        if (max == fst) {
            winnerList.add(1);
        }

        if (max == snd) {
            winnerList.add(2);
        }

        if (max == trd) {
            winnerList.add(3);
        }

        return winnerList.stream().mapToInt(i -> i).toArray();
    }
}
