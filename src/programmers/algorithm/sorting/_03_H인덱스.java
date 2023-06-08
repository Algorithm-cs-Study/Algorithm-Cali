package programmers.algorithm.sorting;

import java.util.Arrays;

public class _03_H인덱스 {

    public static void main(String[] args) {
        int solution = new _03_H인덱스().solution(new int[]{3, 0, 6, 1, 5});
        System.out.println(solution);
    }

    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int length = citations.length;
        int number = 0;
        for (int i = length - 1; i >= 0; i--) {
            number++;
            if (number <= citations[i]) {
                answer = number;
            } else {
                break;
            }
        }

        return answer;
    }
}
