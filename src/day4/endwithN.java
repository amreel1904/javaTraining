package day4;

import java.util.Scanner;

public class endwithN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 7; i <= n; i += 10) {
            System.out.println(i);
        }
        scanner.close();
    }
}
