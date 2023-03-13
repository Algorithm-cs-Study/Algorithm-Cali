package programmers.level01.day07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _004_숫자짝꿍 {

    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] nums = new int[10];
        List<Integer> couples = new ArrayList<>();
        for (char aChar : X.toCharArray()) {
            nums[aChar - 48]++;
        }
        for (char aChar : Y.toCharArray()) {
            int e = aChar - 48;
            if (nums[e] > 0) {
                couples.add(e);
                nums[e]--;
            }
        }

        if (couples.isEmpty()) {
            return "-1";
        }

        Collections.sort(couples, Collections.reverseOrder());
        if (couples.get(0) == 0) {
            return "0";
        }
        for (Integer couple : couples) {
            answer.append(couple);
        }

        return answer.toString();
    }
}
