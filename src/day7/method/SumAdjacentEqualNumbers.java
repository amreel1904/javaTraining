package day7.method;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
    	Scanner sy = new Scanner(System.in);
        List<Double> numbers = new Arrays.stream(sy.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        for (int i=0; i<numbers.size()-1;i++)
        	if (numbers.set(i,numbers.get(i)+(numbers.get(i+1))
       


       
    }
}
