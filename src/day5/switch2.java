package day5;

import java.util.Scanner;

public class switch2 {

    public static void main(String[] args) {
        Scanner sayang = new Scanner(System.in);

        String animal = sayang.nextLine();
        switch (animal){
            case "anjeng":
            case "kuceng":
            System.out.println("mamalia");
            break;
            default:
            System.out.println("tah ler");
            break;
        }

        sayang.close();
    }
}
