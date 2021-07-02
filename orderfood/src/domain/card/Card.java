package domain.card;

/**
 * @author Zxc
 * @version 1.0
 */
public class Card {
    private static int num = 12138;
    private int idNUm;
    private String name;
    private String phone;
    private double balance;
    private double discount;
    private Kind kind;
    private Card card;

    private Card(String name, String phone, double balance,Kind kind) {
        this.idNUm = num++;
        this.name = name;
        this.phone = phone;
        this.balance = balance;
        this.kind = kind;
        switch (kind) {
            case NORMAL:
                discount = 9.0;
                break;
            case SILVER:
                discount = 8.0;
                break;
            case GOLD:
                discount = 7.0;
            default:
                break;
        }
    }
    public static Card getCard(String name, String phone, double balance){
        Kind preKind = null;
        if(balance>=500&&balance<800){
            preKind = Kind.NORMAL;
        }else if(balance>=800&&balance<1000){
            preKind = Kind.SILVER;
        }else if(balance>=1000){
            preKind = Kind.GOLD;
        }
        return new Card(name,phone,balance,preKind);
    }

    public void insertBalance(double money) {
        if (money >= 800 && money < 1000 && (this.kind == Kind.NORMAL)) {
            this.kind = Kind.SILVER;
        } else if (money >= 1000 && ((this.kind == Kind.NORMAL) || (this.kind == Kind.SILVER))) {
            this.kind = Kind.GOLD;
        }
        this.balance += money;
    }

    public double getDiscount() {
        return discount;
    }

    public static int getNum() {
        return num;
    }

    public int getIdNUm() {
        return idNUm;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public double getBalance() {
        return balance;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "ID：" + idNUm +
                ", 持卡人：" + name +
                ", 电话：" + phone  +
                ", 余额：" + balance +
                ", 类别：" + kind;
    }
}
enum Kind{
    GOLD,SILVER,NORMAL;
}