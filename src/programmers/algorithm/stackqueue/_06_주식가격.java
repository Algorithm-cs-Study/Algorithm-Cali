package programmers.algorithm.stackqueue;

import java.util.Arrays;

public class _06_주식가격 {

    public static void main(String[] args) {
        int[] solution = new _06_주식가격().solution(new int[]{1, 2, 3, 2, 3});
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }

    public int[] solution(int[] prices) {
        int length = prices.length;
        int[] answer = new int[length];

        for (int i = 0; i < length - 1; i++) {
            int price = prices[i];
            for (int j = i + 1; j < length; j++) {
                int diff = prices[j];
                if (price > diff) {
                    answer[i] = j - i;
                    break;
                }
            }

            if (answer[i] == 0) {
                answer[i] = length - i - 1;
            }
        }

        answer[length - 1] = 0;
        return answer;
    }
}
