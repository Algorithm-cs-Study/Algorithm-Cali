package programmers.level01.day01;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class _006_문자열내p와y의개수 {

    boolean solution(String s) {
        List<Character> collect = s.toLowerCase().chars().mapToObj(c -> (char) c)
            .collect(Collectors.toList());
        int p = Collections.frequency(collect, 'p');
        int y = Collections.frequency(collect, 'y');

        return p == y;
    }

}
