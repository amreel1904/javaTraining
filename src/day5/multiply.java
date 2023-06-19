package day5;

import java.util.Scanner;

public class multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int sum = n * i;

            System.out.println(n + " x " + i + " = " + sum);
        }

        sc.close();
    }
}
