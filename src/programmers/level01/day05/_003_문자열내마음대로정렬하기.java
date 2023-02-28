package programmers.level01.day05;

import java.util.Arrays;
import java.util.Comparator;

public class _003_문자열내마음대로정렬하기 {

    public String[] solution(String[] strings, int n) {
        return Arrays.stream(strings).sorted(getStringComparator(n)).toArray(String[]::new);
    }

    private Comparator<String> getStringComparator(int n) {
        return (o1, o2) -> {
            char c1 = o1.charAt(n);
            char c2 = o2.charAt(n);
            if (c1 == c2) {
                return o1.compareTo(o2);
            }
            return c1 - c2;
        };
    }

    public static void main(String[] args) {
        String[] solution = new _003_문자열내마음대로정렬하기().solution(new String[]{"abcd", "cdx", "abce"},
            2);
        for (String s : solution) {
            System.out.println("s = " + s);
        }
    }
}
