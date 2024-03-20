import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int n = 0;

        for (int[] command : commands) {
            int k = 0;

            int[] list = new int[command[1] - command[0] + 1];

            for (int j = command[0]; j <= command[1]; j++) {
                list[k++] = array[j - 1];
            }

            Arrays.sort(list);
            answer[n++] = list[command[2] - 1];
        }

        return answer;
    }
}