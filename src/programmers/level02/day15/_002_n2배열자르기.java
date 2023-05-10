package programmers.level02.day15;

public class _002_n2배열자르기 {

    public static void main(String[] args) {
        int[] solution = new _002_n2배열자르기().solution(4, 7, 14);
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }

    public int[] solution(int n, long left, long right) {
        int length = (int) (right - left + 1);
        int[] answer = new int[length];
        int index = 0;
        for (long l = left; l <= right; l++) {
            int x = (int) (l / n);
            int y = (int) (l % n);
            answer[index++] = Math.max(x, y) + 1;
        }

        return answer;
    }
}
