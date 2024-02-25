import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
int[] answer = {};
        int[] supoza1 = {1, 2, 3, 4, 5};
        int[] supoza2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supoza3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == supoza1[i % 5]) score[0]++;
            if (answers[i] == supoza2[i % 8]) score[1]++;
            if (answers[i] == supoza3[i % 10]) score[2]++;
        }

        int max = Math.max(score[0], Math.max(score[1], score[2]));

        List<Integer> list = new ArrayList<>();



        for (int i = 0; i < 3; i++) {
            if (max == score[i]) list.add(i + 1);
        }

        answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}