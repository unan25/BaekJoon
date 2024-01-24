import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static ArrayList<Integer>[] A;
    static boolean arrive;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arrive = false;
        A = new ArrayList[n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            A[s].add(e);
            A[e].add(s);
        }

        for (int i = 0; i < n; i++) {
            dfs(i, 1);
            if (arrive) break;
        }

        if (arrive) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        br.close();
    } // main

    static void dfs(int n, int depth) {
        if (depth == 5 || arrive) {
            arrive = true;
            return;
        }

        visited[n] = true;
        for (int i : A[n]) {
            if (!visited[i]) {
                dfs(i, depth + 1);
            }
        }
        visited[n] = false;
    }
}