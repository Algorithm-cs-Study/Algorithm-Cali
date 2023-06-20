package programmers.algorithm.bruteforce;

import java.util.ArrayList;
import java.util.List;

public class _05_피로도 {

    public static void main(String[] args) {
//        int solution = new _05_피로도().solution(80, new int[][]{{80, 20}, {50, 40}, {30, 10}});
//        int solution = new _05_피로도().solution(10, new int[][]{{9, 2}, {10, 3}, {7, 3}, {5, 4}, {1, 1}});
//        System.out.println(solution);
        new _05_피로도().scoring();
    }

    public void scoring() {
        List<int[][]> testList = new ArrayList<>();
        testList.add(new int[][]{{80, 20}, {50, 40}, {30, 10}});
        testList.add(new int[][]{{7, 3}, {5, 4}, {1, 1}});
        testList.add(new int[][]{{9, 2}, {10, 3}, {7, 3}, {5, 4}, {1, 1}});
        int ks[] = new int[]{80, 8, 10};
        for (int i = 0; i < 3; i++) {
            int solution = solution(ks[i], testList.get(i));
            System.out.println(solution);
            answer = 0;
        }
    }

    private boolean[] visited;

    private int answer;

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        goDungeon(dungeons, 0, k);
        return answer;
    }

    private void goDungeon(int[][] dungeons, int count, int k) {
        int length = dungeons.length;
        if (answer == length) {
            return;
        }
        if (count == length) {
            answer = count;
            return;
        }
        for (int i = 0; i < length; i++) {
            if (visited[i]) {
                continue;
            }
            int[] dungeon = dungeons[i];
            if (dungeon[0] > k) {
                continue;
            }
            visited[i] = true;
            goDungeon(dungeons, count + 1, k - dungeon[1]);
            answer = Math.max(count + 1, answer);
            visited[i] = false;
        }
    }
}
