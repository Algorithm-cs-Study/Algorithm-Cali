package programmers.level02.day11;

public class _005_이진변환반환하기 {

    public int[] solution(String s) {
        int count = 0, zeroCnt = 0;
        while (!s.equals("1")) {
            count++;
            int prevLength = s.length();
            String s1 = s.replace("0", "");
            int nowLength = s1.length();
            zeroCnt += prevLength - nowLength;
            s = Integer.toBinaryString(nowLength);
        }

        return new int[]{count, zeroCnt};
    }

    public static void main(String[] args) {
        int[] solution = new _005_이진변환반환하기().solution("110010101001");
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}
