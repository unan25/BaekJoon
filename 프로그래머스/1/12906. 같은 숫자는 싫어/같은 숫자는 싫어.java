import java.io.*;
import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};

        Stack<Integer> stack = new Stack<>();

        stack.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            stack.add(arr[i]);
            if (arr[i] == arr[i - 1]) {
                stack.pop();
            }
        }

        answer = new int[stack.size()];
        
        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }


        return answer;
    }
}