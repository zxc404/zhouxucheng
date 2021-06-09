package chapter12.trycatch02;

import java.util.Scanner;

/**
 * @author Zxc
 * @version 1.0
 */
public class TestReadString {

    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        for(;;){
            try {
                System.out.print("请输入整数：");
                num = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入错误");
            }
        }
        System.out.println(num);
    }
}
