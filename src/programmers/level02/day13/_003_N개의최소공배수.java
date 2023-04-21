package programmers.level02.day13;

import java.util.Arrays;

public class _003_N개의최소공배수 {

    public static void main(String[] args) {
        int solution = new _003_N개의최소공배수().solution(new int[]{2, 6, 8, 14});
        System.out.println("solution = " + solution);
    }

    public int solution(int[] arr) {
        Arrays.sort(arr);
        int length = arr.length;
        int num1 = arr[0], num2;
        for (int i = 1; i < length; i++) {
            num2 = arr[i];
            if (num2 % num1 == 0) {
                num1 = num2;
                continue;
            }

            num1 = num1 * num2 / gcd(num1, num2);
        }
        return num1;
    }

    public int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return gcd(num2, num1 % num2);
        }
    }
}
