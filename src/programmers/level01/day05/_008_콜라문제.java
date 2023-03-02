package programmers.level01.day05;

public class _008_콜라문제 {

    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n / a != 0) {
            int coke = n / a * b;
            answer += coke;
            n = coke + n % a;
        }
        return answer;
    }
}
