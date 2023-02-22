package programmers.level01.day03;

import java.util.Arrays;
import java.util.Collections;

public class _024_문자열내림차순으배치하기 {

    public String solution(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new StringBuilder(String.valueOf(chars)).reverse().toString();
    }

    public static void main(String[] args) {
        String solution = new _024_문자열내림차순으배치하기().solution("Zbcdefg");
        System.out.println("solution = " + solution);
    }
}
