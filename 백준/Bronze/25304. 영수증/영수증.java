import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int receiptTotal = scanner.nextInt(); // 영수증에 적힌 총 금액
        int itemCount = scanner.nextInt(); // 구매한 물건의 종류의 수

        int calculatedTotal = 0; // 구매한 물건의 가격과 개수로 계산한 총 금액

        for (int i = 0; i < itemCount; i++) {
            int price = scanner.nextInt(); // 물건의 가격
            int quantity = scanner.nextInt(); // 물건의 개수
            calculatedTotal += price * quantity;
        }

        if (receiptTotal == calculatedTotal) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}