package programmers.level01.day02;

public class _017_핸드폰번호가리기 {

    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        int length = phone_number.length();
        int leftLength = length - 4;
        String masking = "*";
        sb.append(masking.repeat(leftLength)).append(phone_number.substring(leftLength, length));
        return sb.toString();
    }

    public static void main(String[] args) {
        String solution = new _017_핸드폰번호가리기().solution("010010010010");
        System.out.println("solution = " + solution);
    }
}
