package day11;

import java.util.Scanner;

public class IntegerRangeValidation {
    private static int readNumberInRange(Scanner scanner, int start, int end) {
        while (true) {
            String line = scanner.nextLine();
            try {
                int num = Integer.parseInt(line);
                if (num >= start && num <= end) {
                    return num; // Valid number (in range)
                }
            } catch (NumberFormatException ex) {
                // Parse failed, invalid number
            }
            System.out.println("Invalid number: " + line);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the range (start end): ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline character

        System.out.print("Enter an integer within the range: ");
        int number = readNumberInRange(scanner, start, end);

        System.out.println("Valid number: " + number);
    }
}
