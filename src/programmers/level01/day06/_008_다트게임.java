package programmers.level01.day06;

import java.util.Arrays;
import java.util.List;

public class _008_다트게임 {

    public int solution(String dartResult) {
        int[] scores = Arrays.stream(dartResult.split("\\D+")).mapToInt(s -> Integer.parseInt(s))
            .toArray();
        char[] chars = dartResult.replaceAll("[0-9]", "").toCharArray();

        int index = 0;
        List<Character> pow = List.of('S', 'D', 'T');
        for (char c : chars) {

            if (c == '*') {
                scores[index - 1] *= 2;
                if (index != 1) scores[index - 2] *= 2;
                continue;
            }

            if (c == '#') {
                scores[index - 1] *= -1;
                continue;
            }

            if (pow.contains(c)) {
                scores[index] = (int) Math.pow(scores[index], pow.indexOf(c) + 1);
                index++;
            }
        }

        return Arrays.stream(scores).sum();
    }
}
