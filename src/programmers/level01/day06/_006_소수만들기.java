package programmers.level01.day06;

import java.util.Arrays;

public class _006_소수만들기 {

    public int solution(int[] nums) {
        int answer = 0;
        int length = nums.length;
        Arrays.sort(nums);
        boolean[] notPrimeNumbers = getPrimeNumbers(nums[length - 1] + nums[length - 2] + nums[length - 3]);
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                for (int k = j + 1; k < length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (!notPrimeNumbers[sum]) answer++;
                }
            }
        }

        return answer;
    }

    private boolean[] getPrimeNumbers(int n) {
        boolean[] notPrimeNumbers = new boolean[n + 1];
        notPrimeNumbers[0] = notPrimeNumbers[1] = true;

        for (int i = 2; i * i <= n; i++) {
            if (!notPrimeNumbers[i]) {
                for (int j = i * i; j <= n; j += i) {
                    notPrimeNumbers[j] = true;
                }
            }
        }

        return notPrimeNumbers;
    }
}
