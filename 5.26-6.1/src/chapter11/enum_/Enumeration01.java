package chapter11.enum_;

/**
 * @author  Zxc
 * @version 1.0
 */
public class Enumeration01 {
    public static void main(String[] args) {

//        Season spring = new Season("spring", "warm");
//        Season summer = new Season("summer", "hot");
//        Season autumn = new Season("autumn", "cool");
//        Season winter = new Season("winter", "cold");
        Season autumn = Season.AUTUMN;

    }
}

class Season{
    private String name;
    private String desc;

//    public Season(String name, String desc) {
//        this.name = name;
//        this.desc = desc;
//    }

    public final static Season SPRING = new Season("spring", "warm");
    public final static Season SUMMER = new Season("summer", "hot");
    public final static Season AUTUMN = new Season("autumn", "cool");
    public final static Season WINTER = new Season("winter", "cold");

    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setDesc(String desc) {
//        this.desc = desc;
//    }
}
