import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// #1152
public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");

		System.out.println(st.countTokens());
	}
}