package day5;

import java.util.Scanner;

public class fruitOrVege {

    public static void main(String[] args) {
        Scanner sayang = new Scanner(System.in);

        String food = sayang.nextLine();
        switch (food){
            case "apple":
            case "cili":
            System.out.println("makanan");
            break;
            
                case "timun":
                case "karet":
                System.out.println("sayur");
                break;
            }

        sayang.close();
    }
}
