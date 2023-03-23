package programmers.level01.day09;

public class _004_대충만든자판 {

    public int[] solution(String[] keymap, String[] targets) {
        int length = targets.length;
        int[] answer = new int[length];
        for (int i = 0; i < length; i++) {
            int total = 0;
            char[] targetArr = targets[i].toCharArray();
            for (char target : targetArr) {
                int count = minButton(keymap, target);
                if (count == 0) {
                    total = -1;
                    break;
                }
                total += count;
            }
            answer[i] = total;
        }
        return answer;
    }

    private int minButton(String[] keymap, char s) {
        int count = Integer.MAX_VALUE;
        for (String key : keymap) {
            int index = key.indexOf(s);
            if (index > -1) {
                count = Math.min(count, index + 1);
            }
        }
        return count == Integer.MAX_VALUE ? 0 : count;
    }
}
