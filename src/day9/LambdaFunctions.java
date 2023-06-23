package day9;

import java.util.function.Function;

public class LambdaFunctions {
    static Function<Integer, Integer> func = x -> x / 2;

    public static void main(String[] args) {
        int result = func.apply(120);
        System.out.println(result);
    }
}
