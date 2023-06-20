package day6;

import java.util.*;

public class triangle {
    public static void main(String[] args) {
        Scanner syg = new Scanner(System.in);
        int n = syg.nextInt();

        // for (int row = 1; row <= n; row++) {

        // for (int col = 1; col <= row; col++) {
        // System.out.print("(.)");
        // }
        // System.out.println();

        // }
        int row = 1;
        while (row <= n) {
            int col = 1;
            while (col <= row) {
                System.out.print("(.)");
                col++;
            }
            System.out.println();
            row++;
        }
        System.out.println();
        syg.close();
    }
}
