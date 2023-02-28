package programmers.level01.day05;

public class _001_최소직사각형 {

    public int solution(int[][] sizes) {
        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;
        for (int i = 0; i < sizes.length; i++) {
            int i1 = sizes[i][0];
            int i2 = sizes[i][1];
            maxX = Math.max(maxX, Math.max(i1, i2));
            maxY = Math.max(maxY, Math.min(i1, i2));
        }
        return maxX * maxY;
    }
}
