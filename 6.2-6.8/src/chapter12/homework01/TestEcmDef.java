package chapter12.homework01;

import java.util.Scanner;

/**
 * @author Zxc
 * @version 1.0
 */
public class TestEcmDef {

//    编写应用程序EcmDef.java，接收命令行输入的两个参数（整数）
//    极速单两数相除，要求使用方法cal(int n1,int n2)
//    对数据格式不正确、缺少命令行参数，除0进行异常处理
    public static void main(String[] args) {

        int n1,n2;
        Scanner scanner = new Scanner(System.in);
        while (true) {

            try {
                System.out.print("n1 = ");
                n1 = Integer.parseInt(scanner.next());
                System.out.print("n2 = ");
                n2 = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入错误，重新输入。");
            }

        }

        try {
            System.out.println(n1 + "/" + n2 + "=" + Calc.cal(n1, n2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static class Calc{

        public static double cal(int n1,int n2){
            try {
                int p = n1/n2;
                return ((double)n1)/(double) n2;
            } catch (Exception e) {
                throw new CalException("除数为0,非法计算。");
            }
        }
    }
}

class CalException extends RuntimeException{
    public CalException(String message) {
        super(message);
    }
}
