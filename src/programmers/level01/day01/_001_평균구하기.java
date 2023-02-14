package programmers.level01.day01;

import java.util.Arrays;

public class _001_평균구하기 {

    public static void main(String[] args) {
        double solution = new _001_평균구하기().solution(new int[]{1, 2, 3, 4});
        System.out.println("solution = " + solution);
    }

    public double solution(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        return (double) sum / arr.length;
    }
}
