import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

/*
 백준 18870번
 문제 요약 : 각 좌표의 Rank 구하기
 문제 풀이 : 정렬 후 HashMap 을 이용하여 Rank 구하기
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];    // 원본
        int[] arr2 = new int[n];    // 정렬할 배열

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = arr2[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr2);

        HashMap<Integer, Integer> map = new HashMap<>();

        int num = 0;

        for (int i : arr2) {
            if (!map.containsKey(i)) {
                map.put(i, num);
                num++;
            }
        }

        for (int i : arr) {
            sb.append(map.get(i)).append(" ");
        }

        bw.write(sb.toString().trim());

        bw.flush();
        bw.close();
        br.close();
    } // main()
} // Main()