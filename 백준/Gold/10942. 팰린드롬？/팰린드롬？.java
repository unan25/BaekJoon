import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 총 걸린 시간 : 1시간 초과
 결론 : 투포인터 코드가 정답이 맞지만, 시간 초과
 DP(Dynamic Programming) 알고리즘을 이용해 풀어야함
 */
public class Main {
    static int[] num;
    static boolean[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        num = new int[n + 1];
        dp = new boolean[n + 1][n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n + 1; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i <= n; i++) {
            dp[i][i] = true;
        }

        for (int i = 1; i <= n - 1; i++) {
            if (num[i] == num[i + 1]) dp[i][i + 1] = true;
        }
        checkPalin(n);

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            if (dp[start][end]) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }

        System.out.println(sb);
    }

    static void checkPalin(int n) {

        for (int i = 2; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                if (num[j] == num[j + i] && dp[j + 1][j + i - 1]) {
                    dp[j][j + i] = true;
                }
            }
        }

    }
}


/* ------------------ 투포인터 알고리즘 이용 ------------------
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


 // 총 걸린 시간 : 1시간 초과
 // 결론 : 아래 코드가 정답이 맞지만, 시간 초과
 // DP(Dynamic Programming) 알고리즘을 이용해 풀어야함
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        int question = Integer.parseInt(br.readLine());
        for (int i = 0; i < question; i++) {
            StringTokenizer stQ = new StringTokenizer(br.readLine(), " ");
            int S = Integer.parseInt(stQ.nextToken()) - 1;
            int E = Integer.parseInt(stQ.nextToken()) - 1;

            bw.write(isPalindrome(list, S, E) ? "1\n" : "0\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isPalindrome(List<Integer> list, int S, int E) {
        while (S < E) {
            if (!list.get(S).equals(list.get(E))) {
                return false;
            }
            S++; E--;
        } // while

        return true;
    } // isPalindrome
}
 */