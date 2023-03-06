package programmers.level01.day06;

import java.util.Arrays;
import java.util.Collections;

public class _009_과일장수 {

    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int length = score.length;
        Integer[] boxedScore = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedScore, Collections.reverseOrder());

        int start = 0, end = m;
        for (int i = 0; i < length / m; i++) {
            Integer[] box = Arrays.copyOfRange(boxedScore, start, end);
            Arrays.sort(box);
            answer += box[0] * m;
            start = end;
            end += m;
        }
        return answer;
    }
}
