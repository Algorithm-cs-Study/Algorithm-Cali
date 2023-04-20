package programmers.level02.day12;

public class _001_다음큰숫자 {

    public int solution(int n) {
        int answer = 0;
        String binaryString = Integer.toBinaryString(n);
        int oneCount = getOneCount(binaryString);
        while (n < 1000000) {
            n++;
            binaryString = Integer.toBinaryString(n);
            int nextOneCount = getOneCount(binaryString);
            if (oneCount == nextOneCount) {
                return n;
            }
        }

        return answer;
    }

    private int getOneCount(String n) {
        int count = 0;
        char[] chars = n.toCharArray();
        for (char aChar : chars) {
            if (aChar == '1') {
                count++;
            }
        }
        return count;
    }
}
