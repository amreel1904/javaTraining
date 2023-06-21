package day7.method;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class delete {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>(Arrays.asList(
                2, 10, 5));

        for (int i = 0; i < num.size(); i++) {
            System.out.println(num.get(i));
        }
        num.remove(Integer.valueOf(10));
        System.out.println("\nCount: " + num.size());
    }
}
