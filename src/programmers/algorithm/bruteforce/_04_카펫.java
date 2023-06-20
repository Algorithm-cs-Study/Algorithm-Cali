package programmers.algorithm.bruteforce;

public class _04_카펫 {

    public static void main(String[] args) {
        int[] solution = new _04_카펫().solution(10, 2);
        for (int i : solution) {
            System.out.println(i);
        }
    }

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
