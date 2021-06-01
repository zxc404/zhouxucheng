package chapter11.enum_;

/**
 * @author Zxc
 * @version 1.0
 */
public class Enumeration02 {

    public static void main(String[] args) {

        System.out.println(SeasonEnum.SPRING);
        System.out.println(SeasonEnum.SUMMER);
        System.out.println(SeasonEnum.AUTUMN);
        System.out.println(SeasonEnum.WINTER);
        System.out.println(SeasonEnum.WHAT.ordinal());
        System.out.println(SeasonEnum.WINTER.ordinal());
        SeasonEnum[] seasonEnums = SeasonEnum.values();
        for(SeasonEnum season:seasonEnums){
            System.out.println(season);
        }
        System.out.println(SeasonEnum.valueOf("SUMMER"));

        System.out.println(SeasonEnum.WHAT.compareTo(SeasonEnum.WINTER));
    }
}

enum SeasonEnum{

    WHAT,
    SPRING("spring","warm"),
    SUMMER("summer","hot"),
    AUTUMN("autumn","cool"),
    WINTER("winter","cold");

    private String name;
    private String desc;

    private SeasonEnum(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    private SeasonEnum(){}

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "SeasonEnum{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
