package programmers.level01.day06;

public class _003_가장가까운같은글자 {

    public int[] solution(String s) {
        int[] alphabets = new int[26];
        int[] answer = new int[s.length()];
        for (int i = 0; i < alphabets.length; i++) {
            alphabets[i] = -1;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int index = chars[i] - 'a';
            int alphabet = alphabets[index];
            if (alphabet == -1) {
                answer[i] = alphabet;
            } else {
                answer[i] = i - alphabet;
            }
            alphabets[index] = i;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] solution = new _003_가장가까운같은글자().solution("ssssss");
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}
