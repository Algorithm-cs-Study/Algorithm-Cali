package programmers.level01.day06;

public class _001_푸드파이트대회 {

    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            sb.append(String.valueOf(i).repeat(food[i] / 2));
        }

        StringBuilder origin = new StringBuilder(sb);
        return origin.append("0").append(sb.reverse()).toString();
    }

    public static void main(String[] args) {
        String solution = new _001_푸드파이트대회().solution(new int[]{1, 3, 4 ,6});
        System.out.println("solution = " + solution);
    }
}
