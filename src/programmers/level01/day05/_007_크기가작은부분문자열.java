package programmers.level01.day05;

public class _007_크기가작은부분문자열 {

    public int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length();
        int limit = t.length() - pLength;
        for (int i = 0; i <= limit; i++) {
            String substring = t.substring(i, i + pLength);
            if (substring.compareTo(p) <= 0) {
                answer++;
            }
        }
        return answer;
    }
}
