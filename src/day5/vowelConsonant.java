package day5;

import java.util.Scanner;

public class vowelConsonant {
    public static void main(String[] args) {
        Scanner sayang = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sayang.next().toLowerCase().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.print(ch +" is a vowel");
                break;
            default:
            System.out.print(ch + " is a consonant");

                // if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                // System.out.println(ch + " is a vowel.");
                // } else {
                // System.out.println(ch + " is a consonant.");
                // }

                sayang.close();
        }
    }
}
