package programmers.level01.day07;

import java.util.HashMap;
import java.util.Map;

public class _006_완주하지못한선수 {

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String s : completion) {
            Integer value = map.get(s);
            if (value == 1) {
                map.remove(s);
            } else {
                map.replace(s, --value);
            }
        }

        return map.keySet().stream().findFirst().get();
    }
}
