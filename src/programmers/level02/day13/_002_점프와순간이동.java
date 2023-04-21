package programmers.level02.day13;

public class _002_점프와순간이동 {

    public int solution(int n) {
        int answer = 1;
        while (n > 1) {
            if (n % 2 == 1) {
                answer++;
            }
            n /= 2;
        }

        return answer;
    }

    public static void main(String[] args) {
        int solution = new _002_점프와순간이동().solution(5000);
        System.out.println("solution = " + solution);
    }
}
