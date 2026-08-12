package chapter3;

import java.time.*;

public class DatesAndTimeLesson {
    public static void main(String[] args) {
        System.out.println(LocalTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());

        // Date with no time
        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);

        System.out.println(date1);
        System.out.println(date2);


        // Local Time
        LocalTime time1 = LocalTime.of(6, 15);
        LocalTime time2 = LocalTime.of(6, 15, 30);
        LocalTime time3 = LocalTime.of(6, 15, 30, 20);

        System.out.println("\n" + time1);
        System.out.println(time2);
        System.out.println(time3);

        // Local Date Time
        LocalDateTime ldt1 = LocalDateTime.of(2005, 6, 7, 6, 15);
        LocalDateTime ldt2 = LocalDateTime.of(date1, time1);

        System.out.println("\n" + ldt1);
        System.out.println(ldt2);

        // Date Plus or Date Minus - Years, Months, Weeks, Days
        System.out.println("\n" + date1.plusDays(40).minusWeeks(3));
        System.out.println(date1);

        // Time Plus or Time Minus - Hours, Minutes, Seconds, Nanos
        System.out.println("\n" + time1.plusHours(1).minusNanos(300));

        // DateTime Plus or DateTime Minus - Years, Months, Weeks, Days, Hours, Minutes, Seconds, Nanos
        System.out.println("\n" + ldt1.plusDays(21).plusHours(2));
    }
}
