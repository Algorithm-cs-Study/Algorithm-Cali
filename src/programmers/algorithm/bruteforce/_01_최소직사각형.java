package programmers.algorithm.bruteforce;

import java.util.stream.IntStream;

public class _01_최소직사각형 {

    public static void main(String[] args) {
        new _01_최소직사각형();
    }

    public _01_최소직사각형() {
        int[][] val1 = new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int[][] val2 = new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int[][] val3 = new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
        int[][][] val = new int[][][]{val1, val2, val3};
        IntStream.range(0, val.length).forEach(i -> System.out.println(solution(val[i])));
    }

    public int solution(int[][] sizes) {
        int height = 0, width = 0;
        for (int[] size : sizes) {
            height = Math.max(Math.max(size[0], size[1]), height);
            width = Math.max(Math.min(size[0], size[1]), width);
        }
        return height * width;
    }
}
