package day5;

import java.util.*;

public class makananOr {
    public static void main(String[] args) {
        Scanner sayang = new Scanner(System.in);

        System.out.print("Enter a food or drink: ");
        String makan = sayang.nextLine().toLowerCase();
        String minum = sayang.nextLine().toLowerCase();

        String kategori;
        if (sayang.equals("kari") || sayang.equals("mee") || sayang.equals("sushi") || sayang.equals("ayam")) {
            kategori = "food";
        } else if (sayang.equals("teh") || sayang.equals("air") || sayang.equals("kopi")) {
            kategori = "drink";
        } else {
            kategori = "unknown";
        }

        System.out.println("Category: " + kategori);
        sayang.close();
        ;
    }
}
