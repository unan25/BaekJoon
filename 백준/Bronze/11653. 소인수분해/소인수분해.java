import java.io.*;
import java.util.*;

// #11653
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		int num2 = 0;

		for (int i = 2; i <= num; i++) {
			while (num % i == 0) {
				System.out.println(i);
				num = num / i;
			}
		}

		if (num == 1) {
			System.out.println("");
		}
	}
}