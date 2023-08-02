import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		String arr[] = new String[str.length()];

		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.substring(i, i + 1);
		}

		Arrays.sort(arr, Collections.reverseOrder());
		for(int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]);
		}

	}
}