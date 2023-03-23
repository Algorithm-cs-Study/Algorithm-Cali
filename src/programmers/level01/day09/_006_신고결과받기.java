package programmers.level01.day09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class _006_신고결과받기 {

    private Map<String, User> memory = new HashMap<>();

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Set<String> reportSet = Arrays.stream(report).collect(Collectors.toSet());
        for (String id : id_list) {
            memory.put(id, new User());
        }

        for (String row : reportSet) {
            String[] split = row.split(" ");
            String reporterName = split[0];
            String reportedName = split[1];
            saveUser(reporterName, reportedName);
        }

        int index = 0;
        for (String id : id_list) {
            User user = memory.getOrDefault(id, new User());
            List<String> userBanList = user.banList;
            int count = 0;
            for (String s : userBanList) {
                if (memory.get(s).banCount >= k) {
                    count++;
                }
            }
            answer[index++] = count;
        }

        return answer;
    }

    private void saveUser(String reporterName, String reportedName) {
        User reporterUser = memory.get(reporterName);
        User reportedUser = memory.get(reportedName);
        reporterUser.addBan(reportedName);
        reportedUser.addBanCount();
    }

    private class User {

        List<String> banList = new ArrayList<>();

        int banCount = 0;

        public void addBan(String name) {
            this.banList.add(name);
        }

        public void addBanCount() {
            this.banCount++;
        }
    }
}
