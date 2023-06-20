package day6;

import java.util.*;

public class numbers1Nstep3 {
    public static void main(String[] args) {
        Scanner syg = new Scanner(System.in);

        int n = syg.nextInt();
        int i = 1;
        while (i < n) {
            System.out.print(i+", ");
            i += 3;
        }

        syg.close();
    }
}
