package programmers.level01.day09;

public class _003_둘만의암호 {

    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            answer.append(moveChar(aChar, skip, index));
        }

        return answer.toString();
    }

    private Character moveChar(char c, String skip, int index) {
        int i = 0;
        while (i < index) {
            c++;
            if (c > 122) {
                c = 97;
            }

            if (skip.contains(String.valueOf(c))) {
                continue;
            }

            i++;
        }

        return c;
    }
}
