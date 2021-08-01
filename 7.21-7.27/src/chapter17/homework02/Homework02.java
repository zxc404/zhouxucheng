package chapter17.homework02;

import java.io.*;

/**
 * @author Zxc
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) throws IOException {

        String filePath = "E:\\repository\\java_learning\\7.21-7.27\\src\\chapter17\\homework02\\homework02.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line;
        int linenum=0;
        while ((line=bufferedReader.readLine())!=null){
            System.out.println(++linenum+line);
        }
        bufferedReader.close();
    }
}
