package programmers.algorithm.hash;

import java.util.Arrays;
import java.util.stream.Collectors;

public class _01_폰켓못 {

    public static void main(String[] args) {
        int solution = new _01_폰켓못().solution(new int[]{3, 1, 2, 3});
        System.out.println("solution = " + solution);
    }

    public int solution(int[] nums) {
        return Math.min(Arrays.stream(nums).mapToObj(i -> i).collect(Collectors.toSet()).size(), nums.length / 2);
    }
}
