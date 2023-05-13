package programmers.algorithm.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class _02_완주하지못한선수 {

    public static void main(String[] args) {
        String[] participant = new String[]{"leo", "kiki", "eden"};
        String[] completion = new String[]{"eden", "kiki"};
        String solution = new _02_완주하지못한선수().solution(participant, completion);
        System.out.println("solution = " + solution);
    }

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> compMap = new HashMap<>();
        for (String comp : completion) {
            Integer number = compMap.getOrDefault(comp, 0);
            compMap.put(comp, ++number);
        }

        for (String part : participant) {
            Integer number = compMap.get(part);
            if (number == null || number < 1) {
                return part;
            }
            compMap.put(part, --number);
        }

        return "";
    }
}
