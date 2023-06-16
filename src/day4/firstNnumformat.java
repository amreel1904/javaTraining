package day4;

import java.util.Scanner;

public class firstNnumformat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input n: ");
        int n = scanner.nextInt();
        int sum = 1;
        System.out.print("1");
        for (int i = 2; i <= n; i++) {
            System.out.print(" + " + i);
            sum += i;
        }
        System.out.print(" = " + sum);

        scanner.close();
    }
}