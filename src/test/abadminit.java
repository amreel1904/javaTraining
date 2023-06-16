package test;

import java.util.Scanner;

public class abadminit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of centuries: ");
        byte centuries = scanner.nextByte();
        
        short year = (short) (centuries * 100);
        int days = (int) (year * 365);
        int hours = (int) (days * 24);
        int minutes = (int) (hours * 60);
        long seconds = (long) (minutes * 60L);
        
        System.out.printf(
            "\n%d centuries = %d years = %d days = %d hours = %d minutes = %d seconds",
            centuries, year, days, hours, minutes, seconds);
        
        scanner.close();
    }
}
