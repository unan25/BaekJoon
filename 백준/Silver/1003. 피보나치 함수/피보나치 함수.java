import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  20:45 ~ 21:05
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int[] fibonacci = new int[41];

        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                sb.append("1 0\n");
            }
            else {
                sb.append(fibonacci[n-1] + " " + fibonacci[n] + "\n");
            }
        }

        System.out.println(sb.toString().trim());

        br.close();
    }
}
