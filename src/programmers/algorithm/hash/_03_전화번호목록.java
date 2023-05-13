package programmers.algorithm.hash;

import java.util.Arrays;
import java.util.stream.Collectors;

public class _03_전화번호목록 {

    public static void main(String[] args) {
        boolean solution = new _03_전화번호목록().solution(new String[]{"12","123","1235","567","88"});
        System.out.println("solution = " + solution);
    }

    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        int length = phone_book.length;
        for (int i = 1; i < length; i++) {
            String std = phone_book[i - 1];
            String phone = phone_book[i];

            if (phone.startsWith(std)) {
                return false;
            }
        }

        return true;
    }
}
