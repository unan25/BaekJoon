import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int n, m;
    static boolean[] visited;
    static int[] arr;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visited = new boolean[n + 2];
        arr = new int[n + 1];

        dfs(0);
        bw.write(sb.toString().trim());

        bw.flush();
        bw.close();
        br.close();
    }

    static void dfs(int depth) throws IOException {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i;
                visited[i] = false;
                dfs(depth + 1);
            }
        }
    }
}