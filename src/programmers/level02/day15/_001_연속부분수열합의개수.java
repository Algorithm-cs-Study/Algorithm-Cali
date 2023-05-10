package programmers.level02.day15;

import java.util.HashSet;
import java.util.Set;

public class _001_연속부분수열합의개수 {

    public static void main(String[] args) {
        int solution = new _001_연속부분수열합의개수().solution(new int[]{7, 9, 1, 1, 4});
        System.out.println("solution = " + solution);
    }

    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int length = elements.length;
        for (int i = 0; i < length; i++) {
            int value = elements[i];
            set.add(value);
            for (int j = 1; j < length; j++) {
                int index = i + j >= length ? i + j - length : i + j;
                value += elements[index];
                set.add(value);
            }
        }

        return set.size();
    }
}
