package chapter17.fileoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Zxc
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        String filePath = "E:\\repository\\java_learning\\7.7-7.20\\news02.txt";
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream= new FileOutputStream(filePath);
            String str = "hello";
            byte[] buff = str.getBytes();
            fileOutputStream.write(buff);
            FileOutputStream fileOutputStream1 = new FileOutputStream(filePath, true);
            fileOutputStream1.write(",world".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
