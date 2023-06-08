package programmers.algorithm.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class _02_가장큰수 {

    public static void main(String[] args) {
        String solution = new _02_가장큰수().solution(new int[]{0,0});
        System.out.println(solution);
    }

    public String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        Arrays.stream(numbers).mapToObj(String::valueOf).sorted(getComparator()).forEach(s -> sb.append(s));
        String answer = sb.toString();
        if (answer.startsWith("0")) {
            return "0";
        }

        return answer;
    }

    private Comparator<String> getComparator() {
        return (o1, o2) -> {
            String concat1 = o1.concat(o2);
            String concat2 = o2.concat(o1);
            return concat2.compareTo(concat1);
        };
    }
}
