import java.io.*;
import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        String[] temp = new String[n];
        for (int i = 0; i < n; i++) {
            temp[i] = String.format("%" + n + "s", Integer.toBinaryString(arr1[i] | arr2[i])).replace(' ', '0');            
        }

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (1 == (temp[i].charAt(j) - '0')) {
                    sb.append("#");
                }
                if (0 == (temp[i].charAt(j) - '0')) {
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
        }

        return answer;
    }
}