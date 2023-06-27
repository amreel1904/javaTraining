package day11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        LocalDate date = LocalDate.parse(scanner.nextLine());

        LocalDate nextYear1Jan = LocalDate.of(date.getYear() + 1, 1, 1);

        long daysLeft = ChronoUnit.DAYS.between(date, nextYear1Jan);
        System.out.println(daysLeft);
    }
}
