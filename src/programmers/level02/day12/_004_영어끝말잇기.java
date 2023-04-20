package programmers.level02.day12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class _004_영어끝말잇기 {

    public int[] solution(int n, String[] words) {
        int length = words.length;
        int index = length;

        int size = new HashSet<>(List.of(words)).size();
        if (length != size) {
            index = getDuplicatedIndex(words);
        }

        index = getWrongAnswerIndex(words, index);

        if (index == length) {
            return new int[]{0, 0};
        }

        return new int[]{index % n + 1, index / n + 1};
    }

    private static int getWrongAnswerIndex(String[] words, int index) {
        for (int i = 1; i < index; i++) {
            String prevWord = words[i - 1];
            String nowWord = words[i];
            if (prevWord.charAt(prevWord.length() - 1) != nowWord.charAt(0)) {
                return i;
            }
        }
        return index;
    }

    private static int getDuplicatedIndex(String[] words) {
        List<String> wordList = Arrays.stream(words).collect(Collectors.toList());
        int length = words.length;
        int index = length;
        for (int i = 0; i < length; i++) {
            String word = words[i];
            List<String> subList = wordList.subList(i + 1, length);
            if (subList.contains(word)) {
                index = Math.min(subList.indexOf(word) + i + 1, index);
            }
        }
        return index;
    }
}
