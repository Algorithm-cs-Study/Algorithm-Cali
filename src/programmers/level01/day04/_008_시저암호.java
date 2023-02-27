package programmers.level01.day04;

public class _008_시저암호 {

    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (c == ' ') {
                answer.append(c);
                continue;
            }

            char newChar = (char) (c + n);
            if (c >= 97 && newChar > 122) {
                newChar -= 26;
            }
            if (c <= 90 && newChar > 90) {
                newChar -= 26;
            }
            answer.append(newChar);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        String solution = new _008_시저암호().solution("a B z", 25);
        System.out.println("solution = " + solution);
    }
}
