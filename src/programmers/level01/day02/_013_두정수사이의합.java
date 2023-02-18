package programmers.level01.day02;

public class _013_두정수사이의합 {
    public long solution(int a, int b) {
        long answer = 0;
        int x = Math.min(a, b);
        int y = Math.max(a, b);
        for (int i = x; i <= y; i++) {
            answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        long solution = new _013_두정수사이의합().solution(3, 3);
        System.out.println("solution = " + solution);
    }
}
