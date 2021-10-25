package javase8.iWorkingWithSelectedClassesFromTheJavaAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

import static java.time.LocalTime.now;
import static java.util.List.of;

//Create and manipulate calendar data using classes from java.time.LocalDateTime,
// java.time.LocalDate, java.time.LocalTime, java.time.format.DateTimeFormatter, java.time.Period
public class Calendar {
    public static void main(String[] args) {
        System.out.println(now()); //yyyy-MM-dd
        System.out.println(LocalDate.now()); //HH:mm:ss.sss
        System.out.println(LocalTime.now()); //yyyy-mm-ddTHH:mm:ss.sss

        System.out.println(LocalDate.of(2016, 1, 1));
        System.out.println(LocalTime.of(1,1,1));  //24 hour, minutes, seconds, no timezone
        System.out.println(LocalDateTime.of(2016,1,1,1,1,1));  //date + time, no timezone

        LocalDate d = LocalDate.of(2016, Month.APRIL, 1);
        LocalTime t = LocalTime.of(23, 10, 10, 999);
        LocalDateTime dt = LocalDateTime.of(d, t);
        System.out.println(dt);
        System.out.println(LocalDate.of(2016, 3, 10).plusYears(1).plusMonths(1).plusDays(1));
        System.out.println(LocalDate.of(2016, 3, 10).minusYears(1).minusMonths(1).minusDays(1).minusWeeks(1));
        System.out.println(LocalTime.of(1,1,1).plusHours(1).plusMinutes(1).plusSeconds(1));
        System.out.println(LocalTime.of(1,1,1).minusHours(1).minusMinutes(1).minusSeconds(1).plusNanos(1));
        System.out.println(LocalTime.of(1,1,1).minusHours(1).minusMinutes(1).minusSeconds(1).minusNanos(1));
        System.out.println(LocalDateTime.now().minusYears(3).plusWeeks(3).minusHours(2).plusNanos(100));
    }
}
