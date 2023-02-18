package programmers.level01.day02;

public class _011_나머지가1이되는수찾기 {
    public int solution(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 1) {
                return i;
            }
        }
        return n - 1;
    }
}
