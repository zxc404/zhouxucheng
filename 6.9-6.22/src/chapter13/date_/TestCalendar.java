package chapter13.date_;

import java.util.Calendar;

/**
 * @author Zxc
 * @version 1.0
 */
public class TestCalendar {

    public static void main(String[] args) {

        Calendar ins= Calendar.getInstance();
        System.out.println(ins);
        System.out.println(ins.get(Calendar.YEAR));
        System.out.println(ins.get(Calendar.MONTH)+1);
        System.out.println(ins.get(Calendar.DAY_OF_MONTH));
        System.out.println(ins.get(Calendar.DAY_OF_WEEK));
        System.out.println(ins.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(ins.get(Calendar.HOUR_OF_DAY));
        System.out.println(ins.get(Calendar.HOUR));
        System.out.println(ins.get(Calendar.MINUTE));
    }
}
