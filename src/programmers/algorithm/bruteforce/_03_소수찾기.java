package programmers.algorithm.bruteforce;

import java.util.HashSet;
import java.util.Set;

public class _03_소수찾기 {

    public static void main(String[] args) {
        int solution = new _03_소수찾기().solution("17");
        System.out.println(solution);
    }

    private Set<Integer> numSet = new HashSet<>();

    private boolean[] visited;

    private int nums[];

    private int length;

    boolean[] notPrimeNumbers;

    public int solution(String numbers) {
        length = numbers.length();
        visited = new boolean[length];
        nums = numbers.chars().map(i -> Character.getNumericValue(i)).sorted().toArray();


        createNum(0, 0);

        Integer max = numSet.stream().max(Comparable::compareTo).get();
        notPrimeNumbers = getNotPrimeNumbers(max);

        int answer = 0;
        for (Integer integer : numSet) {
            if (!notPrimeNumbers[integer]) {
                answer++;
            }
        }

        return answer;
    }

    private void createNum(int level, int num) {
        if (level != 0) {
            numSet.add(num);
        }

        if (level == length) {
            return;
        }

        for (int i = 0; i < length; i++) {
            int curr = nums[i];
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            createNum(++level, num * 10 + curr);
            visited[i] = false;
            level--;
        }
    }

    private boolean[] getNotPrimeNumbers(int n) {
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
