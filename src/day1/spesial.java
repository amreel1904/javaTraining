package day1;

import java.util.Scanner;

public class spesial {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int num = 1; num <= n; num++) {
            int sum = 0;
            int digits = num;
            
            while (digits > 0) {
                sum += digits % 10;
                digits = digits / 10;
            
            if ((digits==0) && (sum==3)){
            	System.out.println(num + "True");	
            }
        
        scanner.close();
    }
}
}
}
