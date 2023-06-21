package day6;



public class nestedLoops {

    public static void main(String[] args) {
        int n = 80;
        int b =20;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= b; col++) {
                System.out.print(" \t*");
            }
            System.out.println("\n");
        }
        
    }
}