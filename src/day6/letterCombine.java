package day6;

import java.util.*;

public class letterCombine {
    public static void main(String[] args) {
        Scanner syg = new Scanner(System.in);
        char start = syg.nextLine().charAt(0);
        char end = syg.nextLine().charAt(0);
        char x = syg.nextLine().charAt(0);

        int count = 0;

        for (char l1 = start; l1 <= end; l1++)
            for (char l2 = start; l2 <= end; l2++)
                for (char l3 = start; l3 <= end; l3++)
                    if (l1 != x && l2 != x && l3 != x) {
                        System.out.println(l1 +""+ l2 + ""+l3);
                        count++;
                    }
        System.out.println(count);

        syg.close();
    }
}
