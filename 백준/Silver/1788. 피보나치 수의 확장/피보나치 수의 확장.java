import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[1000001];
        dp[1] = 1;
        dp[2] = 1;

        final int mod = 1000000000;

        if (n == 0) {
            System.out.println(0);
        } else if (n < 0) { // n 음수 일 때
            n *= -1;
            if (n % 2 == 0) {
                System.out.println(-1);
            } else {
                System.out.println(1);
            }
        } else { // n 양수 일 때
            System.out.println(1);
        }

        // f(n) % 1,000,000,000
        for (int i = 3; i < n + 1; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % mod;
        }

        System.out.println(dp[n]);

        br.close();
    }
}
