import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Integer> sumList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(sc.next());
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list);
        sumList.add(list.get(0));
        for (int i = 1; i < N; i++) {
            sumList.add(sumList.get(i - 1) + list.get(i));
        }

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += sumList.get(i);
        }
        System.out.println(sum);

    } // main()
} // Main ()