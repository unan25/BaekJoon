import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		double[] score = new double[n];

		for (int i = 0; i < n; i++) {
			score[i] = Double.parseDouble(br.readLine());
		}

		Arrays.sort(score);

		for (int j = 0; j < 7; j++) {
			System.out.printf("%.3f\n", score[j]);
		}
	}

}