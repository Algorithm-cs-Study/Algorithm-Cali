package programmers.algorithm.heap;

import java.util.Collections;
import java.util.LinkedList;

public class _03_이중우선순위큐 {

    public static void main(String[] args) {
        int[] solution = new _03_이중우선순위큐().solution(
            new String[]{"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"});
        System.out.println(solution[0] + ", " + solution[1]);
    }

    private final String DELETE_MAX = "D 1";
    private final String DELETE_MIN = "D -1";
    private final String INSERT = "I";

    /**
     * Heap 대신에 LinkedList를 사용하였습니다.
     *
     * 우선순위큐를 사용하여도 내부적으로 while문으로 정렬하는 과정이 있기에
     * LinkedList를 이용해 sorting 해주고 계산하는 것이 낫다고 생각했습니다.
     */
    public int[] solution(String[] operations) {
        LinkedList<Integer> list = new LinkedList<>();

        for (String operation : operations) {
            if (operation.startsWith(INSERT)) {
                int value = Integer.parseInt(operation.split(" ")[1]);
                list.add(value);
                Collections.sort(list);
                continue;
            }

            if (list.isEmpty()) {
                continue;
            }

            if (operation.equals(DELETE_MAX)) {
                list.removeLast();
                continue;
            }

            if (operation.equals(DELETE_MIN)) {
                list.removeFirst();
            }
        }

        return createResult(list);
    }

    private int[] createResult(LinkedList<Integer> list) {
        int[] result = new int[2];

        if (!list.isEmpty()) {
            result[0] = list.getLast();
            result[1] = list.getFirst();
        }

        return result;
    }
}
