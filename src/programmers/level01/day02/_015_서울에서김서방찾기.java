package programmers.level01.day02;

public class _015_서울에서김서방찾기 {

    public String solution(String[] seoul) {
        StringBuilder sb = new StringBuilder();
        int x = 0;
        for (int i = 0; i < seoul.length; i++) {
            if ("Kim".equals(seoul[i])) {
                x = i;
                break;
            }
        }
        sb.append("김서방은 ").append(x).append("에 있다");

        return sb.toString();
    }
}
