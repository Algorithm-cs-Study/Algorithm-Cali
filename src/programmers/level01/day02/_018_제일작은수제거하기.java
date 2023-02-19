package programmers.level01.day02;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class _018_제일작은수제거하기 {

    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(a -> a != min).toArray();
    }

    public static void main(String[] args) {

        int[] solution = new _018_제일작은수제거하기().solution(new int[]{1, 2, 3, 4});
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}
