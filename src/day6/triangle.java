package day6;

import java.util.*;

public class triangle {
    public static void main(String[] args) {
        Scanner syg = new Scanner(System.in);
        int n = syg.nextInt();

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print("(.)");
            }
            System.out.println();

        }

        syg.close();
    }
}
