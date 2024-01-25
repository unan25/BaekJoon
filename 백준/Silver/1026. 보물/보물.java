import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while (st.hasMoreTokens()) {
            list1.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine(), " ");
        while (st.hasMoreTokens()) {
            list2.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list1);
        Collections.sort(list2);
        Collections.reverse(list2);

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += list1.get(i) * list2.get(i);
        }

        System.out.println(sum);
        
        br.close();
    } // main

}