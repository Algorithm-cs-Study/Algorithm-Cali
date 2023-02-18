package programmers.level01.day02;

public class _012_하샤드수 {

    public boolean solution(int x) {
        int sum = Integer.toString(x).chars().map(c -> c - '0').sum();
        return x % sum == 0;
    }
}
