package programmers.level01.day07;

public class _005_기사단원의무기 {

    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] gcps = new int[number + 1];
        boolean[] notPrimeNums = getNotPrimeNums(number);
        gcps[1] = 1;
        for (int i = 2; i <= number; i++) {
            if (!notPrimeNums[i]) {
                gcps[i] = 2;
                continue;
            }

            gcps[i] = getNumOfGcp(i);
        }

        for (int gcp : gcps) {
            if (gcp > limit) {
                answer += power;
            } else {
                answer += gcp;
            }
        }

        return answer;
    }

    private boolean[] getNotPrimeNums(int n) {
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

    private int getNumOfGcp(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) {
                count++;
            } else if (n % i == 0) {
                count += 2;
            }
        }
        return count;
    }
}
