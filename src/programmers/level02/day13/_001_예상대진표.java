package programmers.level02.day13;

public class _001_예상대진표 {

    public static void main(String[] args) {
        int solution = new _001_예상대진표().solution(8, 1, 3);
        System.out.println("solution = " + solution);
    }

    public int solution(int n, int a, int b) {
        int answer = 0;
        while (n > 1) {
            n /= 2;
            answer++;
            a = getDivideNumber(a);
            b = getDivideNumber(b);
            if (a == b) {
                break;
            }
        }

        return answer;
    }

    private int getDivideNumber(int a) {
        return a % 2 == 0 ? a / 2 : (a + 1) / 2;
    }
}
