package programmers.level01.day08;

public class _003_키패드누르기 {

    /**
     * 이 문제는 풀다가 막혀서 챗gpt 찬스 썼습니다.
     */
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder(); // 결과 문자열을 저장할 StringBuilder 객체
        int left = 10; // 왼손 엄지손가락의 현재 위치 (10은 '*' 키패드를 의미)
        int right = 12; // 오른손 엄지손가락의 현재 위치 (12는 '#' 키패드를 의미)

        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) { // 왼쪽 열의 숫자를 누르는 경우
                sb.append("L"); // 왼손 엄지손가락을 사용
                left = num; // 왼손 엄지손가락 위치 업데이트
            } else if (num == 3 || num == 6 || num == 9) { // 오른쪽 열의 숫자를 누르는 경우
                sb.append("R"); // 오른손 엄지손가락을 사용
                right = num; // 오른손 엄지손가락 위치 업데이트
            } else { // 가운데 열의 숫자를 누르는 경우
                int leftDist = getDistance(left, num); // 왼손 엄지손가락과 해당 숫자까지의 거리 계산
                int rightDist = getDistance(right, num); // 오른손 엄지손가락과 해당 숫자까지의 거리 계산

                if (leftDist < rightDist || (leftDist == rightDist && hand.equals("left"))) {
                    sb.append("L"); // 왼손 엄지손가락을 사용
                    left = num; // 왼손 엄지손가락 위치 업데이트
                } else {
                    sb.append("R"); // 오른손 엄지손가락을 사용
                    right = num; // 오른손 엄지손가락 위치 업데이트
                }
            }
        }

        return sb.toString();
    }

    // 현재 엄지손가락 위치와 목표 숫자의 위치까지의 거리를 계산하는 함수
    private int getDistance(int finger, int target) {
        if (finger == 0) finger = 11; // 0의 위치는 11로 치환하여 계산
        if (target == 0) target = 11; // 0의 위치는 11로 치환하여 계산

        int fingerX = (finger - 1) / 3;
        int fingerY = (finger - 1) % 3;
        int targetX = (target - 1) / 3;
        int targetY = (target - 1) % 3;

        return Math.abs(fingerX - targetX) + Math.abs(fingerY - targetY);
    }

}
