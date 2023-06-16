package day4;

import java.util.Scanner;

public class firstNnumfor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input n: ");
        int n = scanner.nextInt();
        int sum= 0;
        for(int i=0; i<=n;i++)

        sum= sum+i;

        System.out.println("Total sum: "+sum);


        scanner.close();
    }
}