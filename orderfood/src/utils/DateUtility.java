package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Zxc
 * @version 1.0
 */
public class DateUtility {

    public static String getDateymdhms(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("日期：y-M-d HH:m:s");
        return sdf.format(date);
    }
}
