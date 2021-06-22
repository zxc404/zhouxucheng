package chapter13.date_;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Zxc
 * @version 1.0
 */
public class TestLocalDateTime {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.getMinute());
        System.out.println(now.getDayOfYear());

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String time = dtf.format(now);
        System.out.println(time);
    }
}
