package programmers.level01.day01;

public class _005_자연수뒤집배열로만들기 {

    public int[] solution(long n) {
        char[] chars = String.valueOf(n).toCharArray();
        int length = chars.length;
        int[] answer = new int[length];
        for (int i = 0, j = length - 1; i < length; i++) {
            answer[j--] = chars[i] - 48;
        }

        return answer;
    }

}
