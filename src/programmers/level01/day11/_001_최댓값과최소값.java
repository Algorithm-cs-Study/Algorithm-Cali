package programmers.level01.day11;

public class _001_최댓값과최소값 {

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] split = s.split(" ");
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (String str : split) {
            int i = Integer.parseInt(str);
            max = Math.max(i, max);
            min = Math.min(i, min);
        }

        return answer.append(min).append(" ").append(max).toString();
    }

    public static void main(String[] args) {
        String solution = new _001_최댓값과최소값().solution("1 2 3 4");
        System.out.println("solution = " + solution);
    }
}
