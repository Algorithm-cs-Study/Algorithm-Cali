package programmers.level02.day16;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _002_할인행사 {

    public static void main(String[] args) {
//        String[] want = {"banana", "apple", "rice", "pork", "pot"};
//        int[] number = {3, 2, 2, 2, 1};
//        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        String[] want = {"apple"};
        int[] number = {10};
        String[] discount = {"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"};

        int solution = new _002_할인행사().solution(want, number, discount);
        System.out.println("solution = " + solution);
    }

    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int days = discount.length;

        String[] wantList = getShoppingList(want, number);
        for (int i = 0; i <= days - 10; i++) {
            String[] discountList = Arrays.copyOfRange(discount, i, i + 10);
            Arrays.sort(discountList);
            if (isSameArray(wantList, discountList)) {
                answer++;
            }
        }

        return answer;
    }

    private String[] getShoppingList(String[] want, int[] number) {
        String[] shoppingList = new String[10];

        int index = 0;
        int count = number[index];
        for (int i = 0; i < 10; i++) {
            if (i >= count) {
                count += number[++index];
            }
            shoppingList[i] = want[index];
        }

        Arrays.sort(shoppingList);
        return shoppingList;
    }

    private boolean isSameArray(String[] a, String[] b) {
        for (int i = 0; i < 10; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }
        return true;
    }

    private void printList(String[] arr) {
        System.out.println("arr = " + Arrays.deepToString(arr));
    }
}
