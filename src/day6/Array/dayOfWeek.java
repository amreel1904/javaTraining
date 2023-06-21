package day6.Array;

import java.util.*;

public class dayOfWeek {
    public static void main(String[] args) {
        Scanner syg = new Scanner(System.in);
        String[] days = { "Isnin", "Selasa", "Rabu", "Khamis", "Jumaat", "Sabtu", "Ahad" };

        int day=Integer.parseInt(syg.nextLine());
        if(day>=1&&day<=7)
        System.out.println(days[day-1]);
        else
System.out.println("Takdak!");
        syg.close();
    }
}
