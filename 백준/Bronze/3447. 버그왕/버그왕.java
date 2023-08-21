import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException, IndexOutOfBoundsException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null) {
			while (line.contains("BUG")) {
				line = line.replace("BUG", "");
			}

			System.out.println(line);
		}

	}
}