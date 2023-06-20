package day6;

import java.util.Scanner;

public class magicNumber {
    public static void main(String[] args) {
        Scanner syg = new Scanner(System.in);
        int n = syg.nextInt();
        for (int d1 = 1; d1 <= 9; d1++) {
            for (int d2 = 1; d2 <= 9; d2++) {
                for (int d3 = 1; d3 <= 9; d3++) {
                    if (d1 * d2 * d3 == n)
                        System.out.printf("%d%d%d ", d1, d2, d3);
                }
            }
        }
        syg.close();
    }
}
