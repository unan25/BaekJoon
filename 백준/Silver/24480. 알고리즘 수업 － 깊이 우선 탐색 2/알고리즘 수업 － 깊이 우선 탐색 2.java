import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    static int[] visited;
    static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    static int depth;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int v = Integer.parseInt(st.nextToken()); // 정점 집합 (노드)
        int e = Integer.parseInt(st.nextToken()); // 간선 집합
        int r = Integer.parseInt(st.nextToken()); // 시작 정점

        visited = new int[v + 1];

        // 인접리스트 생성 및 초기화
        for (int i = 0; i <= v; i++) {
            arr.add(new ArrayList<>());
        }

        // 양방향 에지
        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            arr.get(start).add(end);
            arr.get(end).add(start);
        }

        for (int i = 0; i <= v; i++) {
            arr.get(i).sort(Collections.reverseOrder());
        }

        depth = 1;
        DFS(r);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < visited.length; i++) {
            sb.append(visited[i]).append("\n");
        }

        bw.write(sb.toString().trim());

        bw.flush();
        bw.close();
        br.close();
    }

    static void DFS(int n) {
        visited[n] = depth;

        for (int i = 0; i < arr.get(n).size(); i++) {
            int newNode = arr.get(n).get(i);

            if (visited[newNode] == 0) {
                depth++;
                DFS(newNode);
            }
        }
    } // DFS
}