package chapter09.houserent.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Utility{

    /**
     * 功能：返回随意长度的整型数据
     * @return  整型数据
     */
    public static int readInt(){
        return new Scanner(System.in).nextInt();
    }

    /**
     * 功能：读取键盘输入的字符串并限制长度，若直接回车则返回默认值。
     * @param limit 限制的长度
     * @param defaultValue 默认字符串
     * @return 指定长度的字符串或默认值
     * @throws IOException
     */
    public static String readString(int limit,String defaultValue) throws IOException {
        String str = readKeyBoard(limit,true);
        return str.length()==0?defaultValue:str;
    }

    /**
     * 功能：限制输入字符的长度，但回车不赋予默认值
     * @param limit 限制字符的长度
     * @return  返回指定长度范围的字符串
     * @throws IOException
     */
    public static String readString(int limit) throws IOException {
        String str = readKeyBoard(limit,true);
        return str;
    }

    /**
     * 功能：被readString方法调用，完成限制长度功能
     * @param limit 限制的长度
     * @param b 循环判断体
     * @return  返回指定长度的字符串
     * @throws IOException
     */
    public static String readKeyBoard(int limit,boolean b) throws IOException {
    /**
     * 特点：使用BufferedReader类进行扫描输入，构造器为InputStreamReader(System.in)
     *      可以对回车和换行进行识别，但需要抛出IO异常
     *
    */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String string = "";
        do{
                string = bf.readLine();
           if(string.length()<=limit){
                b=false;
            }else{
               System.out.print("输入错误，请重新输入(长度不超过"
                       + limit + ")：");
           }
        }while (b);

        return string;
    }

    /**
     * 功能：判断输入是否是char型数据类型，调用readString方法，
     *      返回默认值为6，即是系统中的退出项。
     * @return 指定为char型数据
     * @throws IOException
     */
    public static char readChar() throws IOException {
        return readString(1,"6").charAt(0);
    }

    /**
     * 功能：输入一个默认字符，当用户直接回车时，返回默认值。
     * @param charDefaultValue 默认字符
     * @return 指定为char型数据
     * @throws IOException
     */
    public static char readChar(char charDefaultValue) throws IOException {
        String defaultValue = charDefaultValue + "";
        return readString(1,defaultValue).charAt(0);
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
}
