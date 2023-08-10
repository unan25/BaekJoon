import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			int count = 0;

			for (int j = N; j <= M; j++) {
				int t = j;
				if (t == 0) {
					count++;
					continue;
				}
				while (t > 1) {
					if (t % 10 == 0) {
						count++;
					}
					t /= 10;
				} // while
			} // for(j)

			System.out.println(count);

		} // for(i)
		sc.close();

	}
}