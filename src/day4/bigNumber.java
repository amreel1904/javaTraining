package day4;

import java.util.*;

public class bigNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        System.out.println("The greater number is: " + maxNumber);

        sc.close();
    }
}
