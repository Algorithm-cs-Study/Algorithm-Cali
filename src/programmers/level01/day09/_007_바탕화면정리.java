package programmers.level01.day09;

public class _007_바탕화면정리 {

    public static void main(String[] args) {
        int[] solution = new _007_바탕화면정리().solution(new String[]{".#...", "..#..", "...#."});
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }

    public int[] solution(String[] wallpaper) {
        int lux = Integer.MAX_VALUE, luy = Integer.MAX_VALUE, rdx = 0, rdy = 0;
        int height = wallpaper.length;
        for (int i = 0; i < height; i++) {
            String row = wallpaper[i];
            char[] chars = row.toCharArray();
            int length = chars.length;
            for (int j = 0; j < length; j++) {
                if (chars[j] == '#') {
                    lux = Math.min(lux, i);
                    luy = Math.min(luy, j);
                    rdx = Math.max(rdx, i + 1);
                    rdy = Math.max(rdy, j + 1);
                }
            }
        }

        return new int[]{lux, luy, rdx, rdy};
    }
}
