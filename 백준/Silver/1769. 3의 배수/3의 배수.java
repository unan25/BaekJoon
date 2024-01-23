import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String x = br.readLine();
        int count = 0;

        while (x.length() > 1) {
            int sum = 0;
            for (char ch : x.toCharArray()) {
                sum += ch - '0';
            }
            x = Integer.toString(sum);
            count++;
        }

        int result = Integer.parseInt(x);

        System.out.println(count);
        System.out.println(result % 3 == 0 ? "YES" : "NO");

        br.close();
    }
}