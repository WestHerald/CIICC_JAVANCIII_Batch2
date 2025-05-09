package chapt3_1;
import java.time.*;

public class DateAndTimeLesson {
    public static void main(String[] args) {
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.of(9, 11, 24));
        LocalDate date1 = LocalDate.of(2002, 4, 24);
        System.out.println(date1);
        System.out.println(LocalDate.of(2002, Month.APRIL, 24));
        LocalTime time1 = LocalTime.of(9, 11, 42, 69000000);
        System.out.println(time1);
        LocalDateTime ldt1 = LocalDateTime.of(2002, 4, 24, 0, 6, 9);
        LocalDateTime ldt2 = LocalDateTime.of(date1, time1);
        System.out.println(ldt1);
        System.out.println(ldt2);
        System.out.println(date1.plusDays(2).minusWeeks(1));
        Period age = Period.between(date1, LocalDate.now());
        System.out.println(age.toTotalMonths());
    }
    
}