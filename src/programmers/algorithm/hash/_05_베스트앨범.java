package programmers.algorithm.hash;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _05_베스트앨범 {

    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        int[] solution = new _05_베스트앨범().solution(genres, plays);
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }

    public int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();

        Map<String, Integer> playMap = new HashMap<>();
        Map<String, List<Integer>> songMap = new HashMap<>();

        int length = genres.length;
        for (int i = 0; i < length; i++) {
            String genre = genres[i];
            int play = plays[i];
            Integer playCount = playMap.getOrDefault(genre, 0) + play;
            List<Integer> songList = songMap.getOrDefault(genre, new ArrayList<>());
            songList.add(i);
            playMap.put(genre, playCount);
            songMap.put(genre, songList);
        }

        List<String> genreRanking = playMap.keySet().stream()
            .sorted(Comparator.comparing(playMap::get).reversed())
            .toList();

        for (String genre : genreRanking) {
            List<Integer> songs = songMap.get(genre).stream()
                .sorted((o1, o2) -> plays[o2] - plays[o1]).limit(2)
                .collect(Collectors.toList());

            answer.addAll(songs);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
