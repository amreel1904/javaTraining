package day5;

import java.util.*;

public class modulus234 {
    public static void main(String[] args) {
        Scanner syg = new Scanner(System.in);

        System.out.print("Enter count: ");
        int n = syg.nextInt();

        int cD2 = 0, cD3 = 0, cD4 = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter an integer number: ");
            int number = syg.nextInt();

            if (number % 2 == 0) {
                cD2++;
            }
            if (number % 3 == 0) {
                cD3++;
            }
            if (number % 4 == 0) {
                cD4++;
            }
        }

        double percentageDivBy2 = (cD2 * 100.0) / n;
        double percentageDivBy3 = (cD3 * 100.0) / n;
        double percentageDivBy4 = (cD4 * 100.0) / n;

        System.out.println("Percentages:");
        System.out.printf("Divisible by 2: %.2f%%\n", percentageDivBy2);
        System.out.printf("Divisible by 3: %.2f%%\n", percentageDivBy3);
        System.out.printf("Divisible by 4: %.2f%%\n", percentageDivBy4);
        syg.close();
    }

}
