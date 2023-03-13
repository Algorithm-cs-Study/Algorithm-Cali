package programmers.level01.day07;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _002_로또최고순위와최저순위 {

    public int[] solution(int[] lottos, int[] win_nums) {
        List<Integer> winNumList = Arrays.stream(win_nums).mapToObj(i -> i)
            .collect(Collectors.toList());
        int zeroCount = 0, matchCount = 0;
        for (int lottoNum : lottos) {
            if (lottoNum == 0) {
                zeroCount++;
                continue;
            }
            if (winNumList.contains(lottoNum)) {
                matchCount++;
            }
        }

        int minRank = 7 - matchCount;
        return new int[]{Math.min(minRank - zeroCount, 6), Math.min(minRank, 6)};
    }
}
