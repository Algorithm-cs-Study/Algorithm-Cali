package programmers.level01.day06;

public class _004_소수찾기 {

    public int solution(int n) {
        int answer = 0;
        boolean[] notPrime = new boolean[n + 1];
        notPrime[0] = notPrime[1] = true;
        for (int i = 2; i * i <= n; i++) {
            if (!notPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    notPrime[j] = true;
                }
            }
        }
        for(int i=1; i<=n;i++){
            if(!notPrime[i]) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int solution = new _004_소수찾기().solution(10);
        System.out.println("solution = " + solution);
    }
}
