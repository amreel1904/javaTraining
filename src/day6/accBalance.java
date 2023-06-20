package day6;

import java.util.*;

public class accBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end"))
                break;

            double amount = Double.parseDouble(input);
            balance += amount;

            if (amount >= 0)

                System.out.printf("Increase: %.2f\n", amount);
            else

                System.out.printf("Decrease: %.2f\n", -amount);

        }
        System.out.printf("Balance:Balance: %.2f\n", balance);

    }
}