import java.io.*;
import java.util.*;

public class Main {

    static int visited[];
    static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());   // 노드 개수
        int m = Integer.parseInt(st.nextToken());   // 에지 개수
        int r = Integer.parseInt(st.nextToken());   // 시작점

        visited = new int[n + 1];
        
        // 그래프 초기화
        for (int i = 0; i <= n; i++) {
            arr.add(new ArrayList<Integer>());
        }

        // 리스트에 값 저장
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            arr.get(s).add(e);
            arr.get(e).add(s);
        }

        // 번호가 작은 것을 먼저 방문하기 위해 정렬하기
        for (int i = 1; i <= n; i++) {
            Collections.sort(arr.get(i));
        }

        count = 1;
        DFS(r);

        for (int i = 1; i < visited.length; i++) {
            sb.append(visited[i]).append("\n");
        }

        bw.write(sb.toString().trim());

        bw.flush();
        bw.close();
        br.close();
    }

    static void DFS(int node) {
        visited[node] = count;

        for (int i = 0; i < arr.get(node).size(); i++) {
            int newNode = arr.get(node).get(i);
            if (visited[newNode] == 0) {
                count++;
                DFS(newNode);
            }
        }
    } // DFS()
}