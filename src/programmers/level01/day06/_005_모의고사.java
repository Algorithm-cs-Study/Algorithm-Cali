package programmers.level01.day06;

import java.util.LinkedList;
import java.util.List;

public class _005_모의고사 {

    public int[] solution(int[] answers) {
        int i1 = getFirstManScore(answers);
        int i2 = getSecondManScore(answers);
        int i3 = getThirdManScore(answers);

        return getWinners(i1, i2, i3);
    }

    private int getFirstManScore(int[] answers) {
        int score = 0;
        for (int i = 0; i < answers.length; i++) {
            int firstManAnswer = i % 5 + 1;
            if (answers[i] == firstManAnswer) {
                score++;
            }
        }
        return score;
    }

    private int getSecondManScore(int[] answers) {
        int score = 0;
        int index = 0;
        int[] secondManAnswers = {1, 3, 4, 5};
        for (int i = 0; i < answers.length; i++) {
            int secondManAnswer = 0;
            if (i % 2 == 0) {
                secondManAnswer = 2;
            } else {
                secondManAnswer = secondManAnswers[index++];
                if (index == 4) index = 0;
            }

            if (answers[i] == secondManAnswer) {
                score++;
            }
        }
        return score;
    }

    private int getThirdManScore(int[] answers) {
        int score = 0;
        int index = 0;
        int[] thirdManAnswers = {3, 1, 2, 4, 5};
        for (int i = 0; i < answers.length; i++) {
            int thirdManAnswer = thirdManAnswers[index];
            if (answers[i] == thirdManAnswer) {
                score++;
            }
            if (i % 2 == 1) {
                index++;
                if (index == 5) index = 0;
            }
        }
        return score;
    }

    private int[] getWinners(int i1, int i2, int i3) {
        List<Integer> winners = new LinkedList<>();
        int maxScore = Math.max(Math.max(Math.max(Integer.MIN_VALUE, i1), i2), i3);
        if (maxScore == i1) winners.add(1);
        if (maxScore == i2) winners.add(2);
        if (maxScore == i3) winners.add(3);
        return winners.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] solution = new _005_모의고사().solution(new int[]{1, 2, 3, 4, 5});
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}
