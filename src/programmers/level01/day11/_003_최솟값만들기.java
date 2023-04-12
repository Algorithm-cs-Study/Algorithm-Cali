package programmers.level01.day11;

import java.util.Arrays;
import java.util.Collections;

public class _003_최솟값만들기 {

    public int solution(int []A, int []B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        int length = A.length;
        for (int i = 0; i < length; i++) {
            int j = length - i - 1;
            answer += A[i] * B[j];
        }

        return answer;
    }

    public static void main(String[] args) {
        int solution = new _003_최솟값만들기().solution(new int[]{1, 4, 2}, new int[]{5, 4, 4});
        System.out.println("solution = " + solution);
    }
}
