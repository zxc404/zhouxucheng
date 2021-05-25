package chapter09.houserent.utils;

import java.util.Scanner;

public class Utility {

    /**
     * 功能：读取键盘输入的字符串并限制长度，若直接回车则返回默认值
     * @param limit 限制的长度
     * @param defaultValue 默认字符串
     * @return 指定长度的字符串
     */
    public static String readString(int limit,String defaultValue){
        String str = readKeyBoard(limit,true);
        return str.length()==0?defaultValue:str;
    }

    public static String readKeyBoard(int limit,boolean b){

        Scanner scanner = new Scanner(System.in);
        String string;
        do{
                string = scanner.next();
           if(string.length()>=0&&string.length()<=limit){
                b=false;
            }else{
               System.out.print("输入错误，请重新输入(长度为" + limit + "以内)：");
           }
        }while (b);

        return string;
    }

    /**
     * 功能：判断输入是否是char型数据类型，调用readString方法
     * @return 指定为char型数据
     */
    public static char readChar(){
        return readString(1,"6").charAt(0);
    }
}
