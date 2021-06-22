package chapter13.homework03;

/**
 * @author Zxc
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {

        String name = "Dun shou Ai";
        printName(name);
    }

    public static void printName(String name){
        String[] s = name.split(" ");
        if(s.length!=3){
            System.out.println("输入字符串格式不正确");
            return;
        }

        String format = String.format("%s,%s .%c", s[2], s[0], s[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
