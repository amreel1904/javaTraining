package day7.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class printStringDotJoin {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("satu", "dua", "tiga", "empat", "lima"));
        System.out.printf(String.join("; ", list));
    }

}
