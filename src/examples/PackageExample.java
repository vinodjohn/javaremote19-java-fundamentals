package examples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Random;

/**
 * Package examples
 *
 * @author Vinod John
 */
public class PackageExample {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println(random.nextInt());

        Date date = new Date();
        System.out.println(date);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate myBirthday = LocalDate.of(2022, 12, 18);
        System.out.println(myBirthday);

        LocalTime localTime = LocalTime.MIDNIGHT;
        System.out.println(localTime);
    }
}
