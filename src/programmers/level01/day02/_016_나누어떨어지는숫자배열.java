package programmers.level01.day02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _016_나누어떨어지는숫자배열 {

    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new LinkedList<>();
        for (int i : arr) {
            if (i % divisor == 0) {
                answer.add(i);
            }
        }
        if (answer.size() == 0) {
            answer.add(-1);
        }
        return answer.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] solution = new _016_나누어떨어지는숫자배열().solution(new int[]{5, 9, 7, 10}, 5);
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}
