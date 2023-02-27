package programmers.level01.day04;

public class _005_3진법뒤집기 {

    public int solution(int n) {
        String reverse = new StringBuilder(Integer.toString(n, 3)).reverse().toString();
        return Integer.parseInt(reverse, 3);
    }
}
