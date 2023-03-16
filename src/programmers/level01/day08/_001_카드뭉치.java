package programmers.level01.day08;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _001_카드뭉치 {

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        List<String> card1List = Arrays.stream(cards1).collect(Collectors.toList());
        List<String> card2List = Arrays.stream(cards2).collect(Collectors.toList());

        for (String s : goal) {

            if (card1List.indexOf(s) == 0) {
                card1List = getCardList(card1List);
            } else if (card2List.indexOf(s) == 0) {
                card2List = getCardList(card2List);
            } else {
                return "No";
            }
        }

        return "Yes";
    }

    private List<String> getCardList(List<String> card1List) {
        int size = card1List.size();
        card1List = card1List.subList(1, size);
        return card1List;
    }
}
