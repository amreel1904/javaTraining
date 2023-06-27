package day11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateParseFormat {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2021-12-28");

        System.out.println("Date: " + date); // Date: 2021-12-28
        System.out.println("Date + 10 days: " + date.plusDays(10)); // Date + 10 days: 2022-01-07

        String dateInFullFormat = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(dateInFullFormat); // Tuesday, December 28, 2021

        String dateFormatted = date.format(DateTimeFormatter.ofPattern("dd-MMM-yy"));
        System.out.println(dateFormatted); // 28-Dec-21
    }
}
