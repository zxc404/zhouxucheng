package chapter15.Exercise01;

/**
 * @author Zxc
 * @version 1.0
 */
public class MyDate {

    private String month;
    private String day;
    private String year;

    public MyDate(int month, int day, int year) {
        this.month = month+"月";
        this.day = day+"日";
        this.year = year+"年";
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }

    public String getYear() {
        return year;
    }

    public void setMonth(int month) {
        this.month = month+"月";
    }

    public void setDay(int day) {
        this.day = day+"日";
    }

    public void setYear(int year) {
        this.year = year+"年";
    }

    @Override
    public String toString() {
        return  year + month +day;
    }
}
