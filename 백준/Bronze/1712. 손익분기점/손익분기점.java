import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result = 0;

		if (c - b == 0) {
			System.out.println("-1");
		} else {
			result = a / (c - b);
			if (c - b > 0) {
				System.out.println(result + 1);
			} else {
				System.out.println("-1");
			}
		}
	}
}