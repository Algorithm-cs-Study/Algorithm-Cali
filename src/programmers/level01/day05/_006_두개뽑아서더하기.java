package programmers.level01.day05;

import java.util.Set;
import java.util.TreeSet;

public class _006_두개뽑아서더하기 {

    public int[] solution(int[] numbers) {
        Set<Integer> answer = new TreeSet<>();
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                answer.add(numbers[i] + numbers[j]);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] solution = new _006_두개뽑아서더하기().solution(new int[]{2, 1, 3, 4, 1});
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}
