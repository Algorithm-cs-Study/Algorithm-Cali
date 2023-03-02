package programmers.level01.day05;

import java.time.LocalDate;

public class _009_2016년 {

    private static final String[] WEEK = {"" , "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

    public String solution(int a, int b) {
        return WEEK[LocalDate.of(2016, a, b).getDayOfWeek().getValue()];
        // return LocalDate.of(2016, a, b).getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.US);
    }
}
