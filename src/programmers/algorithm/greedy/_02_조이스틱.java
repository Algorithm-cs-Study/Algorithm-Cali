package programmers.algorithm.greedy;

public class _02_조이스틱 {

    public static void main(String[] args) {
        int solution = new _02_조이스틱().solution("JEROEN");
        System.out.println(solution);
    }

    public int solution(String name) {
        int answer = 0, index = -1;
        int length = name.length(), move = length - 1;
        char[] alphabets = name.toCharArray();
        for (char alphabet : alphabets) {
            index++;
            answer += Math.min(alphabet - 'A', 'Z' - alphabet + 1);

            int next = index + 1;
            while (next < length && alphabets[next] == 'A') {
                next++;
            }
            move = Math.min(move, index * 2 + length - next);
            move = Math.min(move, (length - next) * 2 + index);
        }

        return answer + move;
    }
}
