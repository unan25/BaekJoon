import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		int fake1 = 0;
		int fake2 = 0;

		for (int i = 0; i < 9; i++) {
			int num = Integer.parseInt(br.readLine());

			list.add(num);

			sum = sum + list.get(i);
		}

		Collections.sort(list);

		for (int i = 0; i < list.size(); i++) {
			for(int j = i+1; j < list.size(); j++) {
				if(sum - list.get(i)- list.get(j) == 100) {
					fake1 = list.get(i);
					fake2 = list.get(j);
				}
			}
		}

		for (int k = 0; k < list.size(); k++) {
			if(fake1 == list.get(k) || fake2 == list.get(k))
				continue;
			System.out.println(list.get(k));
		}
	}
}