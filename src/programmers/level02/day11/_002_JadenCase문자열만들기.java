package programmers.level02.day11;

public class _002_JadenCase문자열만들기 {

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        int length = chars.length;
        answer.append(String.valueOf(chars[0]).toUpperCase());
        for (int i = 1; i < length; i++) {
            char prev = chars[i - 1];
            char now = chars[i];

            if (prev == 32 && now != 32) {
                answer.append(String.valueOf(now).toUpperCase());
            } else {
                answer.append(now);
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        String solution = new _002_JadenCase문자열만들기().solution(" 3people  unFollowed me");
        System.out.println("solution = " + solution);
    }
}
