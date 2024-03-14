import java.io.*;
import java.util.*;

public class Main {

    static int[] dx = {0, 1, 0, -1}; // 우 좌
    static int[] dy = {1, 0, -1, 0}; // 하 상
    static boolean[][] visited;
    static int[][] arr;
    static int N;
    static int count;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());

        arr = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(line.substring(j, j + 1));
            }
        }

        count = 0;
        List<Integer> list = new ArrayList<>();
        for (int a = 0; a < N; a++) {
            for (int b = 0; b < N; b++) {
                if (!visited[a][b] && arr[a][b] == 1) {
                    count++;
                    list.add(BFS(a, b));
                }
            }
        }
        sb.append(count).append("\n");

        Collections.sort(list);
        for (Integer integer : list) {
            sb.append(integer).append("\n");
        }

        bw.write(sb.toString().trim());

        bw.flush();
        bw.close();
        br.close();
    } // main()


    private static int BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        visited[i][j] = true; // 방문 기록
        int cnt = 1; // 35번째줄 이중 for문을 통해 단지들을 탐색했기 때문에 1부터 시작

        while (!queue.isEmpty()) {
            int[] now = queue.poll();

            for (int k = 0; k < 4; k++) { // 상하좌우 탐색 dx, dy
                int x = now[0] + dx[k]; // 좌우
                int y = now[1] + dy[k]; // 상하

                if (x >= 0 && y >= 0 && x < N && y < N) { // 배열 범위를 넘어가면 안됨, 좌표 유효성 검사
                    if (arr[x][y] != 0 && !visited[x][y]) { // 0이 아니거나, 방문하지 않은 노드인 경우
                        visited[x][y] = true;
                        cnt++;
                        queue.add(new int[]{x, y});
                    } // if()
                } // if()
            } // for(k)
        } // while()
        return cnt;
    } // BFS(0

} // Main()
