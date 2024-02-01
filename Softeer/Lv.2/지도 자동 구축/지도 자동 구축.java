package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Softeer 코테
https://softeer.ai/practice/6280
*/

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(DiamondSquareAlgorithm(n));
    }

    static int DiamondSquareAlgorithm(int n) {
        int[] result = new int[16];
        result[0] = 4;
        result[1] = 9;
        result[2] = 25;
        result[3] = 81;

        for (int i = 4; i < result.length; i++) {
            int temp = (int) (Math.sqrt(result[i - 1]) + (Math.sqrt(result[i - 1]) - 1));
            result[i] = (int) Math.pow(temp, 2);
        }

        return result[n];
    }
}
