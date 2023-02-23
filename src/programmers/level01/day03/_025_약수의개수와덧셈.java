package programmers.level01.day03;

public class _025_약수의개수와덧셈 {

    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            if (haveEvenAliquots(i)) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }

    private boolean haveEvenAliquots(int number) {
        int numberOfAliquots = 0;
        for (int i = 1; i * i <= number; i++) {
            if (i * i == number) {
                numberOfAliquots++;
            } else if (number % i == 0) {
                numberOfAliquots += 2;
            }
        }

        return numberOfAliquots % 2 == 0;
    }
}
