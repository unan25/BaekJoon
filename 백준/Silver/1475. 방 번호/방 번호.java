import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int arr[] = new int[10];

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            arr[ch-48]++;
        }
        // 6, 9 뒤집기
        int n = arr[6] + arr[9];
        if (n % 2 == 0) {
            arr[6] = n / 2;
            arr[9] = n / 2;
        } else {
            arr[6] = n / 2 + 1;
            arr[9] = n / 2 + 1;
        }

        Arrays.sort(arr);
        System.out.println(arr[9]);
    }
}