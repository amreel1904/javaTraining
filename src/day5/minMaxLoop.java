package day5;

import java.util.Scanner;

public class minMaxLoop {
    public static void main(String[] args) {
        Scanner sayang = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println("Enter integers (type 'END' to finish):");

        while (true) {
            String input = sayang.nextLine();

            if (input.equals("END")) {
                break;
            }

            int number = Integer.parseInt(input);

            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }
        }

        if (min == Integer.MAX_VALUE && max == Integer.MIN_VALUE) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("Smallest number: " + min);
            System.out.println("Largest number: " + max);
        }

        sayang.close();
    }
}
