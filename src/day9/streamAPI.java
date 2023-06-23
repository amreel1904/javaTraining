package day9;

import java.util.Arrays;

public class streamAPI {

    public static void main(String[] args) {
        int[] numbers = {15, 25, 35};
        int min = Arrays.stream(numbers).min().getAsInt();
        System.out.println("The minimum number is: " + min);
    }
}
