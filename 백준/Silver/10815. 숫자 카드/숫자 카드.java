import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] 상근 = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            상근[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(상근);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");

        for (int i = 0 ; i < m; i++) {
            sb.append(binarySearch(상근, Integer.parseInt(st.nextToken()))).append(" ");
        }

        System.out.println(sb.toString().trim());
        
    } // main
    static String binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] < target) { // target 보다 작으면 오른쪽으로 이동
                start = mid + 1;
            } else if (arr[mid] > target) { // target 보다 작으면 왼쪽으로 이동
                end = mid - 1;
            }
            else { // target과 일치하면 true 반환
                return "1";
            }
        }
        return "0";  // 탐색 후에 true가 없다면 false 반환
    }
}