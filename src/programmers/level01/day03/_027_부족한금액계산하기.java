package programmers.level01.day03;

public class _027_부족한금액계산하기 {

    public long solution(int price, int money, int count) {
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += i;
        }
        long answer = (long) price * sum - money;

        return answer < 0 ? 0 : answer;
    }
}
