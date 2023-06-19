package day5;

import java.util.Scanner;

public class dayOfWeek {

    public static void main(String[] args) {
        Scanner sayang = new Scanner(System.in);

        int day = sayang.nextInt();
        switch (day){
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            default: System.out.println("error");
            break;
    
        }
        sayang.close();
    }
}