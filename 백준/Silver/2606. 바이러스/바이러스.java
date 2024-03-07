import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static boolean[] visited;
    static ArrayList<Integer>[] arr;
    static int depth;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        visited = new boolean[n + 1];
        arr = new ArrayList[n + 1];

        for (int i = 0; i < n + 1; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 1; i < m + 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            arr[start].add(end);
            arr[end].add(start);
        }

        dfs(1);
        bw.write(String.valueOf(depth));

        bw.flush();
        bw.close();
        br.close();
    }

    static void dfs(int n) {
        if (visited[n]) {
            return;
        }

        visited[n] = true;

        for (int i : arr[n]) {
            if (!visited[i]) {
                depth++;
                dfs(i);
            }
        }
    }
}