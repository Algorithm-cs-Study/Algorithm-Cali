package programmers.level01.day01;

public class _007_정수제곱근판별 {

    public long solution(long n) {
        int x = 1;
        while (x <= n) {
            long pow = (long) Math.pow(x++, 2);
            if (pow == n) {
                break;
            }

            if (pow > n) {
                return -1;
            }
        }
        return (long) Math.pow(x, 2);
    }
}
