package day7.method;

import java.util.List;
import java.util.ArrayList;

public class insert {
    public static void main(String[] args) {
        List<Object> nums = new ArrayList<>();

        // Add elements to the list
        nums.add(5);
        nums.add(10);
        nums.add(2);
        nums.add(3, -5);
        
        nums.add("Amreel");
        nums.remove(Integer.valueOf(10));
        // Get the count of elements in the list
        int count = nums.size();

        // Print the elements and the count
        for (Object element : nums) {
            System.out.println(element);
        }
        System.out.println("Count: " + count);

    }
}
