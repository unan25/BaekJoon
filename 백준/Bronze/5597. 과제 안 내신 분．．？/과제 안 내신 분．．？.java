import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] submissions = new boolean[31];

        for (int i = 0; i < 28; i++) {
            int submittedStudent = sc.nextInt();
            submissions[submittedStudent] = true;
        }

        for (int i = 1; i <= 30; i++) {
            if (!submissions[i]) {
                System.out.println(i);
            }
        }
    }
}