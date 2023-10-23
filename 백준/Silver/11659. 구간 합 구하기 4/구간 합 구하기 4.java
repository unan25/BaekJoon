import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        StringTokenizer st1 = new StringTokenizer(str1, " ");
        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());

        int[] arr = new int[n];
        String str2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(str2, " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        // 누적 합 배열
        int[] sum = new int[n];
        sum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i-1] + arr[i];
        }

        for (int i = 0; i < m; i++){
            StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st3.nextToken());
            int b = Integer.parseInt(st3.nextToken());

            if (a == 1) {
                System.out.println(sum[b - 1]);
            } else {
                System.out.println(sum[b - 1] - sum[a - 2]);
            }

        }
    }


}