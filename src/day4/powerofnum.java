package day4;

import java.util.Scanner;

public class powerofnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input n: ");
        double n = sc.nextDouble();

        System.out.print("Input p: ");
        int p = sc.nextInt();

        double power = Math.pow(n,p);

        System.out.print("Total: "+power);

        sc.close();

    }

}
