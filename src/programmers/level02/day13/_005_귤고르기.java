package programmers.level02.day13;

import java.util.Arrays;
import java.util.Collections;

public class _005_귤고르기 {

    public static void main(String[] args) {
        int solution = new _005_귤고르기().solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3});
        System.out.println("solution = " + solution);
    }

    public int solution(int k, int[] tangerines) {
        int answer = 0;

        int max = Arrays.stream(tangerines).max().getAsInt();
        Integer[] countOfTangerine = new Integer[max + 1];
        for (int i = 0; i <= max; i++) {
            countOfTangerine[i] = 0;
        }

        for (Integer tangerine : tangerines) {
            countOfTangerine[tangerine]++;
        }

        Arrays.sort(countOfTangerine, Collections.reverseOrder());

        int sum = 0;
        for (int count : countOfTangerine) {
            answer++;
            sum += count;
            if (sum >= k) {
                break;
            }
        }

        return answer;
    }
}
