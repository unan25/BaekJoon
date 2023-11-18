import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();


        StringTokenizer st2 = new StringTokenizer(br.readLine());
        while (st2.hasMoreTokens()) {
            list.add(Integer.parseInt(st2.nextToken()));
        }

        Collections.sort(list);
        System.out.println(list.get(K - 1));

        br.close();


    } // main()
} // Main ()
