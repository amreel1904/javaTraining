package day5;

import java.util.*;

public class breakOperator {
    public static void main(String[] args) {
        Scanner sayang = new Scanner(System.in);

long sum = 0;
while (true){
    int nextNum = sayang.nextInt();
    if(nextNum ==0){
        break;
    }
    sum+=nextNum;
    System.out.println(sum);
}
        sayang.close();

    }
}