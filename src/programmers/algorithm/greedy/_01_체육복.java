package programmers.algorithm.greedy;

import java.util.Arrays;

public class _01_체육복 {

    public static void main(String[] args) {
        int solution = new _01_체육복().solution(5, new int[]{3,4}, new int[]{1,2,5});
        System.out.println(solution);
    }

    public int solution(int n, int[] lost, int[] reserve) {
        int[] students = createStudentArr(n, lost, reserve);

        int prev = 0;
        for (int i = 2; i <= n; i++) {
            prev++;
            int prevSt = students[prev];
            int currSt = students[i];
            if (canLendClothes(prevSt, currSt)) {
                students[prev] = 1;
                students[i] = 1;
            }
        }

        return countClothes(students);
    }

    private int[] createStudentArr(int n, int[] lost, int[] reserve) {
        int[] students = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            students[i] = 1;
        }
        for (int i : reserve) {
            students[i] = 2;
        }
        for (int i : lost) {
            students[i]--;
        }
        return students;
    }

    private boolean canLendClothes(int prev, int curr) {
        return (prev == 2 && curr == 0) || (prev == 0 && curr == 2);
    }

    private int countClothes(int[] students) {
        return (int) Arrays.stream(students).filter(i -> i > 0).count();
    }
}
