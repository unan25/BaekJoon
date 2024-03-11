import java.io.*;
import java.util.*;

// 18:05 ~ 18:

public class Main {

    static boolean visited[];
    static ArrayList<Integer>[] arr;
    static int[] answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()); // 정점
        int m = Integer.parseInt(st.nextToken()); // 간선
        int r = Integer.parseInt(st.nextToken()); // 시작 정점

        arr = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        answer = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            arr[start].add(end);
            arr[end].add(start);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(arr[i]);
        }

        bfs(r);
        for (int i = 1; i < answer.length; i++) {
            bw.write(answer[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static void bfs (int node) {
        Queue<Integer> queue = new LinkedList<>();
        int count = 1;
        queue.add(node);
        visited[node] = true;
        answer[node] = count++;

        while (!queue.isEmpty()) {
            int nowNode = queue.poll();

            for (int i : arr[nowNode]) {
                if (!visited[i]) {
                    visited[i] = true;
                    answer[i] = count++;
                    queue.add(i);
                }
            }
        }
    }
}