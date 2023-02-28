package programmers.level01.day05;

public class _002_비밀지도 {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            Long l1 = Long.parseLong(Integer.toBinaryString(arr1[i]));
            Long l2 = Long.parseLong(Integer.toBinaryString(arr2[i]));
            answer[i] = decode(String.valueOf(l1 + l2), n);
        }
        return answer;
    }

    private String decode(String str, int n) {
        int length = str.length();
        StringBuilder sb = new StringBuilder().append(" ".repeat(n - length));
        for (char c : str.toCharArray()) {
            if (c > '0') {
                sb.append("#");
            } else {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] solution = new _002_비밀지도().solution(5, new int[]{9, 20, 28, 18, 11},
            new int[]{30, 1, 21, 17, 28});
        for (String s : solution) {
            System.out.println("s = " + s);
        }
    }
}
