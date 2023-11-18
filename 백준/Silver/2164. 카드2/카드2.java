import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> myQ = new LinkedList<>();
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++){
            myQ.add(i);
        }

        while (myQ.size() > 1) {
            myQ.poll();
            int temp = myQ.poll();
            myQ.add(temp);
        }
        System.out.println(myQ.poll());
    }
}