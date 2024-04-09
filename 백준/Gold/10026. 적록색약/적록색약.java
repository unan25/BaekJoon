import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static String[][] arr;
    static boolean[][] visited;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());

        arr = new String[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = line.substring(j, j + 1);
            }
        }

        int count = 0;

        // 일반인
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    count++;
                    bfs(i, j);
                }
            }
        }

        sb.append(count).append(" ");

        // R, G "G"로 통일
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ("R".equals(arr[i][j])) {
                    arr[i][j] = "G";
                }
            }
        }

        count = 0;
        visited = new boolean[n][n];
        // 적록색약인
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    count++;
                    bfs(i, j);
                }
            }
        }
        sb.append(count);

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    } // main()


    private static void bfs(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        visited[i][j] = true;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int a = now[0];
            int b = now[1];

            for (int k = 0; k < 4; k++) {
                int x = a + dx[k];
                int y = b + dy[k];

                if (x >= 0 && y >= 0 && x < n && y < n) {
                    if (!visited[x][y] && arr[x][y].equals(arr[a][b])) {  // 방문 X && 같은 문자
                        visited[x][y] = true;
                        queue.add(new int[]{x, y});
                    }
                }
            }
        } // while
    } // bds
} // Main