package day7.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class printListForLoop {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(
                Arrays.asList("satu", "dua", "tiga", "empat", "lima"));
        for (int index = 0; index < list.size(); index++) {
            System.out.printf("arr [%d] = %s%n", index, list.get(index));
        }
    }
}
