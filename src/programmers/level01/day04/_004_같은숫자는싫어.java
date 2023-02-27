package programmers.level01.day04;

import java.util.LinkedList;
import java.util.List;

public class _004_같은숫자는싫어 {

    public int[] solution(int []arr) {
        List<Integer> list = new LinkedList<>();
        int prevI = -1;
        for (int i : arr) {
            if (i == prevI) continue;
            prevI = i;
            list.add(i);
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}
