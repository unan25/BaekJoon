import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum = list.get(i) + list.get(i + 1);
			list.add(sum);
		}

		System.out.println(list.get(n));
		br.close();
	}
}