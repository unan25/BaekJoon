import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static boolean[][] visited;
    static int[][] arr;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());

        visited = new boolean[n][n];
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(line.substring(j, j + 1));
            }
        }

        List<Integer> list = new ArrayList<>();

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1 && !visited[i][j]) {
                    count++;
                    list.add(dfs(i, j));
                }
            }
        }
        sb.append(count).append("\n");

        Collections.sort(list);

        for (Integer i : list) {
            sb.append(i).append("\n");
        }

        bw.write(sb.toString().trim());

        bw.flush();
        bw.close();
        br.close();
    } // main()

    private static int dfs(int i, int j) {
        visited[i][j] = true;

        int apartments = 1; // 단지 내의 집의 수 변수

        for (int k = 0; k < 4; k++) {
            int x = i + dx[k];
            int y = j + dy[k];

            if (x >= 0 && y >= 0 && x < n && y < n) {
                if (arr[x][y] != 0 && !visited[x][y]) {
                    apartments += dfs(x, y); // DFS 호출
                }
            }
        }
        return apartments;
    }

} // Main()

