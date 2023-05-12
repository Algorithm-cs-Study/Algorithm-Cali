package programmers.level02.day16;

import java.util.ArrayList;
import java.util.List;

public class _001_뉴스클러스터링 {

    public static void main(String[] args) {
//        int solution = new _001_뉴스클러스터링().solution("FRANCE", "french");
        int solution = new _001_뉴스클러스터링().solution("E=M*C^2", "e=m*c^2");
        System.out.println("solution = " + solution);
    }

    public int solution(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        List<String> str1List = getStrList(str1);
        List<String> str2List = getStrList(str2);

        int sum = str1List.size() + str2List.size();
        if (sum == 0) {
            return 65536;
        }

        int inter = 0;
        for (String subStr : str1List) {
            if (str2List.contains(subStr)) {
                inter++;
                str2List.remove(subStr);
            }
        }

        double jacquard = (double) inter / (sum - inter) * 65536;
        return (int) jacquard;
    }

    private List<String> getStrList(String str) {
        List<String> arr = new ArrayList<>();
        int length1 = str.length();
        for (int i = 1; i < length1; i++) {
            String substring = str.substring(i - 1, i + 1);
            if (substring.matches("^[a-zA-Z]*$")) {
                arr.add(substring);
            }
        }
        return arr;
    }
}
