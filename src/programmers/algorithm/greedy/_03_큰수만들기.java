package programmers.algorithm.greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class _03_큰수만들기 {

    public static void main(String[] args) {
        new _03_큰수만들기().scoring();
    }

    public void scoring() {
        String[] numbers = new String[]{"1924", "1231234", "4177252841", "4321"};
        int[] ks = new int[]{2, 3, 4, 1};
        IntStream.range(0, ks.length).forEach(i -> {
            System.out.println(solution(numbers[i], ks[i]));
        });
    }

    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int length = number.length();
        for (int idx = 0; idx < length; idx++) {
            char curr = number.charAt(idx);
            int tempIdx = idx + 1;
            int limit = Math.min(length, k + answer.length() + 1);
            while (tempIdx < limit) {
                char next = number.charAt(tempIdx);
                if (next > curr) {
                    curr = next;
                    idx = tempIdx;
                }
                tempIdx++;
            }
            answer.append(curr);
            if (answer.length() == length - k) {
                break;
            }
        }

        return answer.toString();
    }

    // 완전탐색으로 풀었는데 시간초과 나네요.
    /*public String solution(String number, int k) {
        List<Integer> numbers = createNumbers(number, number.length() - k);

        return numbers.stream().sorted(Comparator.reverseOrder()).findFirst().get().toString();
    }

    private List<Integer> createNumbers(String number, int limit) {
        List<Integer> numbers = new ArrayList<>();
        setNumbers(numbers, number, 0, limit, 0);
        return numbers;
    }

    private void setNumbers(List<Integer> numbers, String number, int value, int limit, int prevIdx) {
        int level = (int) Math.log10(value) + 1;
        if (level == limit) {
            numbers.add(value);
        }
        int length = number.length();
        for (int i = prevIdx; i < length; i++) {
            int nextValue = value * 10 + Character.getNumericValue(number.charAt(i));
            setNumbers(numbers, number, nextValue, limit, i + 1);
        }
    }*/
}
