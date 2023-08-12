import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();
		int a = sc.nextInt();

		if (h >= 0 && h <= 23 && m >= 0 && m <= 59) {
			if (h == 0)
				h = 24;

			int hour = h * 60 + m;
			hour = hour + a;

			h = hour / 60;
			m = hour % 60;

			if (h > 24) {
				h = h - 24;
				System.out.println(h);
			} else if (h == 24) {
				h = 0;
				System.out.println(h);
			} else {
				System.out.println(h);
			}
			System.out.println(m);

		}
	}

}