package programmers.level02.day12;

public class _005_카펫 {

    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int plus = brown / 2 + 2;
        int multiply = brown + yellow;
        for (int height = 2; height <= plus / 2; height++) {
            int width = plus - height;
            if (width * height == multiply) {
                answer[0] = width;
                answer[1] = height;
                break;
            }
        }

        return answer;
    }
}
