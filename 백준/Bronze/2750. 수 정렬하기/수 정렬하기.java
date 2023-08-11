import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		List<Integer> list = new ArrayList<>();

		for(int i = 0; i < T; i++) {
			int num = sc.nextInt();
			list.add(num);
		}
		
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}