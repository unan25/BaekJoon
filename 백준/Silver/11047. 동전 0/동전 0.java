import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int coins = Integer.parseInt(br.readLine());
            if (coins <= K) { // K 값 보다 작은 수만 list에 저장
                list.add(coins);
            }
        }

        int result = 0;
        for (int i = list.size() - 1 ; i >= 0; i--) {
            if (K >= list.get(i)) {
                result += K / list.get(i);
                K = K % list.get(i);
            }

        }

        System.out.println(result);
    }
}