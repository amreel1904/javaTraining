package day7.method;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class add {
    public static void main(String[] arg) {
        List<Integer> num = new ArrayList<>(Arrays.asList(
                2, 3, 4, 5));

        num.add(12);
        num.add(9);

        for (int i = 0; i < num.size(); i++) {
            System.out.println(num.get(i));
        }
        System.out.println("\nCount: " + num.size());
    }
}
