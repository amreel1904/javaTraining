package day6;

import java.util.*;

public class specialBonus {

    public static void main(String[] args) {
		
		Scanner syg = new Scanner(System.in);

		        System.out.print("Enter the stop number: ");
		        int stopNumber = syg.nextInt();
		        int previousNumber = 0;

		        while (true) {
		            System.out.print("Enter an integer: ");
		            int number = syg.nextInt();
		            if (number == stopNumber) {
		                break;
		            }

		            previousNumber = number;
		        }

		        if (previousNumber != 0) {
		            double bonus = previousNumber * 0.2;
		            double result = previousNumber + bonus;
		            System.out.println("Result: " + result);
		        } else {
		            System.out.println("No previous number found.");
		       }	
               syg.close();			
	}

}