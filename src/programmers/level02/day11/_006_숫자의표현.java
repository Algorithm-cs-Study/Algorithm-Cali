package programmers.level02.day11;

public class _006_숫자의표현 {

    public int solution(int n) {
        if (n < 3) return 1;

        int answer = 1;
        int limit = n / 2 == 0 ? n / 2 : n / 2 + 1;
        int sum = 0;
        int i = 1, j = 1;
        while (i <= limit) {
            sum += i++;
            if (sum < n) {
                continue;
            }

            if (sum > n) {
                sum -= --i;
                sum -= j++;
            }

            if (sum == n) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int solution = new _006_숫자의표현().solution(2);
        System.out.println("solution = " + solution);
    }
}
