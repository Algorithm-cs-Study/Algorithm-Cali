package programmers.algorithm.bruteforce;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _06_전력망을둘로나누기 {

    public static void main(String[] args) {
        new _06_전력망을둘로나누기().scoring();
    }

    public void scoring() {
        int[] ns = new int[]{9, 4, 7};
        List<int[][]> wiresList = new ArrayList<>();
        wiresList.add(new int[][]{{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}});
        wiresList.add(new int[][]{{1, 2}, {2, 3}, {3, 4}});
        wiresList.add(new int[][]{{1, 2}, {2, 7}, {3, 7}, {3, 4}, {4, 5}, {6, 7}});
        for (int i = 0; i < 3; i++) {
            System.out.println(solution(ns[i], wiresList.get(i)));
        }
    }

    public int solution(int n, int[][] wires) {
        int answer = n;

        List<Integer>[] tree = createTree(n, wires);
        for (int[] wire : wires) {
            answer = Math.min(answer, cutAndCalculateNode(wire, tree));
        }

        return answer;
    }

    private int cutAndCalculateNode(int[] wire, List<Integer>[] tree) {
        int i = wire[0];
        int j = wire[1];
        int x = bfs(i, j, tree);
        int y = bfs(j, i, tree);

        return Math.abs(x - y);
    }

    private int bfs(int start, int cut, List<Integer>[] tree) {
        int answer = 0;

        boolean[] visited = new boolean[tree.length];
        visited[start] = true;
        visited[cut] = true;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()) {
            int poll = queue.poll();
            answer++;
            List<Integer> nodes = tree[poll];
            for (int node : nodes) {
                if (visited[node]) {
                    continue;
                }
                queue.add(node);
                visited[node] = true;
            }
        }

        return answer;
    }

    private List<Integer>[] createTree(int n, int[][] wires) {
        List<Integer>[] tree = new List[n + 1];
        for (int i = 1; i < n + 1; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int[] wire : wires) {
            int i = wire[0];
            int j = wire[1];
            tree[i].add(j);
            tree[j].add(i);
        }

        return tree;
    }
}
