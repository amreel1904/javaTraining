package day5;

import java.util.Scanner;

public class marketplace {
    public static void main(String[] arg) {

        Scanner sayang = new Scanner(System.in);
        System.out.println("Select product: ");
        String product = sayang.nextLine();
        System.out.println("Select day: ");
        String day = sayang.nextLine();

        String product1 = "banana", product2 = "kiwi", product3 = "apple";
        String d1 = "monday", d2 = "tuesday", d3 = "wednesday", d4 = "thursday", d5 = "friday", d6 = "saturday",
                d7 = "sunday";

        if (product.equals(product1)) {
            if (day.equals(d6) || day.equals(d7)) {
                System.out.println("The price is 2.70");
            } else
                System.out.println("The price is 2.50");

        }

        if (product.equals(product2)) {
            if (day.equals(d6) || day.equals(d7)) {
                System.out.println("The price is 1.60");
            } else
                System.out.println("The price is 1.30");

        }
        if (product.equals(product3)) {
            if (day.equals(d6) || day.equals(d7)) {
                System.out.println("The price is 3.00");
            } else
                System.out.println("The price is 2.20");

        }
        sayang.close();
    }
}