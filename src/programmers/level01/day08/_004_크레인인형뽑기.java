package programmers.level01.day08;

import java.util.Stack;

public class _004_크레인인형뽑기 {

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int move : moves) {
            for (int[] ints : board) {
                if (ints[move - 1] != 0) {
                    int a = ints[move - 1];
                    ints[move - 1] = 0;
                    if (!stack.isEmpty() && stack.peek() == a) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(a);
                    }
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
//        [[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]]
//        [1,5,3,5,1,2,1,4]
        int[] ints1 = {0, 0, 0, 0, 0};
        int[] ints2 = {0, 0, 1, 0, 3};
        int[] ints3 = {0, 2, 5, 0, 1};
        int[] ints4 = {4, 2, 4, 4, 2};
        int[] ints5 = {3, 5, 1, 3, 1};
        int[][] board = {ints1, ints2, ints3, ints4, ints5};
        int solution = new _004_크레인인형뽑기().solution(board, new int[]{1, 5, 3, 5, 1, 2, 1, 4});
        System.out.println("solution = " + solution);
    }
}
