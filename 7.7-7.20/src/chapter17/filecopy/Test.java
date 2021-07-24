package chapter17.filecopy;

import java.io.*;

/**
 * @author Zxc
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            new File("E:\\repository\\java_learning\\7.7-7.20\\news01.txt").createNewFile();
            String decfilePath = "E:\\repository\\java_learning\\7.7-7.20\\news01.txt";
            String filePath = "E:\\repository\\java_learning\\7.7-7.20\\news02.txt";
            fileInputStream = new FileInputStream(filePath);
            fileOutputStream = new FileOutputStream(decfilePath);
            byte[] buff = new byte[100];
            int read = 0;
            while ((read =fileInputStream.read(buff))!=-1){
                fileOutputStream.write(buff);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
