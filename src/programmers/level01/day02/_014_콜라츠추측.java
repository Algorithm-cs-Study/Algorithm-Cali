package programmers.level01.day02;

public class _014_콜라츠추측 {

    public int solution(int num) {
        if (num == 1) return 0;
        long numL = num;
        for (int i = 1; i <= 500; i++) {
            numL = getNum(numL);
            if (numL == 1) {
                return i;
            }
        }
        return -1;
    }

    private long getNum(long num) {
        boolean isEven = num % 2 == 0;
        if (isEven) {
            num /= 2;
        } else {
            num = num * 3 + 1;
        }
        return num;
    }

    public static void main(String[] args) {
        int solution = new _014_콜라츠추측().solution(16);
        System.out.println("solution = " + solution);
    }
}
