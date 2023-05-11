package programmers.level02.day15;

import java.util.HashMap;
import java.util.Map;

public class _004_의상 {

    public static void main(String[] args) {
        int solution = new _004_의상().solution(new String[][]{{"2", "A"}, {"1", "A"}, {"3", "B"}, {"2", "B"}, {"3", "C"}, {"4", "D"}});
        System.out.println("solution = " + solution);
    }

    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {
            String kind = clothe[1];
            Integer count = map.getOrDefault(kind, 0);
            map.put(kind, ++count);
        }

        int answer = 1;
        for (Integer count : map.values()) {
            answer *= ++count;
        }

        return answer - 1;
    }
}
