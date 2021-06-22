package chapter13.date_;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Zxc
 * @version 1.0
 */
public class TestDate {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("日期：y-M-d HH:m:s");
        System.out.println(sdf.format(date));
    }
}
