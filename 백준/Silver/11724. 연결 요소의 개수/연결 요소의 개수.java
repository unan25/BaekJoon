import java.io.*;
import java.util.*;

public class Main {

    static ArrayList<Integer>[] A;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        A = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        // 인접 리스트 초기화
        for (int i = 1; i < n + 1; i++) {
            A[i] = new ArrayList<Integer>();
        }

        //  양방향 에지이므로 양쪽에 에지 더하기
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }

        int count = 0;
        // 방문하지 않은 노드가 없을 때 까지 반복
        for (int i = 1; i < n + 1; i++) {
            if (!visited[i]) {
                count++;
                DFS(i);
            }
        }
        System.out.println(count);

        br.close();
    } // main

    static void DFS(int v) {
        if (visited[v]) {
            return;
        }

        visited[v] = true;
        // 연결 노드 중 방문하지 않았던 노드만 탐색
        for (int i : A[v]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }

}

