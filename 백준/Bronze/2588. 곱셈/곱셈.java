import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());

        int s1 = Integer.parseInt(String.valueOf(String.valueOf(n2).charAt(0)));
        int s2 = Integer.parseInt(String.valueOf(String.valueOf(n2).charAt(1)));
        int s3 = Integer.parseInt(String.valueOf(String.valueOf(n2).charAt(2)));

        System.out.println(n1 * s3);
        System.out.println(n1 * s2);
        System.out.println(n1 * s1);
        System.out.println(n1 * n2);

        br.close();
    }
}