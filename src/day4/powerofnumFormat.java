package day4;

import java.util.Scanner;

public class powerofnumFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input n: ");
        double n = sc.nextDouble();

        System.out.print("Input p: ");
        int p = sc.nextInt();

        double power = 1;
        for (int i = 0; i < p; i++) {
            power = power * n;
        }
        System.out.print("Total: " + power);

        sc.close();

    }

}
