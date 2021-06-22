package chapter13.date_;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

/**
 * @author Zxc
 * @version 1.0
 */
public class TestInstance {

    public static void main(String[] args) {

        Instant now = Instant.now();
        System.out.println(now);
        Date date = Date.from(now);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-M-dd");
        System.out.println(simpleDateFormat.format(date));
    }
}
