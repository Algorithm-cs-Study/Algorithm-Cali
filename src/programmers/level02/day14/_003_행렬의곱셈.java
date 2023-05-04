package programmers.level02.day14;

public class _003_행렬의곱셈 {

    public static void main(String[] args) {
        int[][] solution = new _003_행렬의곱셈().solution(new int[][]{{1, 4}, {3, 2}, {4, 1}}, new int[][]{{3, 3}, {3, 3}});
        for (int[] ints : solution) {
            for (int anInt : ints) {
                System.out.print(anInt);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int x = arr1.length, y = arr2[0].length;
        int[][] answer = new int[x][y];

        int a = arr1[0].length;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                int value = 0;
                for (int k = 0; k < a; k++) {
                    value += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = value;
            }
        }

        return answer;
    }
}
