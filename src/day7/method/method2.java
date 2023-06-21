package day7.method;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class method2 {
    public static void main(String[] args) {
        List<Integer> sayang = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
        sayang.remove(2);
        sayang.remove(Integer.valueOf(30));
        sayang.add(100);
        sayang.add(0, -100);
        for (int i = 0; i < sayang.size(); i++)
            System.out.println(sayang.get(i) + " ");
    }

}
