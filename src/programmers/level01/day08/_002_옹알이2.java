package programmers.level01.day08;

public class _002_옹알이2 {

    private final String[] myBabbling = {"aya", "ye", "woo", "ma"};

    public int solution(String[] babbling) {
        int answer = 0;
        for (String babble : babbling) {
            if (canBabble(babble)) {
                answer++;
            }
        }
        return answer;
    }

    private boolean canBabble(String word) {
        if (word.replace(".", "").isEmpty()) {
            return true;
        }

        for (String myBabble : myBabbling) {
            String doubleBabble = myBabble.repeat(2);
            if (word.contains(doubleBabble)) {
                return false;
            }else if (word.contains(myBabble)) {
                String replace = word.replace(myBabble, ".");
                return canBabble(replace);
            }
        }

        return false;
    }
}
