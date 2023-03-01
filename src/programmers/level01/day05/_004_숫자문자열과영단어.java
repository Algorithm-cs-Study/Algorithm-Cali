package programmers.level01.day05;

import java.util.List;

public class _004_숫자문자열과영단어 {

//    private final String[] CODE_TABLE = {"zero", "one", "two", "three", "four", "five", "six",
//        "seven", "eight", "nine"};
    private static final List<String> CODE_TABLE = List.of("zero", "one", "two", "three", "four", "five", "six",
        "seven", "eight", "nine");

    public int solution(String s) {
        int answer = 0;
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char aChar : chars) {
            System.out.println("answer = " + answer);
            if (aChar >= '0' && aChar <= '9') {
                answer *= 10;
                answer += Character.getNumericValue(aChar);
                sb.setLength(0);
                continue;
            }
            sb.append(aChar);
            int index = CODE_TABLE.indexOf(sb.toString());
            if (index >= 0) {
                answer *= 10;
                answer += index;
                sb.setLength(0);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
//        int solution = new _004_숫자문자열과영단어().solution("1zerotwozero3");
//        System.out.println("solution = " + solution);
        int zero = CODE_TABLE.indexOf("zero");
        System.out.println("zero = " + zero);
    }
}
