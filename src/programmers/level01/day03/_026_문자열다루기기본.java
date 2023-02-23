package programmers.level01.day03;

import java.util.regex.Pattern;

public class _026_문자열다루기기본 {

    public boolean solution(String s) {
        int length = s.length();
        if (length != 4 && length != 6) {
            return false;
        }
        String pattern = "^[0-9]*$";
        return Pattern.matches(pattern, s);
    }
}
