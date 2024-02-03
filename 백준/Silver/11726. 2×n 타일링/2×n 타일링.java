import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
15:20 ~ 15:49
*/

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            if (i == 2) {
                dp[i] = 2;
            } else {
                dp[i] = (dp[i - 2] + dp[i - 1]) % 10007;
            }
        }

        System.out.println(dp[n]);
    }
}