package programmers.level01.day04;

import java.util.Arrays;

public class _009_삼총사 {

    public int solution(int[] number) {
        int answer = 0;
        int length = number.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int solution = new _009_삼총사().solution(new int[]{-2, 3, 0, 2, -5});
        System.out.println("solution = " + solution);
    }
}
