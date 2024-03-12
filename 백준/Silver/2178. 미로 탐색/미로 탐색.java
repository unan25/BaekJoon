import java.io.*;
import java.util.*;

public class Main {

    static int[] dx = {0, 1, 0, -1}; // 우 좌
    static int[] dy = {1, 0, -1, 0}; // 하 상
    static boolean[][] visited;
    static int[][] arr;
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken(); // 101011
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(line.substring(j, j + 1)); // 1, 0, 1, 0 ...
            }
        }

        BFS(0, 0);
        bw.write(String.valueOf(arr[n - 1][m - 1]));

        bw.flush();
        bw.close();
        br.close();
    } // main()

    private static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});

        while (!queue.isEmpty()) {
            int now[] = queue.poll();
            visited[i][j] = true; // 방문 기록
            for (int k = 0; k < 4; k++) { // 상하좌우 탐색 dx, dy
                int x = now[0] + dx[k]; // 좌우
                int y = now[1] + dy[k]; // 상하

                if (x >= 0 && y >= 0 && x < n && y < m) { // 배열 범위를 넘어가면 안됨, 좌표 유효성 검사
                    if (arr[x][y] != 0 && !visited[x][y]) { // 0이 아니거나, 방문하지 않은 노드인 경우
                        visited[x][y] = true;
                        arr[x][y] = arr[now[0]][now[1]] + 1;
                        queue.add(new int[]{x, y});
                    } // if()
                } // if()
            } // for(k)
        } // while()
    } // BFS(0

} // Main()
