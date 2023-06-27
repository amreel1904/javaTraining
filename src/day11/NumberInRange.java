package day11;


import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the range start: ");
        int start = scanner.nextInt();

        System.out.print("Enter the range end: ");
        int end = scanner.nextInt();

        System.out.print("Enter an integer within the range: ");
        int number = scanner.nextInt();

        while (number < start || number > end) {
            System.out.println("Invalid number: " + number);
            System.out.print("Enter an integer within the range: ");
            number = scanner.nextInt();
        }

        System.out.println("Valid number: " + number);
    }
}

/* private static int readNumberInRange(Scanner scanner, int start, int end){
while (true){
String line = scanner.nextLine();
try{
int num = Integer.parseInt(line);
if (num>= start && num<=end)
return num; //Valid number (in range)
} catch (Exception ex){
//Parse failed invalid number
}
System.out.println("Invalid number:" + line );
}}*/