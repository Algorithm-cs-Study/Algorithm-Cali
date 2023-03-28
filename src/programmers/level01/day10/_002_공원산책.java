package programmers.level01.day10;

public class _002_공원산책 {

    public static void main(String[] args) {
        int[] solution = new _002_공원산책().solution(new String[]{"SOO","OOO","OOO"}, new String[]{"E 2","S 2","W 1"});
        // 2, 1
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }

    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int[] now = getStartPoint(park);
        int length = routes.length;
        for (int i = 0; i < length; i++) {
            String route = routes[i];
            String[] split = route.split(" ");
            now = getMovePoint(park, now, split);
        }

        return answer;
    }

    private int[] getMovePoint(String[] park, int[] now, String[] split) {
        String direction = split[0];
        int distance = Integer.valueOf(split[1]);
        int x = now[0], y = now[1];
        if (direction.equals("E")) {
            String line = park[x];
            char[] point = line.toCharArray();
            if (y + distance >= point.length) {
                return now;
            }
            for (int i = 0; i < distance; i++) {
                if (point[i] == 'X') {
                    return now;
                }
            }
            return new int[]{x, y + distance};
        }

        if (direction.equals("W")) {
            String line = park[x];
            char[] point = line.toCharArray();
            if (y + distance >= point.length) {
                return now;
            }
            for (int i = 0; i < distance; i++) {
                if (point[i] == 'X') {
                    return now;
                }
            }
            return new int[]{x, y + distance};
        }

        if (direction.equals("N")) {
            String line = park[x];
            char[] point = line.toCharArray();
            if (y + distance >= point.length) {
                return now;
            }
            for (int i = 0; i < distance; i++) {
                if (point[i] == 'X') {
                    return now;
                }
            }
            return new int[]{x, y + distance};
        }

        if (direction.equals("S")) {
            String line = park[x];
            char[] point = line.toCharArray();
            if (y + distance >= point.length) {
                return now;
            }
            for (int i = 0; i < distance; i++) {
                if (point[i] == 'X') {
                    return now;
                }
            }
            return new int[]{x, y + distance};
        }

    }

    private int[] getStartPoint(String[] park) {
        int height = park.length;
        for (int i = 0; i < height; i++) {
            String line = park[i];
            char[] point = line.toCharArray();
            int length = point.length;
            for (int j = 0; j < length; j++) {
                if (point[j] == 'S') {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
