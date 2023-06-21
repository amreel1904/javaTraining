package day7.list;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class readList {
    public static void main(String[] args) {
        Scanner sayang = new Scanner(System.in);
        int n = Integer.parseInt(sayang.nextLine());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(sayang.nextLine());
            list.add(number);
        }

    }

}
