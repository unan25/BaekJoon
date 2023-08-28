import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Long fac = 1L;

        for (int i = 1; i <= N; i++) {
            fac *= i;
        }

        // 1주 = 604,800초
        System.out.println(fac / 604800);

        br.close();

    }
}