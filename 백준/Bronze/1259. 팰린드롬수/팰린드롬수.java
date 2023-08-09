import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String num = br.readLine();
			if (Integer.parseInt(num) == 0) {
				break;
			}
			String revNum = "";
			for (int i = num.length() - 1; i >= 0; i--) {
				revNum += num.charAt(i);
			}
			if (num.equals(revNum)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		br.close();
	}
}