package programmers.algorithm.sorting;

import java.util.Arrays;

public class _01_K번째수 {

    public static void main(String[] args) {
        // [1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
        int[] array = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] solution = new _01_K번째수().solution(array, commands);
        for (int i : solution) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    public int[] solution(int[] array, int[][] commands) {
        int length = commands.length;
        int[] answer = new int[length];
        for (int i = 0; i < length; i++) {
            answer[i] = getNumber(array, commands[i]);
        }

        return answer;
    }

    private int getNumber(int[] array, int[] command) {
        int start = command[0] - 1;
        int end = command[1];
        int index = command[2] - 1;
        int[] subArray = Arrays.copyOfRange(array, start, end);
        Arrays.sort(subArray);
        return subArray[index];
    }
}
