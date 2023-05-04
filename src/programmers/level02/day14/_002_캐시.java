package programmers.level02.day14;

import java.util.LinkedList;
import java.util.Queue;

public class _002_캐시 {

    public static void main(String[] args) {
//        int solution = new _002_캐시().solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"});
//        int solution = new _002_캐시().solution(2, new String[]{"Jeju", "Pangyo", "NewYork", "newyork"});
//        int solution = new _002_캐시().solution(0, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"});
        int solution = new _002_캐시().solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"});
        System.out.println("solution = " + solution);
    }

    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if (cacheSize == 0) {
            return cities.length * 5;
        }

        Queue<String> cache = new LinkedList<>();
        for (String city : cities) {
            city = city.toLowerCase();

            if (cache.contains(city)) {
                answer++;
                cache.remove(city);
            } else {
                answer += 5;
            }

            cache.add(city);
            if (cache.size() > cacheSize) {
                cache.poll();
            }
        }

        return answer;
    }
}
