package day5;

import java.util.Scanner;

public class minmaxnum {
    public static void main(String[] args) {
        Scanner amreel = new Scanner(System.in);

        System.out.print("Enter the count of numbers: ");
        int n = amreel.nextInt();
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = amreel.nextInt();
            if (number > maxNumber) {
                maxNumber = number;
            }
            if (number < minNumber) {
                minNumber = number;
            }
        }

        System.out.println("The greater number is: " + maxNumber);
        System.out.println("The smallest number is: " + minNumber);

        amreel.close();
    }
}


