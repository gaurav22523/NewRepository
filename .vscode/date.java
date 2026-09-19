import java.time.*;
public class date{
    public static void main(String[] args) {
        LocalDate n=LocalDate.now();
        System.out.println(n);

        LocalTime p=LocalTime.now();
        System.out.println(p);

        LocalDateTime t=LocalDateTime.now();
        System.out.println(t);

    }
}