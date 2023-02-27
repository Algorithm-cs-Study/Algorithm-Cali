package programmers.level01.day04;

public class _006_이상한문자만들기 {

    public String solution(String s) {
        char[] chars = s.toCharArray();
        StringBuilder answer = new StringBuilder();
        int count = 0;
        for (char aChar : chars) {
            if (aChar == ' ') {
                count = 0;
                answer.append(aChar);
                continue;
            }

            if (count % 2 == 0) {
                answer.append(String.valueOf(aChar).toUpperCase());
            } else {
                answer.append(String.valueOf(aChar).toLowerCase());
            }
            count++;
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        String solution = new _006_이상한문자만들기().solution("try hello world");
        System.out.println("solution = " + solution);
    }
}
