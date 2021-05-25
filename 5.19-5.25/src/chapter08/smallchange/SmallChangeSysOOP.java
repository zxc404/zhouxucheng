package chapter08.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOOP {

    String key = "";
    String note = "";
    String detail = "===========零钱通明细===========";
    double money = 0;
    double balance = 0;
    Date data = null;
    Scanner scanner;
    SimpleDateFormat sdf =
        new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public void run(){
        boolean loop =  true;
        do{
            switch (menu()){
                case "1":
                    show();
                    break;
                case "2":
                    input();
                    break;
                case "3":
                    output();
                    break;
                case "4":
                    loop = !out();
                    break;
                default:
                    System.out.println("输入错误");
            }
        }while(loop);
        System.out.println("零钱通已退出。");
    }

    public String menu(){
        System.out.println("===========菜单==========");
        System.out.println("\t\t1 零钱通明细");
        System.out.println("\t\t2 收益入账");
        System.out.println("\t\t3 消    费");
        System.out.println("\t\t4 退    出");
        System.out.print("请选择（1-4）: ");
        scanner = new Scanner(System.in);
        return scanner.next();
    }

    public void show(){
        System.out.println(detail);
    }

    public void input(){
        scanner = new Scanner(System.in);
        System.out.print("收益入账金额：");
        while(true) {
                money = scanner.nextDouble();
            if (money < 0) {
                System.out.print("输入收益为负，请重新输入:");
            }else break;
        }
        balance += money;
        data = new Date();
        detail += "\n收益入账\t+" + money +
                "\t" + sdf.format(data) + "\t" + balance;
    }

    public void output(){
        scanner = new Scanner(System.in);
        System.out.print("消费金额：");
        while(true) {
            money = scanner.nextDouble();
            if (money < 0) {
                System.out.print("输入消费为正，请重新输入:");
            } else if (money > balance) {
                System.out.print("消费超出存款，请重新输入:");
            }else break;
        }
        System.out.print("消费说明：");
        note = scanner.next();
        balance -= money;
        data = new Date();
        detail += "\n" + note + "\t-" + money +
                "\t" + sdf.format(data) + "\t" + balance;
    }

    public boolean out(){
        scanner = new Scanner(System.in);
        String str;
        while (true){
            System.out.print("确定退出吗(y/n)：");
            str = scanner.next();
            if(str.equalsIgnoreCase("y")||
                    str.equalsIgnoreCase("n")){
                break;
            }
        }
        if(str.equalsIgnoreCase("y")){
            return true;
        }else return false;
    }
}
