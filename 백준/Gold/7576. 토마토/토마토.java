import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int m, n;
    static boolean[][] visited;
    static int[][] box;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        visited = new boolean[n][m];
        box = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
                if (box[i][j] == 1) {
                    queue.offer(new int[]{i, j});
                }
            }
        }

        int days = bfs();
        if (checkAll()) {
            bw.write(String.valueOf(days));
        } else {
            bw.write("-1");
        }

        bw.flush();
        bw.close();
        br.close();
    } // main()

    private static int bfs() {
        int days = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] now = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int x = now[0] + dx[j];
                    int y = now[1] + dy[j];

                    if (x >= 0 && y >= 0 && x < n && y < m && box[x][y] == 0) {
                        box[x][y] = 1;
                        queue.offer(new int[]{x, y});
                    }
                }
            }
            days++;
        }
        return days - 1;
    } // bfs()

    static boolean checkAll() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    } // checkAll()

} // Main()