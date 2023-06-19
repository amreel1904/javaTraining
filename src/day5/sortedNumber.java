package day5;

import java.util.Scanner;

public class sortedNumber {
    public static void main(String[] args) {
        Scanner sayang = new Scanner(System.in);

        int n1 = sayang.nextInt();
        int n2 = sayang.nextInt();
        int n3 = sayang.nextInt();
        
        if (n1<n2 && n1<n3 && n2<n3)
        System.out.println("Ascending");
        else if (n1>n2&&n2>n3)
        System.out.println("Descending");
        else
        System.out.println("Not sorted");

        sayang.close();
    }
}
