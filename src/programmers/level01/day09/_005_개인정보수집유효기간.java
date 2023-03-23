package programmers.level01.day09;

import java.util.ArrayList;
import java.util.List;

public class _005_개인정보수집유효기간 {

    private int[] termsDateArr = new int[26];

    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        setDateArr(today, terms);

        int length = privacies.length;
        for (int i = 0; i < length; i++) {
            String privacy = privacies[i];
            String[] split = privacy.split(" ");
            int numDays = getNumDays(split[0]);
            char clause = split[1].charAt(0);
            int expiredDays = termsDateArr[clause - 'A'];
            if (numDays <= expiredDays) {
                answer.add(i + 1);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private void setDateArr(String today, String[] terms) {
        for (String term : terms) {
            String[] split = term.split(" ");
            char clause = split[0].charAt(0);
            termsDateArr[clause - 'A'] = getNumDays(today, Integer.parseInt(split[1]));
        }
    }

    private int getNumDays(String date, int period) {
        String[] split = date.split("\\.");
        int year = Integer.valueOf(split[0]);
        int month = Integer.valueOf(split[1]);
        int day = Integer.valueOf(split[2]);
        month -= period;
        if (month < 1) {
            year--;
            month += 12;
        }
        return (year * 12 * 28) + (month * 28) + day;
    }

    private int getNumDays(String date) {
        return getNumDays(date, 0);
    }
}
