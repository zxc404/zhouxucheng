package chapter13.stringbuffer;

import java.util.Scanner;

/**
 * @author Zxc
 * @version 1.0
 */
public class StringBufferTest {

    public static void main(String[] args) {

        System.out.print("请输入数字：");
        String str = new Scanner(System.in).next();
        StringBuffer sb = new StringBuffer().append(str);
        int i = 0;
        i = sb.indexOf(".");
        if(i == -1){
            i = str.length();
            for(i -= 3; i > 0 ;i -= 3){
                sb.insert(i,",");
            }
        }else{
            for(i -= 3; i > 0 ;i -= 3){
                sb.insert(i,",");
            }
        }
        System.out.println(sb);
    }
}
