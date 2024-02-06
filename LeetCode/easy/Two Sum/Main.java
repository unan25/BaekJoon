package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ,[]");

        int[] nums = new int[st.countTokens()];
        int target = Integer.parseInt(br.readLine());
        int n = 0;

        while (st.hasMoreTokens()) {
            nums[n] = Integer.parseInt(st.nextToken());
            n++;
        }

        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }
}
