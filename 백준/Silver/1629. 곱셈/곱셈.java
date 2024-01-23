import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        System.out.println(pow(a, b, c));

        br.close();
    }

    static long pow (long a, long b, long c) {
        if (b == 1) { return a % c; }
        
        long result = pow(a, b/2, c);
        
        if (b % 2 == 1) { return result * result % c * a % c; }

        return result * result % c;
    }

}