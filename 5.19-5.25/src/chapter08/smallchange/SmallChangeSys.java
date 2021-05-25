package chapter08.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Boolean loop = true;
        String key = "";
        String note = "";
        String detail = "===========零钱通明细===========";
        double money = 0;
        double balance = 0;
        Date data = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        do{
            System.out.println("===========菜单==========");
            System.out.println("\t\t1 零钱通明细");
            System.out.println("\t\t2 收益入账");
            System.out.println("\t\t3 消    费");
            System.out.println("\t\t4 退    出");
            System.out.print("请选择（1-4）: ");
            key = scanner.next();
            switch (key){
                case "1":
                    System.out.println(detail);
                    break;
                case "2":
                        System.out.print("收益入账金额：");
                    money = scanner.nextDouble();
                        if(money<0){
                            System.out.println("输入收益为负，请重新输入");
                            break;
                        }
                    balance += money;
                    data = new Date();
                    detail += "\n收益入账\t+" + money +
                            "\t" + sdf.format(data) + "\t" + balance;
                    break;
                case "3":

                        System.out.print("消费金额：");
                        money = scanner.nextDouble();
                        if(money<0){
                            System.out.println("输入消费为正，请重新输入");
                            break;
                        }else if(money>balance){
                            System.out.println("消费超出存款，请重新输入");
                            break;
                        }
                    System.out.print("消费说明：");
                    note = scanner.next();
                    balance -= money;
                    data = new Date();
                    detail += "\n" + note + "\t-" + money +
                            "\t" + sdf.format(data) + "\t" + balance;
                    break;
                case "4":
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
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("输入错误");
            }
        }while(loop);

        System.out.println("零钱通已退出。");
    }
}
