package day4;

import java.util.Scanner;

public class sumNnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();

        double sum = 0;
        for (int i = 0; i < n; i += 1) {
            System.out.print("sum:");
            sum += scanner.nextDouble();
        }
        System.out.println(sum);
        scanner.close();
    }
}
