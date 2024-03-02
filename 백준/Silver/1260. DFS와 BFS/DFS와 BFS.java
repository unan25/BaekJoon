import java.io.*;
import java.util.*;

public class Main {

    static boolean visited[];
    static ArrayList<Integer>[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());   // 노드 개수
        int m = Integer.parseInt(st.nextToken());   // 에지 개수
        int start = Integer.parseInt(st.nextToken());   // 시작점

        arr = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            arr[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            arr[s].add(e);
            arr[e].add(s);
        }

        // 번호가 작은 것을 먼저 방문하기 위해 정렬하기
        for (int i = 1; i <= n; i++) {
            Collections.sort(arr[i]);
        }

        visited = new boolean[n + 1]; // 방문 배열 초기화
        DFS(start);
        System.out.println();
        visited = new boolean[n + 1]; // 방문 배열 초기화
        BFS(start);
        System.out.println();
    }

    static void DFS(int node) {
        System.out.print(node + " ");
        visited[node] = true;

        for (int i : arr[node]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    } // DFS()

    static void BFS(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visited[node] = true;

        while (!queue.isEmpty()) {
            int nowNode = queue.poll();
            System.out.print(nowNode + " ");

            for (int i : arr[nowNode]) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    } // BFS()
}