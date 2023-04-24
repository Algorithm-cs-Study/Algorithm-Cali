package programmers.level02.day13;

import java.util.List;
import java.util.Stack;

public class _006_괄호회전하기 {

    public static void main(String[] args) {
        int solution = new _006_괄호회전하기().solution("]}(){[");
        System.out.println("solution = " + solution);
    }

    private List<Character> openBrackets = List.of('(', '{', '[');

    public int solution(String s) {
        int answer = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (isPairedBrackets(s)) {
                answer++;
            }
            s = new StringBuilder().append(s, 1, length).append(s.charAt(0)).toString();
        }

        return answer;
    }

    private boolean isPairedBrackets(String s) {
        char[] brackets = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char bracket : brackets) {
            if (openBrackets.contains(bracket)) {
                stack.add(bracket);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }

            char prev = stack.pop();
            if (!isPaired(prev, bracket)) {
                return false;
            }
        }

        return stack.isEmpty();
    }

    private boolean isPaired(Character openBracket, Character closeBracket) {
        if (openBracket == '(' && closeBracket == ')') {
            return true;
        }

        if (openBracket == '{' && closeBracket == '}') {
            return true;
        }

        return openBracket == '[' && closeBracket == ']';
    }

    public int temp(String s) {
        int answer = 0;
        s = convertBracketsWord(s);
        char[] words = s.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (char nowWord : words) {
            if (openBrackets.contains(nowWord)) {
                stack.add(nowWord);
                continue;
            }

            if (stack.isEmpty()) {
                return 0;
            }

            char prevWord = stack.peek();
            if (isPaired(prevWord, nowWord)) {
                stack.pop();
                if (stack.isEmpty()) {
                    answer++;
                }
            } else {
                return 0;
            }
        }

        return answer;
    }

    private String convertBracketsWord(String s) {
        char[] brackets = s.toCharArray();
        StringBuilder lastWord = new StringBuilder();
        int length = brackets.length;
        for (int i = 0; i < length; i++) {
            char nowWord = brackets[i];
            if (openBrackets.contains(nowWord)) {
                break;
            }

            lastWord.append(nowWord);
        }

        int lastLength = lastWord.length();
        if (lastLength == 0) {
            return s;
        }

        return new StringBuilder().append(s, lastLength, length).append(lastWord).toString();
    }
}
