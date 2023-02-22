package programmers.level01.day03;

import java.util.Arrays;

public class _020_없는숫자더하기 {
    public int solution(int[] numbers) {
        return 45 - Arrays.stream(numbers).sum();
    }

}
