package chapter11.enum_;

/**
 * @author Zxc
 * @version 1.0
 */
public class Enumeration03 {
    public static void main(String[] args) {
        Week[] weeks = Week.values();
        for(Week week : weeks){
            System.out.println(week.toString());
        }
    }
}

enum Week{

    MONDAY("周一"),
    TUESDAY("周二"),
    WEDNESDAY("周三"),
    THURSDAY("周四"),
    FRIDAY("周五"),
    SATURDAY("周六"),
    SUNDAY("周日");

    private String name;

    private Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
