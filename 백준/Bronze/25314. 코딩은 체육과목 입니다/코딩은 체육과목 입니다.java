import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int n1 = N / 4;

        for (int i = 0; i < n1; i++){
            sb.append("long ");
        }

        System.out.println(sb + "int");
    }
}