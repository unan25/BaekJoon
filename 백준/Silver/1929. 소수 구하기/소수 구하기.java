import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean[] isPrime = new boolean[m + 1];
        for (int i = 2; i <= m; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= m; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= m; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = n; i <= m; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }
}
