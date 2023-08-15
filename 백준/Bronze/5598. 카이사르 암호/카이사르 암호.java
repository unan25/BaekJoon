import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String decrypted = decrypt(input);
		System.out.println(decrypted);
	}

	public static String decrypt(String encrypted) {
		StringBuilder decrypted = new StringBuilder();
		for (int i = 0; i < encrypted.length(); i++) {
			char c = encrypted.charAt(i);
			char decryptedChar = (char) (c - 3);
			if (decryptedChar < 'A') {
				decryptedChar = (char) (decryptedChar + 26);
			}
			decrypted.append(decryptedChar);
		}
		return decrypted.toString();
	}
}