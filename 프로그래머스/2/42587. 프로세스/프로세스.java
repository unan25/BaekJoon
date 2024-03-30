import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{i, priorities[i]});
        }

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            boolean flag = true;

            for (int[] doc : queue) {
                if (doc[1] > current[1]) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                answer++;
                if (current[0] == location) {
                    break;
                }
            } else {
                queue.offer(current);
            }
        }

        return answer;
    }
}