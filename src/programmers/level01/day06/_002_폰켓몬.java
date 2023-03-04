package programmers.level01.day06;

import java.util.Arrays;
import java.util.stream.Collectors;

public class _002_폰켓몬 {

    public int solution(int[] nums) {
        int n = nums.length / 2;
        int i = Arrays.stream(nums).boxed().collect(Collectors.toSet()).size();
        return Math.min(n, i);
    }

    public static void main(String[] args) {
        int solution = new _002_폰켓몬().solution(new int[]{3,1,2,3});
        System.out.println("solution = " + solution);
    }
}
