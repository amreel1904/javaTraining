package day7.list;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class readListSingleLine {
    public static void main(String[] args) {
        Scanner sayang = new Scanner(System.in);

        String values = sayang.nextLine();

        List<String> items = Arrays.stream(values.split(" ")).collect(Collectors.toList());
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            nums.add(Integer.parseInt(items.get(i)));
        }
        System.out.println(nums);
        
        sayang.close();
    }
}