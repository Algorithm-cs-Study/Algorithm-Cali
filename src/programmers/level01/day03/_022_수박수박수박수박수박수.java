package programmers.level01.day03;

public class _022_수박수박수박수박수박수 {

    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            answer.append(i % 2 == 0 ? "수" : "박");
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        String solution = new _022_수박수박수박수박수박수().solution(3);
        System.out.println("solution = " + solution);
    }
}
