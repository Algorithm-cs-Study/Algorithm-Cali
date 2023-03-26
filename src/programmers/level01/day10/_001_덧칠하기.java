package programmers.level01.day10;

import java.util.Arrays;

public class _001_덧칠하기 {

    public static void main(String[] args) {
//        int solution = new _001_덧칠하기().solution(8, 4, new int[]{2, 3, 6});
//        int solution = new _001_덧칠하기().solution(8, 4, new int[]{1, 3});
        int solution = new _001_덧칠하기().solution(8, 1, new int[]{1, 2, 3, 4});
        System.out.println("solution = " + solution);
    }

    public int solution(int n, int m, int[] section) {
        int answer = 1;
        Arrays.sort(section);
        int length = section.length;
        for (int i = 1, j = 0; i < length; i++) {
            int prev = section[j];
            int next = section[i];
            if (next - prev >= m) {
                answer++;
                j = i;
            }
        }
        return answer;
    }
}
