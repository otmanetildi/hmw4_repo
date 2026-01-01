package printrange;

import java.util.Scanner;

public class PrintRange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();

        if (a < b) {
            for (int i = a + 1; i < b; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = b + 1; i < a; i++) {
                System.out.println(i);
            }
        }

        scanner.close();

    }

}
