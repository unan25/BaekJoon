import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken()); // 수강 가능 인원
        int l = Integer.parseInt(st.nextToken()); // 대기 목록 길이

        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (int i = 0; i < l; i++) {
            String str = br.readLine();
            if (set.contains(str)) {
                set.remove(str);
            }
            set.add(str);
        }

        for (String s : set) {
            System.out.println(s);
            if (--k == 0) break;
        }
    } // main()
} // Main()