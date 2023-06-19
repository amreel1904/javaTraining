package day5;

import java.util.*;

public class addbonus {
    public static void main(String[] args) {
        Scanner sayang = new Scanner(System.in);
        int point=0;
        point = sayang.nextInt();
        
        if(point>=0 && point<4)
        point=point+5;

        else if(point>=4 && point<7)
        point=+15;

        else if(point>=7 && point<10)
        point=+20;
        System.out.println(point);
        sayang.close();
    }
}
