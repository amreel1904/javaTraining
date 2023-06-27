package day11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeEx {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();  // Get the current date
        System.out.println(date); // Sample output: 2021-12-07
        System.out.println(date.getYear()); // Sample output: 2021

        LocalTime time = LocalTime.now(); // Get the current time
        System.out.println(time); // Sample output: 20:21:10.768752500

        LocalDateTime dateAndTime = LocalDateTime.now();
        System.out.println(dateAndTime);
    }
}
