package programmers.level02.day13;

public class _004_멀리뛰기 {

    public static void main(String[] args) {
        long solution = new _004_멀리뛰기().solution(2);
        System.out.println("solution = " + solution);
    }

    public long solution(int n) {
        int[] fibonacci = new int[n + 1];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibonacci[i] = (fibonacci[i - 1] + fibonacci[i - 2]) % 1234567;
        }

        return fibonacci[n];
    }
}
