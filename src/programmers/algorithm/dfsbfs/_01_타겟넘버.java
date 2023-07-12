package programmers.algorithm.dfsbfs;

public class _01_타겟넘버 {

    public static void main(String[] args) {
//        int solution = new _01_타겟넘버().solution(new int[]{1, 1, 1, 1, 1}, 3);
        int solution = new _01_타겟넘버().solution(new int[]{4, 1, 2, 1}, 4);
        System.out.println(solution);
    }

    private int target = 0;

    private int[] numbers;

    private int answer = 0;

    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        dfs(0, numbers.length, 0);

        return answer;
    }

    private void dfs(int level, int length, int val) {
        if (level == length) {
            if (val == target) {
                answer++;
            }
            return;
        }

        int number = numbers[level];
        dfs(level + 1, length, val + number);
        dfs(level + 1, length, val - number);
    }
}
