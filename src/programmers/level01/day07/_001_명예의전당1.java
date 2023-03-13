package programmers.level01.day07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _001_명예의전당1 {

    public int[] solution(int k, int[] score) {
        int length = score.length;
        int[] answer = new int[length];
        int min = Integer.MAX_VALUE;
        List<Integer> ranking = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            if (i < k) {
                int sc = score[i];
                answer[i] = min = Math.min(sc, min);
                ranking.add(sc);
                continue;
            }
            ranking.add(score[i]);
            Collections.sort(ranking);
            answer[i] = ranking.get(i - k + 1);
        }

        return answer;
    }
}
