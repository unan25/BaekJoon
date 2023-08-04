import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Set<Integer> hashSet = new HashSet<>();

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			hashSet.add(num);
		}
		
		List<Integer> list = new ArrayList<Integer>(hashSet);
		Collections.sort(list);
		
		for(int j = 0; j < list.size(); j++) {
			System.out.print(list.get(j) + " ");
		}

	}

}