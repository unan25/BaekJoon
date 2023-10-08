import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine()); // 테스트 케이스 개수


        for (int i = 0; i < K; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            List<Integer> list = new ArrayList<>();
            int N = Integer.parseInt(st.nextToken());
            for (int j = 0; j < N; j++) {
                list.add(Integer.parseInt(st.nextToken()));

            }
            Collections.sort(list);
            int max = list.get(list.size() - 1);
            int min = list.get(0);
            int LargestGap = 0;

            for (int k = 0; k < N - 1; k++) {
                int gap = list.get(k + 1) - list.get(k);
                if (gap > LargestGap) {
                    LargestGap = gap;
                }
            }
            System.out.println("Class " + (i + 1));
            System.out.println("Max " + max + ", Min " + min + ", Largest gap " + LargestGap);
        }
    }
}