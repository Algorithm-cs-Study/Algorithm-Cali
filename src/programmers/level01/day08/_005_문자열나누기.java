package programmers.level01.day08;

public class _005_문자열나누기 {

    public int solution(String s) {
        int answer = 0;
        boolean flag = !s.isEmpty();
        while (flag && !s.isEmpty()) {
            answer++;
            char c = s.charAt(0);
            int x = 0, y = 0;
            for (int i = 0; i < s.length(); i++) {
                if (c == s.charAt(i)) {
                    x++;
                } else {
                    y++;
                }

                if (x == y) {
                    s = s.substring(i + 1);
                    break;
                }

                if (i == s.length() - 1) {
                    flag = false;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int solution = new _005_문자열나누기().solution("aaabbaccccabba");
        System.out.println("solution = " + solution);
    }
}
