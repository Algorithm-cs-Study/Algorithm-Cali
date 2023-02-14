package programmers.level01.day01;

public class _003_약수의합 {

    public int solution(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int answer = 0;
        int[] aliquots = new int[n + 1];
        for (int i = 1; i < n / 2; i++) {
            if (n % i == 0) {
                aliquots[i] = 1;
                aliquots[n / i] = 1;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (aliquots[i] == 1) answer += i;
        }

        return answer;
    }

    public static void main(String[] args) {
        int solution = new _003_약수의합().solution(1);
        System.out.println("solution = " + solution);
    }
}
