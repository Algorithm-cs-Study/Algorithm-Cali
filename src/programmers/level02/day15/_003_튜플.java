package programmers.level02.day15;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class _003_튜플 {

    public static void main(String[] args) {
//        int[] solution = new _003_튜플().solution("{{2,1},{2,1,3},{2,1,3,4},{2}}");
        int[] solution = new _003_튜플().solution1("{{1,2,3},{2,1},{1,2,4,3},{2}}");
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }

    public int[] solution(String s) {
        int strLength = s.length();
        s = s.substring(2, strLength - 2);

        if (!s.contains("},{")) {
            return new int[]{Integer.valueOf(s)};
        }

        String[] arrays = s.split("},\\{");
        Arrays.sort(arrays, Comparator.comparingInt(String::length));

        int length = arrays.length, prev = 0;
        int[] answer = new int[length];
        for (int i = 0; i < length; i++) {
            String arr = arrays[i];
            int sum = Arrays.stream(arr.split(",")).mapToInt(str -> Integer.valueOf(str)).sum();
            answer[i] = sum - prev;
            prev = sum;
        }

        return answer;
    }

    public int[] solution1(String s) {
        Set<String> set = new HashSet<>();
        String[] arr = s.replaceAll("[{]", " ").replaceAll("[}]", " ").trim().split(" , ");
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        int[] answer = new int[arr.length];
        int idx = 0;
        for(String s1 : arr) {
            for(String s2 : s1.split(",")) {
                if(set.add(s2)) answer[idx++] = Integer.parseInt(s2);
            }
        }
        return answer;
    }
}
