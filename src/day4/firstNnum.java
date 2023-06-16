package day4;

import java.util.Scanner;

public class firstNnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input n: ");
        int n = scanner.nextInt();
        int sum= n*(n+1)/2;

        System.out.println("Total sum: "+sum);


        scanner.close();
    }
}