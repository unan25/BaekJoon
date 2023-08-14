import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		List<String> list = new ArrayList<>();

		for (int i = 0; i < T; i++) {
			String str = br.readLine();
			list.add(str);
		}
		List<String> newList = list.stream().distinct().collect(Collectors.toList()); // 중복제거
		Collections.sort(newList); // 사전순
		Collections.sort(newList, (String a, String b) -> a.length() - b.length()); // 길이순

		for (int i = 0; i < newList.size(); i++) {
			System.out.println(newList.get(i));
		}
	}
}