package day5;

import java.util.*;

public class numberinRange {
    public static void main(String[] args) {
        Scanner sayang = new Scanner(System.in);

        int n = sayang.nextInt();
        while (n  <1 || n >100){

        
        n= sayang.nextInt();
        }
        System.out.println(n);

        sayang.close();
    }
}
