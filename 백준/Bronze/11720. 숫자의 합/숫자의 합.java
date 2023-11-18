import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String str = sc.next();
		int result = 0;

		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(str.substring(i, i+1));
			result += temp;
		}
		System.out.println(result);
	}
}