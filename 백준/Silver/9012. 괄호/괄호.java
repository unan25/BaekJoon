import java.io.*;
import java.util.*;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String s = br.readLine();

			if (VPS(s)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
    
	public static boolean VPS(String str) {
		int count = 0;
		char[] arr = str.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];

			if (ch == '(') {
				count++;
			} else if (ch == ')') {
				count--;
			}

			if (count < 0) {
				return false;
			}
		}
		return count == 0;
	} // VPS()
}