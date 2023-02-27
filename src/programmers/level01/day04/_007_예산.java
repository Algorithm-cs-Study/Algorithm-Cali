package programmers.level01.day04;

import java.util.Arrays;

public class _007_예산 {

    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int count = 0;
        for (int i : d) {
            budget -= i;
            if (budget < 0) {
                break;
            }
            count++;
        }
        return count;
    }
}
