package programmers.level01.day03;

public class _019_음양더하기 {

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            int absolute = absolutes[i];
            if (signs[i]) {
                answer += absolute;
            } else {
                answer -= absolute;
            }
        }
        return answer;
    }
}
