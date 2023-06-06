package programmers.algorithm.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class _02_가장큰수 {

    public static void main(String[] args) {
        String solution = new _02_가장큰수().solution(new int[]{3, 30, 34, 5, 9});
        System.out.println(solution);
    }

    public String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        Arrays.stream(numbers).mapToObj(i -> String.valueOf(i))
            .sorted(getComparator())
            .forEach(i -> sb.append(i));

        StringBuilder test = new StringBuilder();
        Arrays.stream(numbers).mapToObj(String::valueOf).sorted(Comparator.reverseOrder()).forEach(test::append);
        System.out.println(test);

        return sb.toString();
    }

    private Comparator<String> getComparator() {
        return (o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o2.compareTo(o1);
            }
            System.out.println(o1 + ", " + o2);
            return o2.indexOf(0) - o1.indexOf(0);
        };
    }
}
