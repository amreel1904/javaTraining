package day5;

import java.util.Scanner;

public class yesno {
    public static void main(String[] args) {
        Scanner sayang = new Scanner(System.in);

        String choice = sayang.nextLine(); switch(choice){
            case "Y":
            System.out.println("Yes");
            break;
            case "N":
            System.out.println("No");
            break;
            default:
            System.out.println("Invalid response");
            break;

        }
        

        sayang.close();
    }
}
