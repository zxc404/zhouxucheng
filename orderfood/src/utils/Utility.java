package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Zxc
 * @version 1.0
 */

@SuppressWarnings({"all"})
public class Utility {

    /**
     * 功能：获取指定长度以内的字符串并返回。
     * @param limit 限制的长度
     * @param b 循环判断变量
     * @return 指定长度以内的字符串
     * @throws IOException
     */
    public static String readKeyBoard(int limit,boolean b) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        do{
            str = bufferedReader.readLine();
            if(str.length()>limit){
                System.out.print("输入有误，请重新输入（"+ limit+"字符）以内：");
            }else b=false;
        }while (b);
        return str;
    }

    /**
     * 功能：返回指定长度以内的字符串，若为空，则返回默认字符串。
     * @param limit 限制字符串的长度
     * @param defaultValue 默认值
     * @return 指定长度以内的字符串或默认值
     * @throws IOException
     */
    public static String readString(int limit,String defaultValue) throws IOException {
        String str = readKeyBoard(limit,true);
        return str.length()==0?defaultValue:str;
    }

    /**
     * 功能：返回键盘输入的整型数据。
     * @return
     */
    public static int readInt(){
        return new Scanner(System.in).nextInt();
    }



    /**
     * 功能：指定选择1/2
     * @return  1或2
     * @throws IOException
     */
    public static String choice$12() throws IOException {
        System.out.print("请输入你的选择（1/2）：");
        String choice ;
        do{
            choice = readString(1);
            if(choice.equalsIgnoreCase("1")||
                    choice.equalsIgnoreCase("2")){
                return choice;
            }

        }while(true);
    }

    /**
     * 功能：指定选择1/2/3
     * @return  1或2或3
     * @throws IOException
     */
    public static String choice$123() throws IOException {
        System.out.print("请输入你的选择（1/2/3）：");
        String choice ;
        do{
            choice = readString(1);
            if(choice.equalsIgnoreCase("1")||
                    choice.equalsIgnoreCase("2")||
                    choice.equalsIgnoreCase("3")){
                return choice;
            }

        }while(true);
    }

    /**
     * 功能：指定选择1/2/3/4
     * @return  1或2或3或4
     * @throws IOException
     */
    public static String choice$1234() throws IOException {
        System.out.print("请输入你的选择（1/2/3/4）：");
        String choice ;
        do{
            choice = readString(1);
            if(choice.equalsIgnoreCase("1")||
                    choice.equalsIgnoreCase("2")||
                    choice.equalsIgnoreCase("3")||
                    choice.equalsIgnoreCase("4")){
                return choice;
            }

        }while(true);
    }

    /**
     * 功能：指定选择0/1/2
     * @return  0或1或2
     * @throws IOException
     */
    public static String choice$012() throws IOException {
        System.out.print("请输入你的选择（0/1/2）：");
        String choice ;
        do{
            choice = readString(1);
            if(choice.equalsIgnoreCase("1")||
                    choice.equalsIgnoreCase("2")||
                    choice.equalsIgnoreCase("0")){
                return choice;
            }

        }while(true);
    }

    /**
     * 功能：指定选择1/2/3/0
     * @return  1或2或3或-1
     * @throws IOException
     */
    public static String choice$0123() throws IOException {
        String choice ;
        do{
            choice = readString(1);
            if(choice.equals("1")|| choice.equals("2")
                    || choice.equals("3")|| choice.equals("0")){
                return choice;
            }

        }while(true);
    }

    /**
     * 功能：指定选择Y/N
     * @return  Y或N
     * @throws IOException
     */
    public static String choice$YN() throws IOException {
        System.out.print("请输入你的选择（Y/N）：");
        String choice ;
        do{
            choice = readString(1);
            if(choice.equalsIgnoreCase("y")||
                    choice.equalsIgnoreCase("n")){
                return choice;
            }

        }while(true);
    }

    /**
     * 功能：返回键盘输入的double型常量
     * @return double数据
     */
    public static double readDouble(){
        return   new Scanner(System.in).nextDouble();
    }

    /**
     * 功能：获取非负double数据
     * @return  非负double数据
     */
    public static double read$0Double(){
        Scanner scanner = new Scanner(System.in);
        double readDouble_;
        do{
            readDouble_=scanner.nextDouble();
            if (readDouble_>=0){
                return readDouble_;
            }
            System.out.print("非法输入，请重新输入：");
        }while (true);
    }

    /**
     * 功能：无默认值返回键盘输入的字符串，限制字符串长度。
     * @param limit 限制值
     * @return  限制值内的字符串
     * @throws IOException
     */
    public static String readString(int limit) throws IOException {
        String str = readKeyBoard(limit,true);
        return str;
    }

    /**
     * 功能：返回字符型常量，若为空，则返回默认字符串。
     * @param defaultValue 默认字符常量
     * @return 字符
     * @throws IOException
     */
    public static char readChar(char defaultValue) throws IOException {
        String str = readKeyBoard(1,true);
        return str.length()==0?defaultValue:str.charAt(0);
    }

    /**
     * 功能：返回键盘输入的字符常量
     * @return  字符型数据
     * @throws IOException
     */
    public static char readChar() throws IOException {
        String str = readKeyBoard(1,true);
        return str.charAt(0);
    }

    /**
     * 功能：指定输入为（Y/N），不区分大小写，否则循环提示输入错误，无输入则默认为N。
     * @return  Y或者N，无输入则默认为N
     * @throws IOException
     */
    public static String readConfirmSelection() throws IOException {
        System.out.print("请输入你的选择（Y/N）：");
        for(; ; ){
            String str = readString(1,"N");
            if(str.equalsIgnoreCase("Y")||
                    str.equalsIgnoreCase("N")){
                return str;
            }else{
                System.out.print("输入错误，请重新输入（Y/N）：");
            }
        }
    }

    public static String confirmSelection() throws IOException {
        for(; ; ){
            String str = readString(1,"N");
            if(str.equalsIgnoreCase("Y")||
                    str.equalsIgnoreCase("N")){
                return str;
            }else{
                System.out.print("输入错误，请重新输入（Y/N）：");
            }
        }
    }
}
