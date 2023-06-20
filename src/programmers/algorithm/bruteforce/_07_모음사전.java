package programmers.algorithm.bruteforce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _07_모음사전 {

    public static void main(String[] args) {
        new _07_모음사전().scoring();
    }

    public void scoring() {
        String[] words = new String[]{"AAAAE", "AAAE", "I", "EIO"};
        for (int i = 0; i < 4; i++) {
            System.out.println(solution(words[i]));
        }
    }

    public int solution(String word) {
        List<String> dictionary = createDictionary();

        return dictionary.indexOf(word);
    }

    private List<String> createDictionary() {
        List<String> dictionary = new ArrayList<>();
        addDictionary(dictionary, new StringBuilder());
        Collections.sort(dictionary);

        return dictionary;
    }

    private void addDictionary(List<String> dictionary, StringBuilder word) {
        dictionary.add(word.toString());
        if (word.length() == 5) {
            return;
        }
        for (int i = 0; i < 5; i++) {
            char c = "AEIOU".charAt(i);
            word.append(c);
            addDictionary(dictionary, word);
            word.deleteCharAt(word.length() - 1);
        }
    }
}
