import java.io.*;
import java.util.*;

public class Main {
    static int M, N;
    static int[][] box;
    static boolean[][] visited;
    static Queue<Point> queue = new LinkedList<>();
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        box = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
                if (box[i][j] == 1)
                    queue.offer(new Point(i, j));
            }
        }

        int days = bfs();
        if (checkAll())
            System.out.println(days);
        else
            System.out.println(-1);
    }

    static int bfs() {
        int days = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Point cur = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int nx = cur.x + dx[j];
                    int ny = cur.y + dy[j];

                    if (nx >= 0 && ny >= 0 && nx < N && ny < M && box[nx][ny] == 0) {
                        box[nx][ny] = 1;
                        queue.offer(new Point(nx, ny));
                    }
                }
            }
            days++;
        }

        return days - 1;
    }

    static boolean checkAll() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 0)
                    return false;
            }
        }
        return true;
    }
}

class Point {
    int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}