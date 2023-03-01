package programmers.level01.day05;

import java.util.Arrays;

public class _005_K번째수 {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;
        for (int[] command : commands) {
            answer[index] = getIndex(array, command);
            index++;
        }
        return answer;
    }

    private int getIndex(int[] array, int[] command) {
        int i = command[0] - 1;
        int j = command[1] - 1;
        int k = command[2] - 1;
        return Arrays.stream(array).skip(i).limit(j - i + 1).sorted().skip(k).findFirst()
            .getAsInt();
    }

    public static void main(String[] args) {
        int[] solution = new _005_K번째수().solution(new int[]{1, 5, 2, 6, 3, 7, 4},
            new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}
