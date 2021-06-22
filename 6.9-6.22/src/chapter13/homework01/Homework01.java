package chapter13.homework01;

/**
 * @author Zxc
 * @version 1.0
 */
public class Homework01 {

    public static void main(String[] args) {

        String str = "(::)(::)(::)(::)";
        System.out.println(str);
        System.out.println(reverse(str,2,str.length()-1));
    }

    public static String reverse(String str,int start,int end){
        char[] ch = str.toCharArray();
        char temp;
        if(start>str.length()||end>str.length()){
            return "索引越界";
        }
        for(int i = end-start-1;i>=0;i--){
            int sta = start-1;
            for(int j=i;j>=0;j--){
                temp = ch[sta];
                ch[sta] = ch[++sta];
                ch[sta] = temp;
            }
        }
        return new String(ch);
    }
}
