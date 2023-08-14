import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long num1 = Long.parseLong(st.nextToken());
		long num2 = Long.parseLong(st.nextToken());
		
		 if (num1 > num2) {
	            long temp = num1;
	            num1 = num2;
	            num2 = temp;
	        }

		long result = sum(num2) - sum(num1 - 1);
		System.out.println(result);

		br.close();
	}

	public static long sum(long N) {
		return N * (N + 1) / 2;
	}
}