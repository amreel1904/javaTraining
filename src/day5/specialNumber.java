package day5;

import java.util.Scanner;

public class specialNumber {
    public static void main(String[] args) {
        Scanner sayang = new Scanner(System.in);
        int num = sayang.nextInt();
        int numDigits = num;
        boolean isSpecial = true;
        while (numDigits > 0) {
            int digit = numDigits % 10;
            numDigits /= 10;
            if (digit != 0 && num % digit != 0) {
                isSpecial = false;
                break;
            }
        }
        System.out.println(numDigits);
        sayang.close();
    }
}
