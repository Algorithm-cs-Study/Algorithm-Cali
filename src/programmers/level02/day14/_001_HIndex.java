package programmers.level02.day14;

import java.util.Arrays;

public class _001_HIndex {

    public static void main(String[] args) {
        int solution = new _001_HIndex().solution(new int[]{7, 7, 7, 7, 7});
        System.out.println("solution = " + solution);
    }

    public int solution(int[] citations) {
        Arrays.sort(citations);
        int length = citations.length;
        int answer = 0;

        for (int index = 0, less = length; index < length; index++) {
            int citation = citations[index];
            if (citation >= less) {
                answer = less;
                break;
            }
            less--;
        }
        return answer;
    }

    private boolean validCheck(int index, int prev, int curr, int length) {
        int rest = length - index;
        return rest <= curr && index <= rest && rest >= prev;
    }
}
