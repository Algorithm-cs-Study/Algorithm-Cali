package programmers.level01.day04;

public class _003_최대공약수와최소공배수 {

    public int[] solution(int n, int m) {
        int a = Math.max(n, m);
        int b = Math.min(n, m);
        int gcd = getGcd(a, b);
        int lcm = n * m / gcd;
        int[] answer = new int[]{gcd, lcm};
        return answer;
    }

    private int getGcd(int a, int b) {
        int c = a % b;
        if (c == 0) {
            return b;
        }

        return getGcd(b, c);
    }
}
