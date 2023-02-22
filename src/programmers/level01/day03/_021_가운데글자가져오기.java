package programmers.level01.day03;

public class _021_가운데글자가져오기 {
    public String solution(String s) {
        int length = s.length();
        int target = length / 2;
        if (length % 2 == 0) {
            return new StringBuilder().append(s.charAt(target - 1)).append(s.charAt(target)).toString();
        } else {
            return String.valueOf(s.charAt(target));
        }
    }

    public static void main(String[] args) {
        String qwer = new _021_가운데글자가져오기().solution("qwer");
        System.out.println("qwer = " + qwer);
    }
}
