import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int a1 = a % 10;
		int a2 = (a % 100) / 10;
		int a3 = a / 100;

		int b1 = b % 10;
		int b2 = (b % 100) / 10;
		int b3 = b / 100;

		int rA = (a1 * 100) + (a2 * 10) + a3;
		int rB = (b1 * 100) + (b2 * 10) + b3;

		if (rA > rB) {
			System.out.println(rA);
		} else {
			System.out.println(rB);
		}

	}
}