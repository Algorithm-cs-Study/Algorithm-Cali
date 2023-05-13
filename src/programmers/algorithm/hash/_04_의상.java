package programmers.algorithm.hash;

import java.util.HashMap;
import java.util.Map;

public class _04_의상 {

    public static void main(String[] args) {
        int solution = new _04_의상().solution(new String[][]{{"yellow_hat", "headgear"}, {
        "blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}});
        System.out.println("solution = " + solution);
    }

    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();

        for (String[] clothe : clothes) {
            String kind = clothe[1];
            map.put(kind, map.getOrDefault(kind, 0) + 1);
        }

        int answer = 1;
        for (Integer count : map.values()) {
            answer *= count + 1;
        }

        return answer - 1;
    }
}
