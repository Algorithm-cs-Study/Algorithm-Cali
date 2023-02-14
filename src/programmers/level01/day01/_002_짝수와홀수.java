package programmers.level01.day01;

public class _002_짝수와홀수 {

    public String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        String solution = new _002_짝수와홀수().solution(3);
        System.out.println("solution = " + solution);
    }
}
