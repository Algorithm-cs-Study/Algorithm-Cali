package programmers.level02.day12;

import java.util.Arrays;
import java.util.Comparator;

public class _006_구명보트 {

    public static void main(String[] args) {
        int solution = new _006_구명보트().solution(new int[]{70, 50, 80, 50}, 100);
        System.out.println("solution = " + solution);
    }

    public int solution(int[] people, int limit) {
        int answer = 0;
        int length = people.length;
        int left = 0, right = length - 1;

        Integer[] peopleWeights = Arrays.stream(people).boxed().toArray(Integer[]::new);
        Arrays.sort(peopleWeights, Comparator.reverseOrder());

        while (left < right) {
            int sumWeight = peopleWeights[left] + peopleWeights[right];
            if (sumWeight > limit) {
                left++;
            } else {
                left++;
                right--;
            }
            answer++;
        }

        if (left == right) {
            answer++;
        }

        return answer;
    }
}
