package programmers.level01.day07;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _003_체육복 {

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        int[] clothes = new int[n + 1];
        List<Integer> lostList = Arrays.stream(lost).mapToObj(i -> i).sorted()
            .collect(Collectors.toList());
        List<Integer> reverseList = Arrays.stream(reserve).mapToObj(i -> i)
            .collect(Collectors.toList());

        for (int i : reserve) {
            if (lostList.contains(i)) continue;
            clothes[i]++;
        }

        for (Integer integer : lostList) {
            if (reverseList.contains(integer)) {
                answer++;
                continue;
            }

            if (integer != 1 && clothes[integer - 1] == 1) {
                clothes[integer - 1]--;
                answer++;
                continue;
            }

            if (integer != n && clothes[integer + 1] == 1) {
                clothes[integer + 1]--;
                answer++;
            }
        }

        return answer;
    }
}
