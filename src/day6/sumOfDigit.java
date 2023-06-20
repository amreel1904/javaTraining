package day6;
import java.util.Scanner;
public class sumOfDigit {
    public static void main(String[] args) {
        Scanner syg = new Scanner(System.in);

        while(true){
            String n = syg.nextLine();
            if (n.equals("end"))break;
            int sum=0;
            int input = Integer.parseInt(n);
            for(int num = input; num>0; num/=10)
            sum+=num%10;
            System.out.printf("Sum of digits: %d%n", sum);
        }
        System.out.println("Babaii");
        syg.close();
    }
    

}
