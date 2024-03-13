import java.io.*;
import java.util.*;

public class Main {

    static int[] dx = {0, 1, 0, -1}; // 우 좌
    static int[] dy = {1, 0, -1, 0}; // 하 상
    static boolean[][] visited;
    static int[][] arr;
    static int N, M;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            arr = new int[N][M];
            visited = new boolean[N][M];

            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                arr[x][y] = 1;
            } // for(j)

            count = 0;
            for (int a = 0; a < N; a++) {
                for (int b = 0; b < M; b++) {
                    if (!visited[a][b] && arr[a][b] == 1) {
                        count++;
                        BFS(a, b);
                    }
                } // for(b)
            } // for(a)
            sb.append(count).append("\n");
        } // for(i) TestCase

        bw.write(sb.toString().trim());

        bw.flush();
        bw.close();
        br.close();
    } // main()

    private static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        visited[i][j] = true;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();

            for (int k = 0; k < 4; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];

                if (x >= 0 && y >= 0 && x < N && y < M) {
                    if (arr[x][y] != 0 && !visited[x][y]) {
                        visited[x][y] = true;
                        arr[x][y] = arr[now[0]][now[1]] + 1;
                        queue.add(new int[]{x, y});
                    } // if()
                } // if()
            } // for(k)
        } // while()
    } // BFS(0

} // Main()
