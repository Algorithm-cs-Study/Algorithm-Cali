package programmers.level01.day09;

public class _001_성격유형검사하기 {
    int[] scores = {0, -3, -2, -1, 0, 1, 2, 3};

    public String solution(String[] survey, int[] choices) {
        int length = survey.length;
        int[] typeScore = new int[24];
        for (int i = 0; i < length; i++) {
            int choice = choices[i];
            String s = survey[i];
            int score = scores[choice];
            if (score > 0) {
                typeScore[s.charAt(1) - 'A'] += score;
            } else if (score < 0) {
                typeScore[s.charAt(0) - 'A'] += -score;
            }
        }

        return getPersonalityType(typeScore);
    }

    private String getPersonalityType(int[] typeScore) {
        Character[] types = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        StringBuilder personalityType = new StringBuilder();
        for (int i = 0; i < 8; i += 2) {
            int aType = typeScore[types[i] - 'A'];
            int bType = typeScore[types[i + 1] - 'A'];
            personalityType.append(aType < bType ? types[i + 1] : types[i]);
        }
        return personalityType.toString();
    }
}
