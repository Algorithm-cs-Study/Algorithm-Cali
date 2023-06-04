package programmers.algorithm.heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class _02_디스크컨트롤러 {

    public static void main(String[] args) {
        int solution = new _02_디스크컨트롤러().solution(new int[][]{{0, 3}, {1, 9}, {2, 6}});
        System.out.println("solution = " + solution);
    }

    public int solution(int[][] jobs) {
        int answer = 0, now = 0;
        // 시간 순으로 작업 대기열 생성
        Queue<Task> taskQueue = createTaskQueue(jobs);

        // 작업기간 짧은 순 힙 -> SJF 스케줄러
        Queue<Task> sjfScheduler = new PriorityQueue<>(
            Comparator.comparing(p -> p.duration));

        // 대기열, 스케줄러 둘 다 비어있으면 중지
        while (isTaskDone(taskQueue, sjfScheduler)) {

            // 현재 시점(now) 기준으로 실행시킬 수 있는 작업은 스케줄러에 등록
            while (!taskQueue.isEmpty()) {
                Task readyTask = taskQueue.peek();
                if (readyTask.reqAt <= now) {
                    sjfScheduler.add(taskQueue.poll());
                    continue;
                }
                break;
            }

            // 스케줄러가 비어있을 경우 먼저 요청이 들어온 작업을 기준으로 세팅
            if (sjfScheduler.isEmpty()) {
                Task readyTask = taskQueue.poll();
                sjfScheduler.add(readyTask);
                now = readyTask.reqAt;
                continue;
            }

            // 스케줄러에 의한 작업 처리
            Task task = sjfScheduler.poll();
            int reqAt = task.reqAt;
            int duration = task.duration;

            now += duration;
            answer += now - reqAt;
        }

        return answer / jobs.length;
    }

    /**
     * 시간 순 대기열 생성
     * @param jobs
     * @return
     */
    private Queue<Task> createTaskQueue(int[][] jobs) {
        Queue<Task> queue = new PriorityQueue<>(Comparator.comparing(p -> p.reqAt));
        for (int[] job : jobs) {
            queue.add(new Task(job[0], job[1]));
        }
        return queue;
    }

    /**
     * 대기열, 스케줄러 둘 다 비어있으면 true
     * @param taskQueue
     * @param sjfScheduler
     * @return
     */
    private boolean isTaskDone(Queue<Task> taskQueue, Queue<Task> sjfScheduler) {
        return !taskQueue.isEmpty() || !sjfScheduler.isEmpty();
    }

    private class Task {

        public int reqAt;
        public int duration;

        public Task(int reqAt, int duration) {
            this.reqAt = reqAt;
            this.duration = duration;
        }
    }
}
