package programmers.level01.day02;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class _010_정수내림차순으로배치하기 {
    public long solution(long n) {
        long answer = 0l;
        List<Integer> integers = Arrays.stream(String.valueOf(n).chars().map(x -> x - '0').toArray())
            .boxed()
            .sorted(Collections.reverseOrder()).collect(Collectors.toList());
        for (Integer integer : integers) {
            answer *= 10;
            answer += integer;
        }
        return answer;
    }
}
