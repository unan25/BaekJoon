import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String work = st.nextToken();

            if (work.equals("enter")) {
                set.add(name);
            } else if (work.equals("leave")) {
                set.remove(name);
            }
        }
        // 정렬
        TreeSet<String> sortedSet = new TreeSet<>(set);
        List<String> list = new ArrayList<>(sortedSet);

        // 역순으로 print
        for (int j = set.size() - 1; j >= 0; j--) {
            System.out.println(list.get(j));
        }

        br.close();
    }
}